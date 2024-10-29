package Algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }else{
                map.put(num, 1);
            }
        }
        return false;
    }
}
