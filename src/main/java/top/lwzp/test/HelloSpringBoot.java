package top.lwzp.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.lwzp.test.service.jdbc.JdbcTemplateService;
import top.lwzp.test.service.rest_template.RestTemplateService;
import top.lwzp.test.service.spring.SpringUtil;
import top.lwzp.test.vo.RestTemplateTestVo;

import javax.swing.*;

@SpringBootApplication
//@EnableScheduling
//@EnableAsync
public class HelloSpringBoot {
    public static void main(String[] args) {
        //启动SpringBoot
        SpringApplication.run(HelloSpringBoot.class,args);
    }
}
