import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0; // 귀걸이를 돌려받지 못한 여학생들 번호
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }else{
                cnt++;
            }

            ArrayList<String> girlsName = new ArrayList<>();    // 여학생들 순서대로 저장
            for(int i=0;i<n;i++){
                girlsName.add(br.readLine());   // n명의 여학생 이름 입력
            }

            ArrayList<Integer> isNum = new ArrayList<>();   // 입력받은 숫자 저장
            for(int i=0;i<n*2-1;i++){   //귀걸이의 이동 n*2 -1 회
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                if(isNum.contains(num)){    // 같은 수가 두번 입력시 귀걸이는 되돌려 받은것.
                    isNum.remove((Integer) num);    //리스트에 있다면 리스트에서 해당 값 제거
                }else{
                    isNum.add(num); //값이 리스트에 없다면 귀걸이를 처음 뺏긴 것으로 리스트에 값 추가
                }
            }
            int result = isNum.get(0);  //귀걸이를 돌려받지 못했다면 isNum 리스트에 번호가 남아있음
            System.out.println(cnt + " " + girlsName.get(result - 1)); 
        }
    }
}
