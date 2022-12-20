import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    static int zero_cnt;
    static int one_cnt;
    static int zero_one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(zero_cnt).append(" ").append(one_cnt).append("\n");
        }
        System.out.println(sb);
    }

    /**
     * N Fibonacci(0) Fibonacci(1)
     * 0    1           0
     * 1    0           1
     * 2    1           1
     * 3    1           2
     * 4    2           3
     * 5    3           5
     * 6    5           8
     * 7    8           13
     * 8    13          21
     * -------------------------- 
     * N에 대한 0 호출 횟수 = N -1 의 1 호출 횟수
     * N에 대한 1 호출 횟수 = N -1 의 0 호출 횟수 + N -1 의 1 호출 횟수
     */
    public static void fibonacci(int N){
        //N=0일때 기본값
        zero_cnt = 1;
        one_cnt = 0;
        zero_one = 1;
        for(int i=0;i<N;i++){
            zero_cnt = one_cnt; //0호출 -> 이전의 1호출 횟수로 변경
            one_cnt = zero_one; //1호출 -> 이전의 0호출 횟수 + 1호출 횟수
            zero_one = zero_cnt + one_cnt;  //0과 1 호출 합
        }
    }
}
