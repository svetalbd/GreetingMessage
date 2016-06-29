package greetingmessages;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Svitlana on 29.06.2016.
 */
@RunWith(value = Parameterized.class)
public class GreetingMessageConstructorTest {
    final private GreetingMessageConstructor greetingMessage = new GreetingMessageConstructor();
    private int hours;
    private String time;

    public GreetingMessageConstructorTest(int hours, String time) {
        this.hours = hours;
        this.time = time;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, "NIGHT"},
                {5, "NIGHT"},
                {6, "MORNING"},
                {8, "MORNING"},
                {9, "DAY"},
                {18, "DAY"},
                {19, "EVENING"},
                {22, "EVENING"},
                {23, "NIGHT"},
        });

    }

    @Test
    public void messageCreator() throws Exception {
        assertEquals (greetingMessage.messageCreator(hours), time);
    }

}