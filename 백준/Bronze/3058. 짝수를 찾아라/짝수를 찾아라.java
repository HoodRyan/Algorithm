import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //테스트케이스 갯수
        for(int i=0;i<N;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int[] arr = new int[7];
            int sum=0;
            int min=101;
            for(int j=0;j<7;j++){
                arr[j] = Integer.parseInt(st.nextToken());
                if(arr[j]%2==0){
                    sum = sum + arr[j];
                    if(arr[j]<min){
                        min = arr[j];
                    }
                }
            }

            System.out.println(sum + " " + min);
        }

    }
}