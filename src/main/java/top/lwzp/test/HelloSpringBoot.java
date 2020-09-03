package top.lwzp.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        try {
            /*
            获取RestTemplateService类中定义的restTemplate bean
            如果RestTemplate没有交给Spring托管，也可以用new获取对象
            */
            RestTemplate restTemplate = SpringUtil.getBean(RestTemplate.class);
            String url = "http://localhost:8080/post?pa=sss";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
            params.add("name","王五");
            params.add("age","21");
            HttpEntity<MultiValueMap<String,String>> request = new HttpEntity<>(params,headers);
            ResponseEntity<String> entity = restTemplate.postForEntity(url,request,String.class,params);
            HttpStatus statusCode = entity.getStatusCode();
            System.out.println(entity.getBody());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.exit(0);
        }


    }
}
