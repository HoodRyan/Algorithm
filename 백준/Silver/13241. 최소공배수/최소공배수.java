import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long GCD = min(N,K);  //두 수의 최대공약수
        long LCM = N*K/GCD; //두 수의 최소공배수
        System.out.print(LCM);

    }
    //최대 공약수 구하기
    public static long min(long A,long B)
    {
        if(A>B)
        {
            while(B!=0){
                long r = A%B;
                A=B;
                B=r;
            }
            return A;
        }
        else if(A<B)
        {
            while(A!=0){
                long r = B%A;
                B=A;
                A=r;
            }
            return B;
        }
        else {
            return A;
        }

    }
}