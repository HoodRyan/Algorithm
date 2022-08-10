import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());    //문자열의 길이
        String s = br.readLine();
        long r =1;
        long result = 0;
        for(int i=0;i<L;i++){
            result = result + ((s.charAt(i)-96)*r)%1234567891;
            r = (r*31)%1234567891;
        }
        System.out.println(result%1234567891);

    }
}