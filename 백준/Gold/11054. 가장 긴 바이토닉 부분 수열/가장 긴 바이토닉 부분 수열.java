import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static Integer[] i_dp; // LIS 배열
    public static Integer[] d_dp; // LDS 배열
    public static int [] arr; // 메모이제이션 dp
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        i_dp = new Integer[n];
        d_dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //0~n-1 까지 각각의 모든 부분수열 탐색
        for(int i=0;i<n;i++){
            LIS(i);
            LDS(i);
        }
        int max =  -1;
        for(int i=0;i<n;i++){
            max = Math.max(d_dp[i] + i_dp[i], max);
        }

        System.out.println(max-1); // d_dp[i] 와 i_dp[i]를 단순히 합친 것이므로 원소가 1개씩 중복되어 있음
    }

    public static int LIS(int n){
        if(i_dp[n] == null){
            i_dp[n] = 1; // 탐색을 하면 1로 초기화

            //n 이전의 노드 탐색
            for(int i=n-1;i>=0;i--){
                // 이전의 노드 중 arr[n]의 값보다 작은 값을 발견했을 경우
                if(arr[i]<arr[n]){
                    i_dp[n] = Math.max(i_dp[n],LIS(i)+1);
                }
            }
        }
        return i_dp[n];
    }

    public static int LDS(int n){
        if(d_dp[n] == null){
            d_dp[n] = 1; // 탐색을 하면 1로 초기화

            //n 이전의 노드 탐색
            for(int i=n+1;i<d_dp.length;i++){
                // 이전의 노드 중 arr[n]의 값보다 작은 값을 발견했을 경우
                if(arr[i]<arr[n]){
                    d_dp[n] = Math.max(d_dp[n],LDS(i)+1);
                }
            }
        }
        return d_dp[n];
    }
}
