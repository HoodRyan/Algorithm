import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ur = Integer.parseInt(st.nextToken());
        int Tr = Integer.parseInt(st.nextToken());
        int Uo = Integer.parseInt(st.nextToken());
        int To = Integer.parseInt(st.nextToken());

        int sum = Ur*56 + Tr*24 + Uo*14 + To*6;
        System.out.println(sum);
    }
}