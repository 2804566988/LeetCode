package Algorithm;

public class Q8 {
    public static int myAtoi(String s) {
        boolean isStart = false,preBlock = true;
        int isPos = 1;
        StringBuilder sb = new StringBuilder();
        if ("".equals(s) || "".equals(s.replace(" ",""))) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if(preBlock && s.charAt(i) == ' '){
                continue;
            }
            preBlock = false;
            if (!isStart && s.charAt(i) == '-' && ((i > 0 && s.charAt(i-1) == ' ') || i == 0) && i != s.length()-1) {
                isPos = -1;
            }else if(!isStart && s.charAt(i) == '+' && ((i > 0 && s.charAt(i-1) == ' ') || i == 0) && i != s.length()-1){
                continue;
            } else if (s.charAt(i) > 48 && s.charAt(i) <= 57) {
                isStart = true;
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == '0') {
                if (isStart) {
                    sb.append(s.charAt(i));
                }
            }else if(s.charAt(i) < 48 || s.charAt(i) > 57){
                if(sb.isEmpty()){
                    return 0;
                }
                break;
            }
        }
        if(sb.isEmpty()){
            return 0;
        }
        try {
            int i = Integer.parseInt(sb.toString());
        } catch (NumberFormatException n) {
            if (isPos == -1) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        return Integer.parseInt(sb.toString()) * isPos;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" ++1"));
    }
}
