package Algorithm;

import java.util.ArrayList;
import java.util.List;

/*
AC
 */
public class Q22 {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        //字符串只能以"("为开头
        generate(n * 2 - 1,new StringBuilder("("),new StringBuilder("("));
        return list;
    }
    public void generate(int n, StringBuilder sb, StringBuilder flag){
        //括号数量符合要求
        if(n == 0){
            //并且左右括号能匹配后将字符串加入list
            if ("".equals(flag.toString())) {
                list.add(sb.toString());
                return;
            }
            return;
        }
        //当flag串不为空时，加入右括号
        if(!flag.isEmpty()){
            char f = flag.charAt(flag.length() - 1);
            sb.append(")");
            //判断当前flag最右字符是否为"("，如果是则将改字符删除（模拟字符匹配）
            if(flag.charAt(flag.length() - 1) == '('){
                flag.deleteCharAt(flag.length() - 1);
            }
            //递归调用
            generate(n-1,sb,flag);
            //还原flag和sb
            flag.append(f);
            sb.deleteCharAt(sb.length() - 1);
        }
        //当flag串为空时，只能加入左括号
        sb.append("(");
        flag.append("(");
        generate(n-1,sb,flag);
        //还原flag和sb
        flag.deleteCharAt(flag.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}
