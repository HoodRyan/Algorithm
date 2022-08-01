import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());    //2~N까지 자연수
        int K = Integer.parseInt(st.nextToken());    //K번째 지우는 수
        boolean[] check = new boolean[N+1];

        int cnt=0;
        for(int i=2;i<=N;i++){
            for(int j=i;j<=N;j=j+i){
                if(!check[j])
                {
                    cnt++;
                    check[j] = true;
                }
                if(cnt == K){
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }

    }

}