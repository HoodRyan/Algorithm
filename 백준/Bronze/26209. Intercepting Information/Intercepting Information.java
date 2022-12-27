import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[]arr = new int[8];
        String s = "S";
        for(int i=0;i<8;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == 9){
                s = "F";
            }
        }
        System.out.println(s);

    }
}