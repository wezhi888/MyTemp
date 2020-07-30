package test.service.jdbc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.lwzp.test.HelloSpringBoot;
import top.lwzp.test.service.jdbc.JdbcTemplateService;

@SpringBootTest(classes = HelloSpringBoot.class)
@RunWith(SpringRunner.class)
public class JdbcTemplateServiceTest {
    @Autowired
    private JdbcTemplateService jdbcTemplateService;

    @Before
    public void init(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void testJdbcTemplateTest(){
//        jdbcTemplateService.testAdd();
//        jdbcTemplateService.testDel();
//        jdbcTemplateService.testUpdate();
//        jdbcTemplateService.testQueryForList();
        jdbcTemplateService.testQueryVoList();
    }
}
