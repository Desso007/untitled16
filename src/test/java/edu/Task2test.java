package edu;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2test {

    @Test
    public void testFindFridayThirteenths() {
        int year = 2021;
        List<LocalDate> fridayThirteenths = Task2.FridayThirteenths.findFridayThirteenths(year);
        assertEquals(1, fridayThirteenths.size());
        assertEquals(LocalDate.of(2021, 8, 13), fridayThirteenths.get(0));
    }

    @Test
    public void testFindNextFridayThirteenth() {
        LocalDate currentDate = LocalDate.of(2021, 8, 10);
        LocalDate nextFridayThirteenth = Task2.FridayThirteenths.findNextFridayThirteenth(currentDate);
        assertEquals(LocalDate.of(2021, 8, 13), nextFridayThirteenth);
    }
}