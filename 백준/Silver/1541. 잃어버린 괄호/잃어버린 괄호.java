import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; //초기값 설정
        StringTokenizer sub = new StringTokenizer(br.readLine(),"-");
        //hasMoreTokens() -> StringTokenizer 클래스 객체에서 다음에 읽어 들일 token 이 있으면 true, 없으면 false
        while(sub.hasMoreTokens()){
            int temp = 0;
            // 뺄셈으로 나눈 토큰을 다시 덧셈으로 분리
            StringTokenizer add = new StringTokenizer(sub.nextToken(),"+");
            while(add.hasMoreTokens()){
                // 덧셈으로 분리된 토큰들을 모두 더함
                temp += Integer.parseInt(add.nextToken());
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum = sum - temp;
            }
        }
        System.out.println(sum);
    }
}