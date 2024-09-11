package Solution;

public class Q66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            for(int i = digits.length-1;i >= 0;i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                    if(i == 0){
                        int[] temp = new int[digits.length+1];
                        temp[0] = 1;
                        for(int j = 1;j <= digits.length;j++){
                            temp[j] = digits[j-1];
                        }
                        digits = temp;
                    }
                }else{
                    digits[i]++;
                    return digits;
                }
            }
            return digits;
        }
    }
}
