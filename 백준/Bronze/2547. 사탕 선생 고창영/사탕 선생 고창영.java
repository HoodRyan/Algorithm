import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for(int j=0;j<N;j++){
                sum = sum.add(sc.nextBigInteger());
            }
            String r = String.valueOf(sum.remainder(BigInteger.valueOf(N)));    //BigInteger의 나머지 구하기
            if(r.equals("0")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}