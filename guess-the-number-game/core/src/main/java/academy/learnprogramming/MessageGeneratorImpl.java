package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl {
    // == constants ==
    private static final Logger logger = LoggerFactory.getLogger("MessageGeneratorImpl");

    @Autowired
    private Game game;
    private int guessCount = 10;

    // == public methods ==
    @PostConstruct
    public void postContruct() {
        logger.info("in MessageGeneratorImpl.postConstruct()");
    }
}
