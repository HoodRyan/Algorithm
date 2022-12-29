import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];

        for(int i=0;i<n;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for(int i=n-1;i>=0;i--){
            // 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
            if(coin[i] <= k){
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                cnt += (k/coin[i]);
                k = k % coin[i];
            }
        }
        System.out.println(cnt);

    }
}