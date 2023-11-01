
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] prefix_sum = new long[N]; // 구간 합 배열
        long[] same_remainder = new long[M]; // 같은 나머지의 인덱스 카운트
        long answer = 0;

        prefix_sum[0] = sc.nextInt();
        //구간 합
        for (int i = 1; i < N; i++) {
            prefix_sum[i] = prefix_sum[i-1] + sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int remainder = (int) (prefix_sum[i] % M); // 구간 합을 M으로 나눈 나머지 값
            //0 ~ i 구간 까지의 구간 합 자체가 0일 때
            if(remainder == 0){
                answer++;
            }
            //나머지가 같은 인덱스의 개수 카운팅
            same_remainder[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if(same_remainder[i] > 1){
                //same_remainder[i] (i가 나머지인 인덱스의 개수)에서 2가지를 뽑는 경우의 수를 정답에 더함
                //same_remainder[i]개 중 2개를 뽑는 경우의 수 계산 공식 
                // => (same_remainder[i] * (same_remainder[i]-1)/2) 
                answer = answer + (same_remainder[i] * (same_remainder[i]-1)/2);
            }
        }
        System.out.println(answer);



    }
}
