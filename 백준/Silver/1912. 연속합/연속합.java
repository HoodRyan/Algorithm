import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static Integer[] dp; //배열
    public static int [] arr; // 메모이제이션 dp
    public static int max; //최댓값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0]; // dp[0]은 첫 원소이므로 탐색할 수가 없음 => arr[0]이 된다.
        max = arr[0]; // max 도 dp와 마찬가지로 => arr[0]

        sequence_sum(n-1);
        System.out.println(max);
    }

    public static int sequence_sum(int N){
        if(dp[N] == null){
            // (이전 배열의 누적합 + 현재 값)과 현재 값을 비교해 최댓값을 N 위치에 저장
            dp[N] = Math.max(sequence_sum(N-1)+arr[N],arr[N]);
            max = Math.max(dp[N],max);
        }
        return dp[N];
    }
}
