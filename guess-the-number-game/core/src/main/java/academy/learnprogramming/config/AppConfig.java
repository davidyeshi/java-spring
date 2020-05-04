package academy.learnprogramming.config;

import academy.learnprogramming.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class) // allows modularised configuration
@ComponentScan(basePackages = "academy.learnprogramming")
public class AppConfig {
    // define definitions to find the beans
    // Bean methods are useful in situations where need additional config for a bean
    // == bean methods to be managed by the spring container ==
    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game() {
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }
}
