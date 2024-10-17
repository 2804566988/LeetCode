package Algorithm;

import java.util.*;

public class Q5 {
    public String longestPalindrome(String s) {
        int max = 0;
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (sub.length() > max) {
                    if (isPalindrome(sub)) {
                        map.put(sub.length(), sub);
                        max = Math.max(max, sub.length());
                    }
                }
            }
        }
        return map.get(max);
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Q5().longestPalindrome("abb"));
    }
}

/*
    暴力调库，处理较慢
    public String longestPalindrome(String s) {
        int max = 0;
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (sub.length() > max) {
                    if (isPalindrome(sub)) {
                        map.put(sub.length(), sub);
                        max = Math.max(max, sub.length());
                    }
                }
            }
        }
        return map.get(max);
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
 */