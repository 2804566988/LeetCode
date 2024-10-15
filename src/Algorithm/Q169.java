package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Q169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, temp = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > max) {
                max = Math.max(max, map.get(num));
                temp = num;
            }
        }
        return temp;

    }
}
