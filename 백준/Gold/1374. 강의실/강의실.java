import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        // 입력 데이터 오름차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) // 시작시간이 같다면, 끝나는 시간을 오름차순으로 정렬
                    return o1[2] - o2[2];
                return o1[1] - o2[1];
            }
        });

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(arr[0][2]); // 첫 강의가 끝나는 시간 추가.

        for(int i=1;i<n;i++){
            //두 번째 강의부터 강의 시작 시간이 이전 강의가 끝나는 시간보다 빠르거나 같으면, 값을 반환하고 제거
            if(q.peek() <= arr[i][1])
                q.poll();
            q.add(arr[i][2]); // 그 이후 현재강의의 끝나는 시간을 q에 추가
        }

        System.out.println(q.size()); //q에 남은 데이터의 갯수 = 필요한 강의실의 갯수
    }
}