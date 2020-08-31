package top.lwzp.test.service.timer.dynamic;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.time.Instant;

@Configuration
public class DynamicTimerTask implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(getRunable(), triggerContext -> new CronTrigger(getCron()).nextExecutionTime(triggerContext));
    }

    private String getCron() {
        String cron = "*/5 * * * * ?";
        return cron;
    }

    private Runnable getRunable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(Instant.now());
            }
        };
    }
}
