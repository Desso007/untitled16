package edu;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;

public class Task2 {

    public static void main(String[] args) {
        FridayThirteenths.run();
    }

    public static class FridayThirteenths {

        public static void run() {
            int year = 1999;

            List<LocalDate> fridayThirteenths = findFridayThirteenths(year);
            System.out.println("Пятницы 13-е в " + year + " году: " + fridayThirteenths);

            LocalDate currentDate = LocalDate.now();
            LocalDate nextFridayThirteenth = findNextFridayThirteenth(currentDate);
            System.out.println("Следующая ближайшая пятница 13: " + nextFridayThirteenth);
        }

        public static List<LocalDate> findFridayThirteenths(int year) {
            List<LocalDate> fridayThirteenths = new ArrayList<>();

            for (int month = 1; month <= 12; month++) {
                LocalDate date = LocalDate.of(year, month, 13);
                if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    fridayThirteenths.add(date);
                }
            }

            return fridayThirteenths;
        }

        public static LocalDate findNextFridayThirteenth(LocalDate currentDate) {
            LocalDate nextFriday = currentDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
            
            while (nextFriday.getDayOfMonth() != 13) {
                nextFriday = nextFriday.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
            }

            return nextFriday;
        }
    }
}

