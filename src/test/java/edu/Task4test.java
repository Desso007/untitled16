package edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4test {

    @Test
    public void testCheckPassword() {
        String password1 = "securePassword";
        String password2 = "strongPassword!";
        String password3 = "anotherPassword@";

        assertEquals(false, Task4.checkPassword(password1));
        assertEquals(true, Task4.checkPassword(password2));
        assertEquals(true, Task4.checkPassword(password3));
    }
}