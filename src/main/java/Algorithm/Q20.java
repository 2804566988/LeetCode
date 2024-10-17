package Algorithm;


import java.util.Stack;

public class Q20 {
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0;i < s.length();i++){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == ')' && stack.peek() == '(') {
                        stack.pop();
                        continue;
                    }
                    if (s.charAt(i) == ']' && stack.peek() == '[') {
                        stack.pop();
                        continue;
                    }
                    if (s.charAt(i) == '}' && stack.peek() == '{') {
                        stack.pop();
                        continue;
                    }
                    stack.push(s.charAt(i));
                }
            }
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("([)]"));
    }
}
