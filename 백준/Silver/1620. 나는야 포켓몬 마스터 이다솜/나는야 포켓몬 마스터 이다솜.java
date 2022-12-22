import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        String[] nameArr = new String[N+1];
        //입력
        for(int i=1;i<N+1;i++){ //도감번호가 1번부터 시작함
            String name = br.readLine();    //포켓몬 이름 입력
            map.put(name, i);   //맵에 포켓몬 이름과 도감번호 put
            nameArr[i] = name;  
        }
        while (M-->0){
            String find = br.readLine();
            if(isStringNumber(find)){   //도감번호를 입력받은 경우
                int index = Integer.parseInt(find);
                sb.append(nameArr[index]).append("\n");
            }else{  //포켓몬 이름을 입력받은 경우
                sb.append(map.get(find)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    // 입력 받은 문자열이 숫자인지 아닌지 확인
    public static boolean isStringNumber(String s ){
        try{
            Double.parseDouble(s);  //문자열에서 double형 객체로 변경시도 -> 성공시 문자열 = 숫자 이므로 true 반환
            return true;
        }catch (NumberFormatException e){
            return false;   //문자열이 숫자가 아닐시 Double.parseDouble(s)이 실패하므로 예외에 있는 false 반환
        }
    }
}
