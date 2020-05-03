package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator{
    // == constants ==
    private static final Logger logger = LoggerFactory.getLogger("MessageGeneratorImpl");

    // == fields ==
    @Autowired
    private Game game;
    private int guessCount = 10;

    // == init methods ==
    @PostConstruct
    public void postContruct() {
        logger.info("in MessageGeneratorImpl.postConstruct() {}", game);
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "Main Message";
    }

    @Override
    public String getResultMessage() {
        return "Result Message";
    }
}
