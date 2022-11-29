import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}