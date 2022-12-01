import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));  //문자열을 하나씩 잘라 출력
            if(i%10 == 9){  // 10의 배수일때마다 줄 넘김
                System.out.println();
            }
        }

    }
}
