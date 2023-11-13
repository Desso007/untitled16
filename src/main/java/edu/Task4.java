package edu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task4 {
    public static boolean checkPassword(String password) {
        // Регулярное выражение для поиска одного из требуемых символов
        String regex = "[~!@#\\$%\\^&*\\|]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        // Возвращает true, если найден хотя бы один символ
        return matcher.find();
    }

    public static void main(String[] args) {
        // Пример использования
        String password1 = "securePassword";
        String password2 = "strongPassword!";
        String password3 = "anotherPassword@";

        System.out.println(checkPassword(password1));  // Вернет false, так как нет требуемых символов
        System.out.println(checkPassword(password2));  // Вернет true, так как есть символ "!"
        System.out.println(checkPassword(password3));  // Вернет true, так как есть символ "@"
    }
}

