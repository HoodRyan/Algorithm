import java.util.*;
import java.io.*;
public class Main{
    public static boolean[] prime;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());    //M이상
        int N = Integer.parseInt(st.nextToken());    //N이하

        prime = new boolean[N+1];
        get_prime();

        for(int i=M;i<=N;i++)
        {
            if(!prime[i])   // !prime[i] => prime[i] == false (false = 소수)
            {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);

    }
    //에라토스테네스의 체 알고리즘
    public static void get_prime(){
        prime[0] = prime[1] = true;
        for(int i=2; i<=Math.sqrt(prime.length);i++)
        {
            for(int j=i*i; j<prime.length;j=j+i){
                prime[j] = true;
            }
        }
    }
}