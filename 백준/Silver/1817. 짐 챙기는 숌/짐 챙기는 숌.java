import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());   //책의 개수
        int M = Integer.parseInt(st.nextToken());   //박스 최대 무게
        int box = 0;    //책이 담긴 박스 무게
        int cnt = 1;    //필요한 박스 갯수
        if(N != 0)
        {
            st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<N;i++)
            {
                int book = Integer.parseInt(st.nextToken());    //각 책의 무게
                if(box + book <= M){
                    box = box + book;
                }
                else{
                    cnt++;
                    box = book;
                }
            }
        }
        else{
            cnt = 0;    //책이 0개일 경우
        }
        System.out.println(cnt);
    }
}