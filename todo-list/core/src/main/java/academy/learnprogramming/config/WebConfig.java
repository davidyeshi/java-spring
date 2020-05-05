package academy.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuring the web part of the applications
 */
@Configuration
@ComponentScan(basePackages = "academy.learnprogramming")
@EnableWebMvc
public class WebConfig {
}
