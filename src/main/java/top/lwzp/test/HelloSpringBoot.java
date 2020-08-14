package top.lwzp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
@RestController
@EnableAsync
public class HelloSpringBoot {
    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBoot.class,args);
    }
}
