package Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i < m + n;i++){
            nums1[i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}