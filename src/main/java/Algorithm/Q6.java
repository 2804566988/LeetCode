package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public String convert(String s, int numRows) {
        int direction = -1,index = 0;
        StringBuilder res = new StringBuilder();
        List<List<Character>> list = new ArrayList<>();

        if(numRows == 1){
            return s;
        }

        for(int i = 0;i < numRows;i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0;i <  s.length();i++){
            list.get(index).add(s.charAt(i));
            if(i % (numRows - 1) == 0){
                direction = -direction;
            }
            if(direction == 1){
                index++;
            }else{
                index--;
            }
        }

        for(int i = 0;i < numRows;i++){
            for(int j = 0;j < list.get(i).size();j++){
                res.append(list.get(i).get(j));
            }
        }
        return res.toString();
    }
}
