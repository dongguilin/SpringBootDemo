package demo.boot.hello.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by DONGGUILIN on 2018/4/11.
 */
@Component
public class TaskService2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskService2.class);

    @Scheduled(initialDelay = 1000, fixedRate = 1000 * 5)
    public void task2() {
        long startTime = System.currentTimeMillis();
        LOGGER.info("TaskService2 begin...");
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("TaskService2 tookTime:" + (System.currentTimeMillis() - startTime));
    }
}
