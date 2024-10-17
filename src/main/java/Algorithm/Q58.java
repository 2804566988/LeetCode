package Algorithm;

public class Q58 {
    static class Solution {
        public int lengthOfLastWord(String s) {
            int cnt = 0;
            for(int i = s.length()-1;i >= 0;i--){
                if(s.charAt(i) != ' '){
                    cnt++;
                }
                if(s.charAt(i) == ' ' && cnt != 0){
                    return cnt;
                }
                if(i == 0 && cnt != 0){
                    return cnt;
                }
            }
            return  0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("   fly me   to   the moon     "));
    }
}
