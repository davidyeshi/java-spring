package academy.learnprogramming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WebMain {
    public static void main(String[] args) {
        SpringApplication.run(WebMain.class, args);
        log.info("Web Main Started");
    }
}
