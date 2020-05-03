package academy.learnprogramming.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess {

    // == constants ==
    private static final Logger logger = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    // Once the Spring container is ready for use, it will fire this event automatically
    @EventListener
    public void start(ContextRefreshedEvent contextRefreshedEvent) {
        logger.info("start() --> Container ready for use.");
    }
}
