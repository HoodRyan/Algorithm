import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static int V;
    public static int[][] branch;
    public static boolean[] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        branch = new int[1001][1001];
        visit = new boolean[1001];


        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            branch[a][b] = branch[b][a] = 1;
        }

        DFS(V);
        System.out.println();
        Arrays.fill(visit,false);
        BFS(V);

    }

    public static void DFS(int V){
        visit[V] = true;
        System.out.print(V + " ");
        for(int i=1;i<=N;i++){
            if(branch[V][i] == 1 && visit[i] == false){
                DFS(i);
            }
        }
    }

    public static void BFS(int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visit[V] = true;
        System.out.print(V + " ");

        while (!q.isEmpty()){
            int temp = q.poll();

            for(int i = 1; i< branch.length; i++){
                if(branch[temp][i] == 1 && visit[i] == false){
                    q.add(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}