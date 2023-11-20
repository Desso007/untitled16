package edu;

import java.util.regex.Pattern;

public class Task8 {

    public static void main(String[] args) {
        String[] strings = {"0101", "111", "001100", "101010", "1100"};

        // Нечетная длина
        String regex1 = "^(..)*.$";
        System.out.println("Нечетная длина:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex1, str);
            System.out.println(str + ": " + match);
        }

        // Начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину
        String regex2 = "^(0(..)*1$|1(..)*0$|0|1)$";
        System.out.println("\nНачинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex2, str);
            System.out.println(str + ": " + match);
        }

        // Количество 0 кратно 3
        String regex3 = "^(1*01*01*01*)*$";
        System.out.println("\nКоличество 0 кратно 3:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex3, str);
            System.out.println(str + ": " + match);
        }

        // Любая строка, кроме 11 или 111
        String regex4 = "^(?!11$|111$).*$";
        System.out.println("\nЛюбая строка, кроме 11 или 111:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex4, str);
            System.out.println(str + ": " + match);
        }

        // Каждый нечетный символ равен 1
        String regex5 = "^((.|..)*1)*$";
        System.out.println("\nКаждый нечетный символ равен 1:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex5, str);
            System.out.println(str + ": " + match);
        }

        // Содержит не менее двух 0 и не более одной 1
        String regex6 = "^(.*0){2}[^1]*$";
        System.out.println("\nСодержит не менее двух 0 и не более одной 1:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex6, str);
            System.out.println(str + ": " + match);
        }

        // Нет последовательных 1
        String regex7 = "^(?!.*11).*$";
        System.out.println("\nНет последовательных 1:");
        for (String str : strings) {
            boolean match = Pattern.matches(regex7, str);
            System.out.println(str + ": " + match);
        }
    }
}
