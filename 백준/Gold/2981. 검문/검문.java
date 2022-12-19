import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //최대공약수를 찾고 최대공약수와 그의 약수 구하기.

        Arrays.sort(arr);   //오름차순으로 정렬
        int gcdVal = arr[1] - arr[0];   //큰수 - 작은수 > 0

        for(int i=2; i<N;i++){
            //이전 최대공약수 + 다음수의 최대공약수 갱신.
            gcdVal = gcd(gcdVal,arr[i]-arr[i-1]);
        }

        //최대공약수의 약수 찾기
        for(int i=2;i<=gcdVal;i++){
            //i가 최대공약수의 약수라면 출력.
            if(gcdVal%i == 0){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);

    }

    // 최대공약수 함수
    static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}