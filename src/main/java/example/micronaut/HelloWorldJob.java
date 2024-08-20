package example.micronaut;

import io.micronaut.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.inject.Singleton;
import java.text.SimpleDateFormat;
import java.util.Date;

@Singleton 
public class HelloWorldJob {
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldJob.class); 

    @Scheduled(fixedDelay = "3s")
    void executeEveryTen() {
        LOG.info("Simple Job every 3 seconds: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
    }

    @Scheduled(fixedDelay = "5s", initialDelay = "1s")
    void executeEveryFourtyFive() {
        LOG.info("Simple Job every 5 seconds: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
    }
}