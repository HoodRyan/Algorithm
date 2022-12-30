import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n 과 m 입력
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1]; // n개의 수
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] =  arr[i-1] + Integer.parseInt(st.nextToken()); //i까지의 누적합 구하기
        }

        while (m-->0){
            st = new StringTokenizer(br.readLine());
            // 구간 i와 j 입력
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // i 와 j 사이의 구간 합은 arr[j] - arr[i-1]과 같다
            System.out.println(arr[j]-arr[i-1]);
        }

        
    }
}