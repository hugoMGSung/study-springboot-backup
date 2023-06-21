package com.example.springbootscheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
 
    private int count = 0;

    // 5초 마다
    @Scheduled(cron = "*/5 * * * * ?")
    private void process() {
        System.out.println("This is scheduler task running " + count++);
    }
}
