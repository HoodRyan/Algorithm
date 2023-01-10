import java.io.*;

public class Main {
    public static Integer[] dp; //배열
    public static int [] arr; // 메모이제이션 dp

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        dp = new Integer[n+1];


        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[1];

        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }
 
        System.out.println(stairs(n));
    }

    public static int stairs(int N){
        if(dp[N] == null){
             dp[N] = Math.max(stairs(N - 2), stairs(N - 3) + arr[N - 1]) + arr[N];
        }
        return dp[N];
    }
}
