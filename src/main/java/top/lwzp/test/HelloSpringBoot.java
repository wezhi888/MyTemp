package top.lwzp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.lwzp.test.vo.JsonTestVo;

//@EnableScheduling
//@EnableAsync
@SpringBootApplication
public class HelloSpringBoot {
    private static final Logger logger = LoggerFactory.getLogger(HelloSpringBoot.class);
    public static void main(String[] args) {
        //启动SpringBoot
        SpringApplication.run(HelloSpringBoot.class,args);
        logger.info("logger{} debug{}","good","date");
    }
}
