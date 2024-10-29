package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i--){
            if(map.containsValue(nums[i])){
                return false;
            }else{
                map.put(i, nums[i]);
            }
        }
        return false;
    }
}
