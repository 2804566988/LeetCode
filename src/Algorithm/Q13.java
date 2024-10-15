package Algorithm;

import java.util.HashMap;

public class Q13 {
    class Solution {
        public int romanToInt(String s) {
            int sum = 0;
            int i = 0;
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("I", 1);
            hashMap.put("V", 5);
            hashMap.put("X", 10);
            hashMap.put("L", 50);
            hashMap.put("C", 100);
            hashMap.put("D", 500);
            hashMap.put("M", 1000);
            hashMap.put("IV", 4);
            hashMap.put("IX", 9);
            hashMap.put("XL", 40);
            hashMap.put("XC", 90);
            hashMap.put("CD", 400);
            hashMap.put("CM", 900);
            while (i < s.length()) {
                if (i != s.length() - 1 &&
                        hashMap.containsKey(s.substring(i, i + 2))) {
                    sum += hashMap.get(s.substring(i, i + 2));
                    i += 2;
                } else {
                    sum += hashMap.get(Character.toString(s.charAt(i)));
                    i++;
                }
            }
            return sum;
        }
    }
}
