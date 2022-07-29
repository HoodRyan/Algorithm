import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        if(N == 0)
        {
            System.out.println();
        }
        else{
            for(int i =2;i<=N;i++)
            {
                while(N%i == 0)
                {
                    N = N/i;
                    sb.append(i).append('\n');
                }
            }
            System.out.println(sb);
        }
    }
}