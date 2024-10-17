package Algorithm;

import java.util.*;

public class Q136 {
    static public int singleNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], true);
            } else {
                map.remove(nums[i]);
            }
        }
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            return entry.getKey();
        }
        return 0;
    }
}