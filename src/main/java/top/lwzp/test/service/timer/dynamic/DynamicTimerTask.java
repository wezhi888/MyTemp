package top.lwzp.test.service.timer.dynamic;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

@Configuration
public class DynamicTimerTask implements SchedulingConfigurer {
    private static int i;
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        String cron = "*/i * * * * ?";
        cron = cron.replace("i",++i + "");
        System.out.println(i);
        String finalCron = cron;
        scheduledTaskRegistrar.addTriggerTask(getRunable(), triggerContext -> new CronTrigger(finalCron).nextExecutionTime(triggerContext));
    }

    private Runnable getRunable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(111);
            }
        };
    }
}
