package edu;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1test {



    @Test
    void testCalculateAverageSessionDurationWithSingleSession() {
        List<String> sessions = List.of("2022-03-12, 20:20 - 2022-03-12, 23:57");

        String result = Task1.ClubAnalytics.calculateAverageSessionDuration(sessions);

        // Если есть только одна сессия, средняя продолжительность должна быть равна продолжительности этой сессии
        assertEquals("3ч 37м", result);
    }
}
