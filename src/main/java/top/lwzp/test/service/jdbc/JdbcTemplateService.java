package top.lwzp.test.service.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import top.lwzp.test.service.mapper.NewsClobMapper;
import top.lwzp.test.vo.NewsClobVo;

import java.util.List;
import java.util.Map;

@Service
public class JdbcTemplateService {
    @Autowired
    private NewsClobMapper newsClobMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void testAdd(){
        jdbcTemplate.execute("INSERT INTO tn_news_clob(news_id,attribute_name,attribute_value) VALUES('-1','OK','good')");

    }

    public void testDel(){
        jdbcTemplate.execute("DELETE FROM tn_news_clob WHERE news_id='-1'");
    }

    public void testUpdate(){
        jdbcTemplate.execute("UPDATE tn_news_clob SET attribute_value='0' WHERE news_id='100107739' AND attribute_name='allow_comment'");
    }

    public int testUpdateForCount(){
        int count = jdbcTemplate.update("INSERT INTO tn_news_clob(news_id,attribute_name,attribute_value) VALUES(?,?,?)","-1","OK","good");
        return count;
    }

    public List<Map<String, Object>> testQueryForList(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM tn_news_clob WHERE news_id=?", "100107739");
        list.stream().forEach(stringObjectMap -> {
            System.out.println(stringObjectMap.get("news_id"));
            System.out.println(stringObjectMap.get("attribute_name"));
            System.out.println(stringObjectMap.get("attribute_value"));
            System.out.println("====================哥哥哥---------------------");
        });
        return list;
    }

    public List<NewsClobVo> testQueryVoList(){
        List<NewsClobVo> list = jdbcTemplate.query("SELECT * FROM tn_news_clob WHERE news_id=?",newsClobMapper,"100107739");
        list.stream().forEach(newsClobVo -> {
            System.out.println(newsClobVo.getNewsId());
            System.out.println(newsClobVo.getAttrName());
            System.out.println(newsClobVo.getAttrValue());
            System.out.println("over--------------------------");
        });
        return list;
    }
}
