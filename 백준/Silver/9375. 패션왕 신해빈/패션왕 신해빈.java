import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            HashMap<String,Integer> hashMap = new HashMap<>();  // <옷 종류 , 개수 저장>
            int n = Integer.parseInt(br.readLine());
            while (n-->0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); //옷 이름 ->필요x
                String kind = st.nextToken(); // 옷 종류

                // 해당 종류의 옷이 있을경우 -> 해시맵에 저장된 해당 종류의 개수 +1
                // 해당 종류의 옷이 없을경우 -> 해당 종류와 개수1을 넣는다
                if(hashMap.containsKey(kind)){
                    hashMap.put(kind,hashMap.get(kind)+1);
                }else{
                    hashMap.put(kind,1);
                }

            }

            int result = 1;
            for(int val : hashMap.values()){
                result = result*(val+1);    //각 종류별 입지 않는 경우 고려해 각 종류별 개수 +1
            }
            sb.append(result-1).append("\n");   // 알몸인 상태를 제외해야 하므로 -1
        }
        System.out.println(sb);

    }
}