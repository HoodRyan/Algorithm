import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static Integer[] dp; //배열
    public static int [] arr; // 메모이제이션 dp
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            LIS(i);
        }
        int max = dp[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }

    public static int LIS(int n){
        if(dp[n] == null){
            dp[n] = 1; // 탐색을 하면 1로 초기화

            //n 이전의 노드 탐색
            for(int i=n-1;i>=0;i--){
                // 이전의 노드 중 arr[n]의 값보다 작은 값을 발견했을 경우
                if(arr[i]<arr[n]){
                    dp[n] = Math.max(dp[n],LIS(i)+1);
                }
            }
        }
        return dp[n];
    }
}
