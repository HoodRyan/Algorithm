import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int i=5;
        st = new StringTokenizer(br.readLine());
        while (i-->0){
            int num = Integer.parseInt(st.nextToken());
            sb.append(num - L*P).append(" ");
        }
        System.out.println(sb);

    }

}