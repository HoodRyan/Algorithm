
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        /* 투 포인터 이동 원칙
        * arr[start] + arr[end] > M : end--; // 번호의 합이 M보다 크므로 end 인덱스를 내림
        * arr[start] + arr[end] < M : start++; // 번호의 합이 M보다 작으므로 start 인덱스를 올림
        * arr[start] + arr[end] == M : start++; end--; cnt++; // 양쪽 포인터 이동, cnt 증가
        */
        int cnt = 0;
        int start = 0;
        int end = N - 1;
        while (start<end){
            if(arr[start] + arr[end] < M){
                start++;
            } else if (arr[start] + arr[end] > M) {
                end--;
            }else{
                start++;
                end--;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
