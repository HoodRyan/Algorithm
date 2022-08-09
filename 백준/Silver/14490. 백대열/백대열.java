import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int GCD = gcd(n,m);
        System.out.print(n/GCD+":"+m/GCD);
    }

    //최대 공약수 구하기
    public static int gcd(int A,int B)
    {
        if(A>B)
        {
            while(B!=0){
                int r = A%B;
                A=B;
                B=r;
            }
            return A;
        }
        else if(A<B)
        {
            while(A!=0){
                int r = B%A;
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