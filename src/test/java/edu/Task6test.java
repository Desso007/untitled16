package edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6test {

    @Test
    public void testIsSubsequence() {
        String s = "abc";
        String t = "achfdbaabgabcaabg";

        assertEquals(true, Task6.isSubsequence(s, t));
    }
}