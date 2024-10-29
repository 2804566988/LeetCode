package Algorithm;

public class Q231 {
    /*
    时间复杂度 O(logN)
     */
    public static boolean isPowerOfTwo(int n) {
        int left = 0,right = 32;
        while(left < right){
            int mid = (left + right) / 2;
            double pow = Math.pow(2,mid);
            if(pow < n){
                left = mid;
            }else if (pow > n){
                right = mid;
            }else{
                return true;
            }
            if(left == right - 1 && Math.pow(2,left) != n && Math.pow(2,right) != n){
                return false;
            }
        }
        return false;
    }
}

/* 看 n 的二进制表示是否为全 "1"  时间复杂度 O(1)
    public boolean isPowerOfTwo(int n) {
        return n<=0?false:Integer.bitCount(n)==1;
    }
 */