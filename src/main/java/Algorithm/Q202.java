package Algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q202 {
    public static boolean isHappy(int n) {
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(true){
            int length = Integer.toString(n).length();
            for(int i = 0;i < length;i++){
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if(map.containsKey(sum)){return false;}
            if(sum == 1){return true;}
            map.put(sum,sum);
            n = sum;
            sum = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
