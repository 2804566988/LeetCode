package Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Q205 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsValue(t.charAt(i))){
                for(Character key : map.keySet()){
                    if(map.get(key) == t.charAt(i) && key != s.charAt(i)){
                        return false;
                    }
                }
            }
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),t.charAt(i));
            }else if(map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abb", "edd"));
    }
}
