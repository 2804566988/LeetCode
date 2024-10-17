package Algorithm;

/*
 * 整体思路为遍历过程中匹配到与val相同的数则与exchange位置上的数交换(exchange从数组末尾开始，每次交换自减1位)
 * 最终将原数组中与val相同的数全部放置到数组末尾，而前k位都是与val不同的数
 */
public class Q27 {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            int exchange = nums.length-1;
            int temp = 0;
            //遍历数组
            for(int i = 0;i < nums.length;i++){
                //限制遍历下标不能大于被交换数的下标
                if(i <= exchange){
                    //匹配到与val不同的数字则k++
                    if(nums[i] != val){
                        k++;
                    }else{
                        /*
                        匹配到与val相同的数字则判断exchange位置的数字是否与val相同，不同则替换，相同则exhcange--;
                        (这个循环中会exchange变量会自减并且需要匹配到合适的位置才能跳出循环，需要限制循环条件)
                        */
                        while(i <= exchange){
                            if(nums[exchange] != val){
                                temp =  nums[i];
                                nums[i] = nums[exchange];
                                nums[exchange--] = temp;
                                k++;
                                break;
                            }else{
                                exchange--;
                            }
                        }
                    }
                }
            }
            return k;
        }

        public static void main(String[] args) {
            System.out.println(new Solution().removeElement(new int[]{4,5},5));
        }
    }
}
