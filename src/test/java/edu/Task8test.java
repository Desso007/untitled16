package edu;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {



    @Test
    void testRegex4() {
        String[] strings = {"0101", "111", "001100", "101010", "1100"};
        String regex4 = "^(?!11$|111$).*$";

        assertTrue(Pattern.matches(regex4, strings[0]));
        assertFalse(Pattern.matches(regex4, strings[1]));
        assertTrue(Pattern.matches(regex4, strings[2]));
        assertTrue(Pattern.matches(regex4, strings[3]));
        assertTrue(Pattern.matches(regex4, strings[4]));
    }
}
