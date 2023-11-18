package edu;

public class Task7 {
    public static void main(String[] args) {
        // Содержит не менее 3 символов, причем третий символ равен 0
        String regex1 = ".*0.{2,}.*";
        // Начинается и заканчивается одним и тем же символом
        String regex2 = "^(0|1)(.*)(\\1)$";
        // Длина не менее 1 и не более 3
        String regex3 = "^[01]{1,3}$";

        // Тестируем строки
        String testString1 = "110101";
        String testString2 = "01010";
        String testString3 = "001";

        System.out.println(testString1.matches(regex1)); // true
        System.out.println(testString2.matches(regex1)); // false

        System.out.println(testString1.matches(regex2)); // false
        System.out.println(testString2.matches(regex2)); // true

        System.out.println(testString1.matches(regex3)); // false
        System.out.println(testString3.matches(regex3)); // true
    }
}
