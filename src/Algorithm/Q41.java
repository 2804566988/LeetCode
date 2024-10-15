package Algorithm;

public class Q41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] < nums.length && nums[i] != i + 1 && nums[i] != nums[nums[i]-1]){
                nums = swap(i, nums[i] - 1, nums);
            }
        }
        for(int i =  0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                return  i + 1;
            }
        }
        return  nums.length + 1;
    }
    public int[] swap(int a, int b, int[] nums) {
        int temp = 0;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return nums;
    }
}
