package top.lwzp.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.concurrent.ScheduledFuture;

@RestController
public class DynamicTimerTaskController {
    private ScheduledFuture<?> future;

    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
    @Autowired
    public void setThreadPoolTaskScheduler(ThreadPoolTaskScheduler threadPoolTaskScheduler) {
        this.threadPoolTaskScheduler = threadPoolTaskScheduler;
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        return new ThreadPoolTaskScheduler();
    }

    @RequestMapping("/startCron")
    public String startCron(){
        /**
         * 简单测试，所以只维护了一个ScheduledFuture对象，
         * 每次接口请求都操作这个对象。
         * 所以开启定时任务之前，先关闭之前可能启动的任务。
         */
        stop();
        future = threadPoolTaskScheduler.schedule(new TestRunner(), new CronTrigger("*/5 * * * * ?"));
        return "{\"msg\":\"start success\"}";
    }

    @RequestMapping("/stopCron")
    public String stopCron(){
        stop();
        return "{\"msg\":\"stop success\"}";
    }

    private void stop() {
        if (future != null){
            //参数表示是否终止正在执行的任务
            future.cancel(false);
        }
    }

    /**
     * 执行定时任务具体业务的线程类
     */
    private class TestRunner implements Runnable{
        @Override
        public void run() {
            System.out.println("runner run, " + Instant.now());
        }
    }
}
