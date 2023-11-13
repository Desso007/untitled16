package edu;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3test {

    @Test
    public void testParseDate() {
        Task3 parser = new Task3();

        Optional<LocalDate> date1 = parser.parseDate("2020-10-10");
        assertEquals(LocalDate.of(2020, 10, 10), date1.orElse(null));

        Optional<LocalDate> date2 = parser.parseDate("1/3/1976");
        assertEquals(LocalDate.of(1976, 1, 3), date2.orElse(null));

        Optional<LocalDate> date3 = parser.parseDate("tomorrow");
        assertEquals(LocalDate.now().plusDays(1), date3.orElse(null));

        Optional<LocalDate> date4 = parser.parseDate("invalid");
        assertEquals(null, date4.orElse(null));
    }
}