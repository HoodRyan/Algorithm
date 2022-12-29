import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum = 0; //사람별 대기시간 총합
        int prev = 0; //이전까지 대기시간 누적합

        for(int i=0;i<n;i++){
            //이전까지의 대기시간 + 현재 사람이 걸리는 시간
            sum = sum + prev + arr[i];
            //이전까지의 누적합 + 현재 걸리는 시간
            prev = prev + arr[i];
        }
        System.out.println(sum);

    }
}