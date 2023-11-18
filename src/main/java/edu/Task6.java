package edu;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task6 {
    public static boolean isSubsequence(String s, String t) {
        // Экранируем специальные символы, которые могут влиять на регулярное выражение
        String escapedS = s.replaceAll("([\\\\.\\[\\]\\(\\)\\{\\}\\^\\$\\|\\?\\*\\+])", "\\\\$1");

        // Строим регулярное выражение для поиска подпоследовательности
        String regex = ".*" + escapedS + ".*";

        // Компилируем регулярное выражение
        Pattern pattern = Pattern.compile(regex);

        // Используем Matcher для поиска соответствия
        Matcher matcher = pattern.matcher(t);

        // Возвращает true, если найдено соответствие
        return matcher.matches();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "achfdbaabgabcaabg";

        if (isSubsequence(s, t)) {
            System.out.println(s + " является подпоследовательностью " + t);
        } else {
            System.out.println(s + " не является подпоследовательностью " + t);
        }
    }
}
