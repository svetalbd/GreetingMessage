import greetingmessages.GreetingMessage;
import sun.util.logging.PlatformLogger;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by Svitlana Mykhailenko on 29.06.2016.
 *
 * The program shows a message to a user according to his country and current time
 */

public class Runner {
    private static Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) throws IOException {
        log();
        logger.info("New request from "+Locale.getDefault());
        GreetingMessage message = new GreetingMessage();
        System.out.println(message.getWelcomeMessage());
    }

    private static void log() throws IOException {

        Logger logger = Logger.getLogger("");
        FileHandler handler = new FileHandler("TestLog.log");
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
    }
}
