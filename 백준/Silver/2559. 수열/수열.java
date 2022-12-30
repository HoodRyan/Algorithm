import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n 과 k 입력
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1]; // n개의 수
        int[] sum = new int[n+1];
        st = new StringTokenizer(br.readLine());

        //1부터 n까지 누적합 구하기
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i == 1)
                sum[i] = arr[i];
            else
                sum[i] = sum[i-1] + arr[i];
        }

        int max_sum = Integer.MIN_VALUE;

        // 1 ~ k 까지의 합 = sum[k] - sum[0];
        // 2 ~ k+1 까지의 합 = sum[k+1] - sum[1];
        for(int i=k;i<=n;i++){
            max_sum = Math.max(max_sum,sum[i]-sum[i-k]);
        }
        System.out.println(max_sum);
    }
}