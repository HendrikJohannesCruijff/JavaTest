import java.util.Arrays;

public class DpAlgorithm {
    static int dp[];
    public static void main(String[] args) {
        int num = 10;
        dp = new int[num + 1];

        System.out.println(fibo(num));


    }

    static int fibo(int x) {
        if( x ==1 || x==2) return 1;
        if(dp[x] != 0) return dp[x];
        dp[x] = fibo(x-1) + fibo(x-2);
        return dp[x];
    }
}