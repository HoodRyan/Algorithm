import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int[][] prefix_sum = new int[s.length()+1][26]; //누적 합 기록 배열

        prefix_sum[1][s.charAt(0)-'a']++;   // 처음 값 횟수 증가
        for(int i=2;i<=s.length();i++){ //나머지 문자 탐색
            int idx = s.charAt(i-1) - 'a';  //탐색 중인 문자
            for(int j=0;j<26;j++){  //알파벳 (a~z) 탐색
                int before_sum = prefix_sum[i-1][j];    //이전 알파벳의 누적 합
                //알파벳과, 탐색 중인 문자가 같다면 ? 이전 값 + 1 / 아니라면 이전 값과 동일
                prefix_sum[i][j] = j == idx ? before_sum+1 : before_sum;
            }
        }
        while(n --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = st.nextToken().charAt(0) - 'a';   //문자
            int l = Integer.parseInt(st.nextToken())+1; //시작점
            int r = Integer.parseInt(st.nextToken())+1; //끝점
            //끝점의 누적합 - 시작점 바로 이전의 누적합 = 구간의 문자 반복값
            sb.append(prefix_sum[r][idx] - prefix_sum[l-1][idx]).append('\n');
        }
        System.out.println(sb);
    }


}
