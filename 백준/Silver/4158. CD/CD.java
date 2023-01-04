import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n==0 && m==0){
                System.out.println(sb);
                return;
            }

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            int pA = 0;
            int pB = 0;
            int answer = 0;

            for(int i=0;i<n;i++){
                arr1[i] = Integer.parseInt(br.readLine());
            }
            for(int i=0;i<m;i++){
                arr2[i] = Integer.parseInt(br.readLine());
            }

            while(true){
                if(pA == n || pB == m)
                    break;
                if(arr1[pA] < arr2[pB]){
                    ++pA;
                }else if(arr1[pA] > arr2[pB]){
                    ++pB;
                }else{
                    ++pA;
                    ++pB;
                    ++answer;
                }
            }
            sb.append(answer).append('\n');
        }
    }
}
