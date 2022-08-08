import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            long N = Integer.parseInt(st.nextToken());
            long M = Integer.parseInt(st.nextToken());

            long result = 1;
            //nCr 조합공식 사용
            for(int j=0;j<N;j++){
                result = result*(M-j);  //분모
                result = result/(j+1);  //분자
            }
            System.out.println(result);

        }
    }
}