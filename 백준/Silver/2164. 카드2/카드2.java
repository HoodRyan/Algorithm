import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  //N장의 카드
        Queue<Integer> q = new LinkedList<>();  //자료 삽입, 삭제에 유용한 LinkedList 사용
        for(int i=1;i<=N;i++)
        {
            q.offer(i);
        }
        for(int i=0;i<N-1;i++)  //N-1개의 카드를 삭제하면 마지막에 한장의 카드만 남게 됨
        {
            q.poll();   //맨 뒤에 있는 카드 삭제
            int x = q.poll();   //그 다음 맨 뒤에 있는 카드 값을 반환 후 삭제
            q.offer(x); //반환된 값을 맨 앞에 삽입
        }
        int a = q.poll();
        System.out.println(a);

    }
}