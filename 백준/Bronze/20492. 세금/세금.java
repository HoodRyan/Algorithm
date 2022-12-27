import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double a = N*0.78;
        double b = N*0.8 + ((N*0.2) - (N*0.2)*0.22);
        System.out.print((int)a + " ");
        System.out.print((int)b);
    }
}