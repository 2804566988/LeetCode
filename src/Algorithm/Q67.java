package Algorithm;

public class Q67 {
    static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder res = new StringBuilder();
            int carry = 0;
            StringBuilder tempa = new StringBuilder(a);
            StringBuilder tempb = new StringBuilder(b);
            a = tempa.reverse().toString();
            b = tempb.reverse().toString();
            int min = Math.min(a.length(),b.length());
            int max = Math.max(a.length(),b.length());
            for(int i = 0;i < max;i++){
                if(i < min){
                    if(carry+a.charAt(i)-48 + b.charAt(i)-48 >= 2){
                        res.append((carry+a.charAt(i)-48 + b.charAt(i)-48)%2);
                        carry = 1;
                    }else{
                        res.append(carry + a.charAt(i)-48 + b.charAt(i)-48);
                        carry = 0;
                    }
                }else{
                    if(carry + (a.length() > b.length() ? a.charAt(i)-48 : b.charAt(i)-48) >= 2){
                        res.append((carry + (a.length() > b.length() ? a.charAt(i)-48 : b.charAt(i)-48))%2);
                        carry = 1;
                    }else{
                        res.append(carry + (a.length() > b.length() ? a.charAt(i)-48 : b.charAt(i)-48));
                        carry = 0;
                    }
                }
            }
            if(carry == 1){
                res.append(1);
            }
            return res.reverse().toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("1111", "1111"));
    }
}