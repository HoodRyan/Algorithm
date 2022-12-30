import java.io.*;
import java.util.*;

public class Main {
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new long[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = -1; 
        }
        arr[0] = 0;
        arr[1] = 1;
        long fib = Fib(n);
        System.out.println(fib);
    }
    public static long Fib(int n){
        if(arr[n] == -1){
            arr[n] = Fib(n-1) + Fib(n-2);
        }
        return arr[n];
    }

}
