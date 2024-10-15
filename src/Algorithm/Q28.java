package Algorithm;

public class Q28 {
    class Solution {
        public int strStr(String haystack, String needle) {
            int needleIndex = 0;
            if(haystack.length() < needle.length()){
                return -1;
            }
            for(int i = 0;i < haystack.length();i++){
                int temp = i;
                while(haystack.charAt(temp) == needle.charAt(needleIndex)){
                    temp++;
                    needleIndex++;
                    if(needleIndex == needle.length()) {
                        return i;
                    }
                    if(temp >= haystack.length()){
                        return -1;
                    }
                }
                needleIndex = 0;
            }
            return -1;
        }
    }
}
