import java.io.*;

public class Main {
    public static Integer[] dp; //메모이제이션
    public static int[] arr;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1]; // 0도 포함해야 하므로 n+1
        arr = new int[n+1];

        for(int i=1;i<n+1;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];

        if(n>1){ // dp[2] = 첫번째 + 두번째 합이 최댓값임
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(stairs(n));
    }
    public static int stairs(int N){
        // 탐색하지 않았던 N일 경우
        if (dp[N] == null) {
            int k = Math.max(stairs(N - 2), stairs(N - 3) + arr[N - 1]) + arr[N];
            dp[N] = Math.max(k, stairs(N - 1));
        }
        return dp[N];
    }



}
