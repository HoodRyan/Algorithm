import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();  //해쉬셋 사용
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();   //이름
            String commute = st.nextToken();    //출퇴근
            if(commute.equals("enter")) {   //enter이 나오면 이름을 해쉬맵에 추가
                set.add(name);
            }else{  //leave는 이미 enter 되있어야 나올 수 있음 -> leave가 나오면 해당 이름을 제거함
                set.remove(name);   
            }
        }
        List<String> array = new ArrayList<>(set);
        array.sort(Collections.reverseOrder()); //내림차순

        for (String s : array) {
            sb.append(s).append('\n');
        }
        System.out.print(sb);
    }
}