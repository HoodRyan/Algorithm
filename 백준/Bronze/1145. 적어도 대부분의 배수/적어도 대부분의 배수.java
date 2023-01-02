import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;    //공통 약수의 갯수
        int val = 1;    //배수가 되는 값. 1부터 시작

        while(true){
            for(int i=0;i<5;i++){
                if(val % arr[i] == 0){  //val이 arr[i]의 배수라면 cnt++
                    cnt++;
                }
            }
            if(cnt >= 3){   //공통 약수가 3개 이상이 되면 출력 및 종료
                System.out.println(val);
                break;
            }
            cnt = 0;    // 공통 약수의 갯수 초기화
            val++;  //값++
        }
    }
}
