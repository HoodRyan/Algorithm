import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);

    }

    public static void dfs(int at, int depth) {
        //깊이가 m과 같을경우 출력
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }


        for (int i = at; i <= N; i++) {
            //현재 깊이를 index로 하여 해당위치에 i값 담음
            arr[depth] = i;

            /*
            재귀 - 현재 i 값보다 다음 재귀에서 커져야하므로
            i에 +1한 값을 넘겨주고, 깊이 또한 +1 증가시켜 재귀호출함
             */
            dfs(i + 1, depth + 1);

        }
    }
}