package Algorithm;

public class Q42 {
    static public int trap(int[] height) {
        int res = 0, backup = 0, cur = 0, temp = 0;
        //在列表有前置0的情况下需要将起始位置设置到非0位置
        for (int i = 0; i < height.length; i++) {
            if (height[i] != 0) {
                backup = i;
                cur = i + 1;
                break;
            }
        }
        //在当前指针cur超出列表范围时终止循环
        while (cur < height.length) {
            //cur位置的元素比backup位置元素小的情况下将两位置差值加入temp变量
            if (height[cur] < height[backup]) {
                temp += (height[backup] - height[cur]);
            } else {//cur位置的元素大于等于backup位置元素的情况下，将temp的值加入res，并将temp置零，将backup更新到cur位置
                res += temp;
                temp = 0;
                backup = cur;
            }
            cur++;
            //当cur超出列表范围但是backup始终没有走到最后一个元素
            // 即backup之后始终没有一个元素大于等于backup位置元素，则无法正常积水，将temp置零，更新backup到backup+1位置，重新计算
            if (cur == height.length && backup != height.length - 1) {
                temp = 0;
                cur = backup + 1;
                //当出现4、2、3的情况时（这种情况按以上思路无法处理，但可以将后续子序列反转，重新转化成可以处理的序列，即3、2、4）
                int tmp;
                for (int i = backup, j = height.length - 1; i <= j; i++, j--) {
                    tmp = height[i];
                    height[i] = height[j];
                    height[j] = tmp;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{4, 2, 3}));
    }
}
