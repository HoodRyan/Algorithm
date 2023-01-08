
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];
        int sum1 = 0;
        for(int i=0;i<4;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum1 += arr[i];
        }

        int[] arr2 = new int[4];
        int sum2 = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            arr2[i] = Integer.parseInt(st.nextToken());
            sum2 += arr2[i];
        }

        if(sum1>=sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }
    }


}