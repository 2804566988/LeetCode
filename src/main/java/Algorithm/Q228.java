package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Q228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        int start = 0;
        List<String> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (nums[start] != nums[i - 1]) {
                    list.add(nums[start] + "->" + nums[i - 1]);
                }else{
                    list.add(nums[start]+"");
                }
                start = i;
            }
        }
        if (nums[start] != nums[nums.length - 1]) {
            list.add(nums[start] + "->" + nums[nums.length - 1]);
        }else{
            list.add(nums[start]+"");
        }
        return list;
    }
}
