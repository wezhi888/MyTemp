package top.lwzp.test.service.timer.dynamic;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class DynamicTimerTask implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addCronTask(new CronTask(getRunable(),"*/5 * * * * ?"));
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
