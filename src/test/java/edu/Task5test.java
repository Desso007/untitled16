package edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5test {

    @Test
    public void testIsValidCarNumber() {
        String validCarNumber1 = "А123ВЕ777";
        String validCarNumber2 = "О777ОО177";
        String invalidCarNumber1 = "123АВЕ777";
        String invalidCarNumber2 = "А123ВГ77";
        String invalidCarNumber3 = "А123ВЕ7777";

        assertEquals(true, Task5.isValidCarNumber(validCarNumber1));
        assertEquals(true, Task5.isValidCarNumber(validCarNumber2));
        assertEquals(false, Task5.isValidCarNumber(invalidCarNumber1));
        assertEquals(false, Task5.isValidCarNumber(invalidCarNumber2));
        assertEquals(false, Task5.isValidCarNumber(invalidCarNumber3));
    }
}