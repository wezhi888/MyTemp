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
        SpringUtil.getBean(JdbcTemplateService.class).testQueryForList();
//        System.out.println(SpringUtil.getBean(StringEncryptor.class).encrypt("root"));
//        System.out.println(SpringUtil.getBean(StringEncryptor.class).encrypt("1234qwer"));
//        System.out.println(SpringUtil.getBean(StringEncryptor.class).decrypt("aj8tz5CZw+Xcqfc2nEwjHA=="));
        System.exit(0);
//        try {
//            RestTemplate restTemplate = SpringUtil.getBean(RestTemplate.class);
//            String url = "http://localhost:8080/post";
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
////            ObjectMapper mapper = new ObjectMapper();
////            ObjectNode objectNode = mapper.createObjectNode();
////            objectNode.put("name","zhangsan");
////            objectNode.put("age",30);
////            HttpEntity<String> request = new HttpEntity<>(objectNode.toString(),headers);
////            ResponseEntity<String> entity = restTemplate.exchange(url,HttpMethod.POST,request,String.class);
//
//
//            MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
//            map.add("name","sansan");
//            map.add("age","78");
//            HttpEntity<MultiValueMap<String,String>> he = new HttpEntity<>(map,headers);
//            ResponseEntity<String> entity = restTemplate.exchange(url,HttpMethod.POST,he,String.class);
//
//            System.out.println(entity.getBody() + "--------------");
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            System.exit(0);
//        }


    }
}
