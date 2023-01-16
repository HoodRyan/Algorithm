import java.io.*;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1); //절대값
            int abs2 = Math.abs(o2); //절대값

            if(abs1 == abs2){
                if(o1>o2)
                    return 1;
                else
                    return -1;
            }else{
                return abs1 - abs2;
            }
        });

        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){ // 0이 주어진 횟수
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
