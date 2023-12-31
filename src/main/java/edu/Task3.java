package edu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Task3 {

    private static final DateTimeFormatter[] DATE_FORMATTERS = {
            DateTimeFormatter.ofPattern("yyyy-MM-dd"),
            DateTimeFormatter.ofPattern("yyyy-MM-d"),
            DateTimeFormatter.ofPattern("M/d/yyyy"),
            DateTimeFormatter.ofPattern("M/d/yy"),
            DateTimeFormatter.ofPattern("'today'"),
            DateTimeFormatter.ofPattern("'yesterday'"),
            DateTimeFormatter.ofPattern("d 'day ago'"),
            DateTimeFormatter.ofPattern("d 'days ago'")
    };

    public Optional<LocalDate> parseDate(String string) {
        // Проверка отдельно для "tomorrow"
        if ("tomorrow".equalsIgnoreCase(string)) {
            return Optional.of(LocalDate.now().plusDays(1));
        }

        for (DateTimeFormatter formatter : DATE_FORMATTERS) {
            try {
                LocalDate date = LocalDate.parse(string, formatter);
                return Optional.of(date);
            } catch (Exception e) {
                // Ignore parsing exceptions and try the next formatter
            }
        }
        return Optional.empty();
    }
}

class Main {
    public static void main(String[] args) {
        Task3 parser = new Task3();

        Optional<LocalDate> date1 = parser.parseDate("2020-10-10");
        System.out.println(date1.orElse(null)); // Output: 2020-10-10

        Optional<LocalDate> date2 = parser.parseDate("1/3/1976");
        System.out.println(date2.orElse(null)); // Output: 1976-01-03

        Optional<LocalDate> date3 = parser.parseDate("tomorrow");
        System.out.println(date3.orElse(null)); // Output: текущая дата + 1 день

        Optional<LocalDate> date4 = parser.parseDate("invalid");
        System.out.println(date4.orElse(null)); // Output: null
    }
}
