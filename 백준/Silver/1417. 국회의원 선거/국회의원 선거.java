import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //후보의 수 n
        int num = Integer.parseInt(br.readLine()); //기호 1번 찍는 사람의 수
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (n-->1){ // 기호 2번 부터의 찍는 사람 수
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        while(!pq.isEmpty() && pq.peek() >= num){ // 큐가 비어있지 않거나, 큐의 첫 번째 값이 앞 번호보다 클 경우
            cnt++;
            num++; 
            pq.add(pq.poll()-1); // 최댓값을 -1 
        }
        System.out.println(cnt);
    }
}