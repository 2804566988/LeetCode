package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    static class Solution{
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i< nums.length; i++) {
                if(map.containsKey(target - nums[i])) {
                    return new int[] {map.get(target-nums[i]),i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }

    public static void main(String[] args) {
        int[] ints = new Solution().twoSum(new int[]{2, 5, 7, 8}, 9);
    }
}