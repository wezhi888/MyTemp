package top.lwzp.test.service.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import top.lwzp.test.vo.NewsClobVo;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class NewsClobMapper implements RowMapper<NewsClobVo> {
    @Override
    public NewsClobVo mapRow(ResultSet resultSet, int i) throws SQLException {
        NewsClobVo ncv = new NewsClobVo();
        ncv.setNewsId(resultSet.getString("news_id"));
        ncv.setAttrName(resultSet.getString("attribute_name"));
        ncv.setAttrValue(resultSet.getString("attribute_value"));
        return ncv;
    }
}
