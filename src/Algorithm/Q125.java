package Algorithm;

public class Q125 {
    static public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            int ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append((char)ch);
            }
            if(ch >= 'A' && ch <= 'Z'){
                sb.append((char) (ch + 32));
            }
        }
        String str = sb.toString();
        for(int i = 0,j = str.length()-1;i <= j;i++,j--){
            if(str.charAt(i) != str.charAt(j) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Q125.isPalindrome("\"A man, a plan, a canal: Panama\""));
    }
}

/*
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(str).reverse().toString();
        return str.equals(rev);
    }
 */