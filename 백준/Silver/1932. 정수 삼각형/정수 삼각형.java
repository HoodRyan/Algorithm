import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static Integer[][] dp; //배열
    public static int [][] arr; // 메모이제이션 dp
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        dp = new Integer[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<i+1;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 가장 마지막 행의 값들을 DP의 마지막 행에도 똑같이 복사
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }
        //dp[0][0] 에 쌓인 누적 합 = 최댓값
        System.out.println(n_triangle(0,0));

    }

    public static int n_triangle(int d,int idx){
        // 마지막 행일 경우 현재 위치의 dp값 반환
        if(d == n-1)
            return dp[d][idx];

        // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
        if(dp[d][idx] == null){
            dp[d][idx] = Math.max(n_triangle(d+1,idx),n_triangle(d+1,idx+1)) + arr[d][idx];
        }
        return dp[d][idx];
    }
}
