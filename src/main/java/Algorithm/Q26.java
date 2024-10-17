package Algorithm;


public class Q26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int p = 0,q = 1;
            while(q < nums.length){
                if(nums[p] != nums[q])
                {
                    nums[p+1] = nums[q];
                    //p与q不相等时才指向下一个元素
                    p++;
                }
                q++;
            }
        return p+1;
        }
    }
}
