import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt=0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] str1 = new String[N];


        for(int i=0;i<N;i++){
            str1[i] = br.readLine();
        }

        for(int i=0;i<M;i++){
            String str2 = br.readLine();
            for(int j=0;j<N;j++)
            {
                if(str1[j].compareTo(str2)==0)
                {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }

}
