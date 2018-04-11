package demo.boot.hello;

import demo.boot.hello.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * Created by guilin1 on 15/12/9.
 */
@SpringBootApplication
@EnableScheduling
public class SampleSimpleApplication implements CommandLineRunner {


    // Simple example shows how a command line spring application can execute an
    // injected bean service. Also demonstrates how you can use @Value to inject
    // command line args ('--name=whatever') or application properties

    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public void run(String... args) {
        System.out.println(this.helloWorldService.getHelloMessage());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(
                SampleSimpleApplication.class);
        application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        SpringApplication.run(SampleSimpleApplication.class, args);
    }

    @Bean
    public TaskScheduler poolScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("poolScheduler");
        scheduler.setPoolSize(3);
        return scheduler;
    }

}
