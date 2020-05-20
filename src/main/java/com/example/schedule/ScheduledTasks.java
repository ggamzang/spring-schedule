package com.example.schedule;

import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log
public class ScheduledTasks {

    @Scheduled(fixedDelay = 10000)
    public void runEvery10Sec(){
        log.info("runEvery10Sec");
    }

    @Scheduled(cron = "0 0 17 * * *")
    public void runAt9EveryDay(){
        log.info("runAt5EveryDay");
    }

}
