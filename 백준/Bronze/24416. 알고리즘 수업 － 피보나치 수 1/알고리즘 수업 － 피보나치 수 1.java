import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int cnt = 0;
    static int dp_cnt = 0;
    static int[] arr;
    public static int fib(int n){
        if(n == 1 || n == 2){
            cnt++;
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static int fib_dp(int n){
        arr[1] = arr[2] = 1;
        for(int i = 3; i <= n; i++){
            dp_cnt++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N+1];
        fib(N);
        fib_dp(N);
        System.out.println(cnt);
        System.out.println(dp_cnt);

    }
}
