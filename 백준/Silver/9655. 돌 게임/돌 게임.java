import java.io.*;

public class Main {
    public static int[] dp;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        check(n);

    }
    public static void check(int n){
        for(int i=4;i<=n;i++){
            dp[i] = Math.min(dp[i-1],dp[i-3])+1;
        }
        if(dp[n] % 2 == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }



}
