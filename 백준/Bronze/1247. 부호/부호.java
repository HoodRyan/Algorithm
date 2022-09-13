import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger zero = new BigInteger("0");
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger s = zero;
            for (int j = 0; j < n; j++) {
                BigInteger now = new BigInteger(br.readLine());
                s = s.add(now);
            }
            if (s.compareTo(zero) == 0) {
                System.out.println(0);
            } else if (s.compareTo(zero) > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }

        }
    }
}