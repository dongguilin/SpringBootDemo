package demo.boot.hello.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by DONGGUILIN on 2018/4/11.
 */
@Component
public class TaskService1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskService1.class);

    @Autowired
    private TaskScheduler scheduler;

    @Scheduled(initialDelay = 1000, fixedRate = 1000 * 5)
    public void task1() {
        long startTime = System.currentTimeMillis();
        LOGGER.info("TaskService1 begin...");

        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                LOGGER.info("((((((((((((");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LOGGER.info("))))))))))))");
            }
        }, new Date());


        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(20));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("TaskService1 tookTime:" + (System.currentTimeMillis() - startTime));
    }

    @Async
    private void async() {
        LOGGER.info("((((((((((((");
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("))))))))))))");
    }
}
