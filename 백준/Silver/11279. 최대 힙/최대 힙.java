import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); //내림차순 변경
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(q.size() == 0){ //배열이 비어있는 경우인데 가장 큰 값을 출력 시
                    sb.append(0).append('\n');
                }else{ //배열에서 가장 큰 값을 출력 후 그 값을 제거.
                    sb.append(q.poll()).append('\n');
                }
            }else{
                q.add(x);
            }
        }
        System.out.println(sb);
    }
}
