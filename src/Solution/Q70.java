package Solution;

public class Q70 {
    public int climbStairs(int n) {
    return 0;
    }
}

/*
    不能使用递归，栈溢出
    int cnt = 0;
    public int climbStairs(int n) {
        climb(0,n);
        return cnt;
    }

    public void climb(int sum,int n){
        if(sum == n){
            cnt++;
            return;
        }
        if(n-sum >= 2){
            climb(sum + 1,n);
            climb(sum + 2,n);
        }
        if(n-sum == 1){
            climb(sum + 1,n);
        }
    }
 */