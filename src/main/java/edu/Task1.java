package edu;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> sessions = List.of(
                "2022-03-12, 20:20 - 2022-03-12, 23:57",
                "2022-04-01, 21:30 - 2022-04-02, 01:20"
        );
        System.out.println(ClubAnalytics.calculateAverageSessionDuration(sessions));
    }

    public static class ClubAnalytics {

        public static String calculateAverageSessionDuration(List<String> sessions) {
            long totalDurationSeconds = 0;
            int sessionCount = 0;

            for (String session : sessions) {
                String[] parts = session.split(" - ");
                LocalDateTime startTime = LocalDateTime.parse(parts[0], DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm"));
                LocalDateTime endTime = LocalDateTime.parse(parts[1], DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm"));
                Duration duration = Duration.between(startTime, endTime);
                totalDurationSeconds += duration.getSeconds();
                sessionCount++;
            }

            long averageDurationSeconds = totalDurationSeconds / sessionCount;
            long hours = averageDurationSeconds / 3600;
            long minutes = (averageDurationSeconds % 3600) / 60;

            return String.format("%dч %02dм", hours, minutes);
        }
    }
}
