import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());    //테스트케이스
        for(int i=0;i<n;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long gcd = GCD(a,b);

            sb.append(a*b/gcd).append('\n');
        }
        System.out.print(sb);
    }

    //최대 공약수 구하기
    public static long GCD(long A,long B)
    {
        long mod;
        while((mod = A%B)>0){
            A = B;
            B = mod;
            mod = A%B;
        }
        return B;

    }
}