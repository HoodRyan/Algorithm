import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] distance = new long[n-1]; // 거리
        long[] price = new long[n]; // 비용

        //마을 간의 거리
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n-1;i++){
            distance[i] = Long.parseLong(st.nextToken());
        }

        //리터당 기름값
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            price[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = price[0]; //이전 과정까지 최소 주유비용
        for(int i = 0; i < n - 1; i++) {

            /*
             *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
             *  min을 갱신해준다.
             */
            if(price[i] < min) {
                min = price[i];
            }

            sum += (min * distance[i]);
        }

        System.out.println(sum);

    }
}