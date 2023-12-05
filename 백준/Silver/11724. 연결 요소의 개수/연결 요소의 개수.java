
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//노드의 최대 개수가 1000 -> 시간복잡도 N^2 이하의 모든 알고리즘 사용 가능
// DFS 사용
public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 노드 개수
        int m = Integer.parseInt(st.nextToken()); // 에지 개수
        A = new ArrayList[n+1]; // 그래프 데이터 저장 인접 리스트
        visited = new boolean[n+1]; // 방문 기록 저장 배열

        // A 인접 리스트 초기화하기
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            // 양방향 에지이므로 양쪽에 에지를 더하기
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for (int i = 1; i < n+1; i++) {
            // 방문하지 않은 노드가 없을 때까지 반복하기
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    static void DFS(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for( int i : A[v]){
            // 연결 노드 중 방문하지 않았던 노드만 탐색하기
            if(visited[i] == false){
                DFS(i);
            }
        }
    }


}
