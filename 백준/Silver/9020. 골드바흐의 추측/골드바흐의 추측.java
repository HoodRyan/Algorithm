import java.util.*;
import java.io.*;
public class Main{
    public static boolean[] prime = new boolean[10001];     //0~10000까지의 배열 생성
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        get_prime();
        int T = Integer.parseInt(br.readLine());    //테스트 케이스 갯수

        while(T-->0)    //while(T--;t>0;) 와 같음
        {
            int n = Integer.parseInt(br.readLine());
            int p = n/2;    //앞에 올 소수
            int q = n/2;    //뒤에 올 소수
            while(true)
            {
                if(!prime[p] && !prime[q])  // !prime[i] => prime[i] == false (false = 소수)
                {
                    System.out.println(p+ " "+ q);
                    break;
                }
                p--;
                q++;
            }
        }

    }

    //에라토스테네스의 체
   public static void get_prime()
    {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}