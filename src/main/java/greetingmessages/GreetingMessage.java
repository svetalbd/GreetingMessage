package greetingmessages;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by Svitlana Mykhailenko on 29.06.2016.
 */
public class GreetingMessage {
    private final String MESSAGES = "messages";
    private final String CUSTOMER = "customer";

    private Locale location(){
        return Locale.getDefault();
    }


    public String getWelcomeMessage() {
        GreetingMessageConstructor messageConstructor = new GreetingMessageConstructor();
        StringBuilder message = new StringBuilder();
        int hours = new Date().getHours();

        message.append(ResourceBundle.getBundle(MESSAGES, location()).getString(messageConstructor.messageCreator(hours)));
        message.append(", ");
        message.append(ResourceBundle.getBundle(MESSAGES, location()).getString(CUSTOMER));
        message.append("! ");

        return message.toString();
    }

}
