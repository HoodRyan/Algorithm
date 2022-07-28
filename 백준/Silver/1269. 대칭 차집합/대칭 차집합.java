import java.util.*;
import java.io.*;
public class Main{
    public static HashSet<Integer> hs = new HashSet<>();
    public static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            hs.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++){
            int s = Integer.parseInt(st.nextToken());   //B의 원소 입력
            if(hs.contains(s)){ //만약 해쉬셋(A)가 B의 원소를 가지고 있다면
                ans.add(s); // ArrayList<Integer> ans 에 겹치는 수 추가
            }
        }
        System.out.println(N+M - 2*ans.size()); //A의 원소 수 + B의 원소 수 - (겹치는 수의 개수)x2
    }

}
