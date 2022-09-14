import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();   //L = 방학 일수
        int A = sc.nextInt();   //A = 국어 총 페이지
        int B = sc.nextInt();   //B = 수학 총 페이지
        int C = sc.nextInt();   //C = 국어 하루 최대치
        int D = sc.nextInt();   //D = 수학 하루 최대치
        int cntA;   //국어 숙제를 전부 푸는 최단 기간
        int cntB;   //수학 숙제를 전부 푸는 최단 기간
        if(A%C ==0){
            cntA = A/C;
        }else{
            cntA = A/C + 1;
        }
        if(B%D==0){
            cntB = B/D;
        }else{
            cntB = B/D + 1;
        }
        int max = Math.max(cntA,cntB);
        System.out.println(L - max);


    }
}