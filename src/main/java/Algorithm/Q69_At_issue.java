package Algorithm;

public class Q69_At_issue{
    static class Solution {
        public int mySqrt(int x) {
            if(x == 1){
                return 1;
            }
            if(x == 0){
                return 0;
            }
            int sqrt = 1;
            while(sqrt * sqrt <= x){
                sqrt++;
            }
            return sqrt-1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(26));
    }
}
