public class Main {
    // public static int fib(int n){ // Tabulation
    //     if(n<=1) return n;
    //     int[] dp = new int[n+1];
    //     dp[0] = 0;
    //     dp[1] = 1;
        
    //     for(int i=2;i<=n;i++)
    //         dp[i] = dp[i-1]+dp[i-2];
    //     return dp[n];
    // }

    public static int fib(int n){
        if(n<=1) return n;
        int f = 0;
        int s = 1;
        
        for(int i=2;i<=n;i++){
            int t = f+s;
            f = s;
            s = t;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }   
}