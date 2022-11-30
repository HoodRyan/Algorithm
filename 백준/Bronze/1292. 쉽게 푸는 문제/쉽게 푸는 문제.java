import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[1001];
        int cnt = 1;

        // 1 22 333 444 55555 배열 입력
        for(int i=0;i<1000;i++){
            for(int j=0;j<i+1;j++){
                if(cnt == 1001) 
                    break;
                arr[cnt] = i+1;
                cnt++;
            }
        }
        int sum = 0;
        for(int i=A;i<=B;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);


    }
}
