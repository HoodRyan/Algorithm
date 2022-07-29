import java.util.*;
import java.io.*;
public class Main{
    public static boolean[] prime;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());    //M이상
        int N = Integer.parseInt(br.readLine());    //N이하
        int sum = 0;
        int min = Integer.MAX_VALUE;
        prime = new boolean[N+1];
        get_prime();
        for(int i=M;i<=N;i++)
        {
            if(!prime[i])   // !prime[i] => prime[i] == false (false = 소수)
            {
                sum = sum+i;
                if(min == Integer.MAX_VALUE){   //최솟값 구하기
                    min = i;
                }
            }
        }
        if(sum == 0)    //소수 X일 때
        {
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
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