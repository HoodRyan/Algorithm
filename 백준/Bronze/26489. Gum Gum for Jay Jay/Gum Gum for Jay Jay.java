import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while(true){
            String s = br.readLine();
            if(s == null){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}