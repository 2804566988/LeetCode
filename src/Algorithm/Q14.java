package Algorithm;

class Q14 {
     class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder sb = new StringBuilder();
            int strsLen = strs.length;
            int minLength = 300;
            if(strsLen == 1){
                return strs[0];
            }
            for (String s : strs) {
                if (s.length() < minLength) {
                    minLength = s.length();
                }
            }
            for(int i = 0;i < minLength;i++){
                for(int j = 0;j < strsLen-1;j++){
                    if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                        return sb.toString();
                    }
                    if(j == strsLen - 2){
                        sb.append(strs[0].charAt(i));
                    }
                }
            }
            return sb.toString();
        }
    }
}
