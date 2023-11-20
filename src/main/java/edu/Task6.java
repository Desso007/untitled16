package edu;

public class Task6 {
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
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
