
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1; // N이 15일 때 숫자 15를 뽑는 경우의 수
        int start = 1; // 시작점
        int end = 1; // 끝점
        int sum = 1;
        /* 투 포인터 이동 원칙
        *  sum > N : sum = sum - start; start++;
        *  sum < N : end++; sum = sum + end;
        *  sum == N : end++; sum = sum + end; cnt++;
        * */

        while (end != N){
            if(sum == N){ // 현재 연속 합이 N과 같을 경우
                cnt++;
                end++;
                sum = sum + end;
            } else if (sum > N) { // 현재 연속 합이 N보다 더 큰 경우
                sum = sum - start;
                start++;
            }else{ // 현재 연속 합이 N보다 작은 경우
                end++;
                sum = sum + end;
            }
        }
        System.out.println(cnt);
    }
}