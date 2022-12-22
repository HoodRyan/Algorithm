import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[][] = new String[n][4];
        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr,  new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //o1와 o2는 String이기때문에 equals로 값 비교
                if(o1[3].equals(o2[3])) {  
                    if(o1[2].equals(o2[2])) {   
                        //연도 같고, 월도 같으면 일별로 오름차순
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                    }
                    // 연도 같고 월도 같다면 월별로 오름차순
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }  //연도가 같다면 연별로 오름차순
                return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
            }
        });
        System.out.println(arr[n - 1][0] + "\n" + arr[0][0]);
    }
}
