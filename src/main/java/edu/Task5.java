package edu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static boolean isValidCarNumber(String carNumber) {
        // Регулярное выражение для валидации российских номерных знаков
        String regex = "^[АВЕКМНОРСТУХABEKMHOPCTYX]\\d{3}[АВЕКМНОРСТУХABEKMHOPCTYX]{2}\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(carNumber);

        // Возвращает true, если номерной знак соответствует формату
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Примеры использования
        String validCarNumber1 = "А123ВЕ777";
        String validCarNumber2 = "О777ОО177";
        String invalidCarNumber1 = "123АВЕ777";
        String invalidCarNumber2 = "А123ВГ77";
        String invalidCarNumber3 = "А123ВЕ7777";

        System.out.println(isValidCarNumber(validCarNumber1));  // Вернет true
        System.out.println(isValidCarNumber(validCarNumber2));  // Вернет true
        System.out.println(isValidCarNumber(invalidCarNumber1));  // Вернет false
        System.out.println(isValidCarNumber(invalidCarNumber2));  // Вернет false
        System.out.println(isValidCarNumber(invalidCarNumber3));  // Вернет false
    }
}
