package top.lwzp.test.service.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerTask {
    @Scheduled(cron = "*/5 * * * * ?")
    private void task(){
        System.out.println(System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 36000000)
    private void taskFixedDelay(){
        System.out.println("定时任务执行中");
    }
    @Scheduled(fixedRate = 36000000)
    private void taskFixedRate(){
        System.out.println("定时任务");
    }
}
