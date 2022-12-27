import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double p = Double.parseDouble(st.nextToken());
            double sum = d*p*f;
            String result = String.format("%.2f",sum);
            System.out.println("$"+result);

        }
    }
}