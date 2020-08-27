package top.lwzp.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lwzp.test.service.rest_template.RestTemplateService;
import top.lwzp.test.service.spring.SpringUtil;

import javax.swing.*;

@SpringBootApplication
@RestController
@EnableAsync
public class HelloSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBoot.class,args);
        RestTemplateService re = SpringUtil.getBean(RestTemplateService.class);
        String s = re.get("http://center.hub.tjyun.com/enorth-screen/r/screen_api/v1.0/api/centralMedia", null);
        System.out.println(s);
    }
}
