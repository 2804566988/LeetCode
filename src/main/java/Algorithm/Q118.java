package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                // j 未过半时，正常计算数值
                if (j <= i / 2) {
                    //第一位添加数值 1
                    if (j == 0) {
                        triangle.add(new ArrayList<>(List.of(1)));
                    } else {
                        triangle.get(i).add(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                    }
                    //当 j 过半以后，将前面对称位置数值填入
                } else {
                    triangle.get(i).add(triangle.get(i).get(i - j));
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
