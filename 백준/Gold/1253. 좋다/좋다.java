
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        /* 투 포인터 이동 원칙
         * arr[start] + arr[end] > i : end--;
         * arr[start] + arr[end] < i : start++;
         * arr[start] + arr[end] == i : start++; end--; cnt++;
        */
        for (int i = 0; i < N; i++) {
            long find = arr[i];
            int start = 0;
            int end = N - 1;
            //투 포인터
            while (start<end){
                if(arr[start] + arr[end] == find){
                    //find는 서로 다른 두 수의 합이여야 함
                    if(start != i && end != i){
                        answer++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (arr[start] + arr[end] < find) {
                    start++;
                }else {
                    end--;
                }
            }
        }
        System.out.println(answer);

    }
}
