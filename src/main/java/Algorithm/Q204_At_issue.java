package Algorithm;

public class Q204_At_issue {
    public int countPrimes(int n) {

        int count = 0;
        for(int num = 2;num < n;num++){
            for(int i = 1;i < num;i++){
                if(i != 1 && (num % i) == 0){
                    break;
                }
                if(i == num - 1){
                    count++;
                }
            }
        }
        return count;
    }
}
