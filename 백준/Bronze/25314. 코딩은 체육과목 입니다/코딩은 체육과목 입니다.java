import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int s = n/4;
        for(int i=0;i<s;i++){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}