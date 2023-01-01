import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //N개의 점
        long[] arr1 = new long[N+1];    //x좌표
        long[] arr2 = new long[N+1];    //y좌표
        long s_a = 0;   //신발끈 공식 x 숫자
        long s_b = 0;   //신발끈 공식 y 숫자
        for(int i=0;i<N;i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        arr1[N] = arr1[0];  //신발끈 공식 사용하기 위해 N+1 번 인덱스에 0번 인덱스 값 넣어줌
        arr2[N] = arr2[0];

        for(int i=0;i<N;i++)    //시그마 i=0~i=n-1 까지 절댓값 (arr1[i]*arr2[i+1] - arr1[i+1]*arr2[i])
        {
            s_a = s_a + arr1[i]*arr2[i+1];
            s_b = s_b + arr1[i+1]*arr2[i];
        }

        String sum = String.format("%.1f",Math.abs(s_a - s_b)/2.0 );
        System.out.println(sum);    //신발끈 공식(Math.abs(s_a - s_b)/2)

    }

}
