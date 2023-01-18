import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); //시작 시간
            time[i][1] = Integer.parseInt(st.nextToken()); //종료 시간
        }

        Arrays.sort(time, ((o1, o2) -> {
            if(o1[1] == o2[1]){ // 종료시간이 같을 경우 시작 시간이 빠른 순으로 정렬
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        }));

        int cnt = 0;
        int end = 0;
        for(int i=0;i<n;i++){
            if(end <= time[i][0]){ //직전 종료시간 <= 다음 회의 시작시간
                end = time[i][1]; //다음 회의 종료시간으로 갱신
                cnt++; //회의실 갯수 추가
            }
        }
        System.out.println(cnt);
    }
}