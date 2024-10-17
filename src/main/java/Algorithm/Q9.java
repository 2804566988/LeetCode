package Algorithm;

public class Q9 {
    class Solution {
        public boolean isPalindrome(int x) {
            boolean flag = true;
            String str = Integer.toString(x);
            for(int i = 0,j = str.length()-1;i < j;i++,j--)
            {
                if(str.charAt(i) != str.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }
}
