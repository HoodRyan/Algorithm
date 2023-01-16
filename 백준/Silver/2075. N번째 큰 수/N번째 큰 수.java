import java.io.*;
import java.util.*;

public class Main {
    public static PriorityQueue<Integer> q;
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        q = new PriorityQueue<>(Collections.reverseOrder()); // 오름차순 정렬
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                q.add(Integer.parseInt(st.nextToken()));
            }
        }

        int pq = priority_q();
        System.out.println(pq);

    }
    public static int priority_q(){
        int cnt = 1; // poll 한 횟수
        while(!q.isEmpty()){ // 큐가 빌 때까지 poll
            if(cnt == n){ // poll 한 횟수가 n과 같아진다면 
                return q.poll(); // cnt 번째 poll 한 값을 리턴
            }else{
                q.poll(); 
            }
            cnt++;
        }
        return -1;
    }
}
