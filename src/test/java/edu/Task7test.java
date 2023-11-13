package edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7test {


    @Test
    public void testRegex3() {
        String testString1 = "110101";
        String testString2 = "01";

        assertEquals(false, testString1.matches("^[01]{1,3}$"));
        assertEquals(true, testString2.matches("^[01]{1,3}$"));
    }
}