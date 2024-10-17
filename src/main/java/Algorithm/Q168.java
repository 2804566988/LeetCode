package Algorithm;

public class Q168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            columnNumber = columnNumber -1;
            char ch = (char) ((columnNumber % 26)+65);
            columnNumber = columnNumber / 26;
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
