import java.util.*;
import java.io.*;

public class Main {
    public static int[] dp = new int[11]; // n은 양수이며 11보다 작다
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        dp[1] = 1; // 1은 1 => 1개
        dp[2] = 2; // 2는 1+1, 2 => 2개
        dp[3] = 4; // 3은 1+1+1, 1+2, 2+1, 3 => 4개

        // dp[4] = dp[1] + dp[2] + dp[3] = 1 + 2 + 3 = 6
        // dp[5] = dp[2] + dp[3] + dp[4] = 2 + 3 + 6 = 11

        for(int i=4;i<=10;i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N]).append('\n');
        }
        System.out.println(sb);

    }

}