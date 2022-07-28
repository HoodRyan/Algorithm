import java.util.*;
import java.io.*;
public class Main{
    public static HashSet<String> hs = new HashSet<>();
    public static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //해쉬셋에 듣도 못한 사람 추가
        for(int i=0;i<N;i++){   
            hs.add(br.readLine());  // = arr[i] = br.readLine();
        }

        for(int i=0;i<M;i++){
            String s = br.readLine();   //보도 못한 사람 입력
            if(hs.contains(s)){ //만약 해쉬셋이 보도 못한 사람을 가지고 있다면
                ans.add(s); // ArrayList<String> ans 에 보도 못한 사람 추가
            }
        }
        Collections.sort(ans);  //ans 정렬
        System.out.println(ans.size()); // 듣보잡 수 출력
        for(int i=0;i<ans.size();i++)
        {
            sb.append(ans.get(i)).append('\n'); // 듣보잡 출력
        }
        System.out.print(sb);

    }

}
