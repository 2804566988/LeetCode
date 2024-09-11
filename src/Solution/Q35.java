package Solution;

public class Q35 {
    static class Solution {
            public int searchInsert(int[] nums, int target) {
                int index = 0, left = 0, right = nums.length-1,mid = 0;
                if(target >= nums[0] && target <= nums[nums.length-1]){
                    while(left < right - 1){
                        mid = (left + right) / 2;
                        if(nums[mid] < target){
                            left = mid;
                        }else if(nums[mid] > target){
                            right = mid;
                        }else{
                            return mid;
                        }
                    }
                    if(left == right - 1){
                        if(nums[left] == target){
                            return left;
                        }
                        return right;
                    }
                    index = mid;
                    return index;
                }else{
                    if(target < nums[0]){
                        return 0;
                    }
                    if(target > nums[nums.length-1]){
                        return nums.length;
                    }
                }
                return index;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1},1));
    }
}