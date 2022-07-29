import java.util.*;
import java.io.*;
public class Main{
    public static boolean[] prime = new boolean[246913];
    //N < 123456 이므로 2N 은 최대 246912 ->0부터 시작하기 때문에 246912 + 1 = 246913
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        get_prime();
        while(true)
        {
            int N = Integer.parseInt(br.readLine());    //N이상 2N이하
            if(N==0)
            {
                break;
            }
            int cnt = 0;

            for(int i=N+1;i<=2*N;i++)   //N보다 크고 2N보다 작거나 같음
            {
                if(!prime[i])   // !prime[i] => prime[i] == false (false = 소수)
                {
                    cnt++;
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);

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