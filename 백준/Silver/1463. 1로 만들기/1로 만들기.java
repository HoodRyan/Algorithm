import java.io.*;

public class Main {
    public static Integer[] dp;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1]; // 0도 포함해야 하므로 n+1
        dp[0] = dp[1] = 0; // 1과 0일때는 연산이 필요 없음
        System.out.println(make_one(n));
    }
    public static int make_one(int N){
        // 탐색하지 않았던 N일 경우
        if (dp[N] == null) {
            // 6으로 나눠질 경우
            if (N % 6 == 0) {
                dp[N] = Math.min(make_one(N-1), Math.min(make_one(N/3), make_one(N/2))) + 1;
            }
            // 3으로만 나눠지는 경우
            else if (N % 3 == 0) {
                dp[N] = Math.min(make_one(N/3), make_one(N-1)) + 1;
            }
            // 2로만 나눠지는 경우
            else if (N % 2 == 0) {
                dp[N] = Math.min(make_one(N/2), make_one(N-1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[N] = make_one(N-1) + 1;
            }
        }
        return dp[N];
    }



}
