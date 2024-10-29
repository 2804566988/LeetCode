package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17 {
    Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if("".equals(digits)){
            return new ArrayList<>();
        }
        Combinations(digits, 0, new StringBuilder(), list);
        return list;
    }
    public void Combinations(String digits, int index, StringBuilder sb, List<String> list) {
        if (index == digits.length()) {
            list.add(sb.toString());
            return;
        }
        for (int i = 0; i < map.get(digits.charAt(index)).length(); i++) {
            sb.append(map.get(digits.charAt(index)).charAt(i));
            Combinations(digits, index + 1, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
