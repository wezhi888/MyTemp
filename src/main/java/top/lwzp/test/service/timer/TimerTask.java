package top.lwzp.test.service.timer;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@EnableScheduling
public class TimerTask {
    @Scheduled(cron = "*/5 * * * * ?")
    private void task(){
        System.out.println(Thread.currentThread().getId() + " --- " + Thread.currentThread().getName());
        System.out.println(System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 36000000)
    private void taskFixedDelay(){
        System.out.println("上一次执行完成之后，间隔若干时间再次执行！");
        System.out.println(Thread.currentThread().getId() + " --- " + Thread.currentThread().getName());
    }
    @Scheduled(fixedRate = 36000000)
    private void taskFixedRate(){
        System.out.println("上一次执行开始之后，间隔若干时间再次执行！");
        System.out.println(Thread.currentThread().getId() + " --- " + Thread.currentThread().getName());
    }
    @Scheduled(initialDelay = 10000,fixedDelay = 36000000)
    private void taskDelayStart(){
        System.out.println("第一次在启动之后若干时间之后执行，然后在每次执行完成之后间隔若干时间再次执行！");
        System.out.println(Thread.currentThread().getId() + " --- " + Thread.currentThread().getName());
    }
}
