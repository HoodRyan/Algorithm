import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();   //대각선길이
        int H = sc.nextInt();   //세로
        int W = sc.nextInt();   //가로

        Double a = Math.sqrt((D*D)/(double)(W*W + H*H));
        //Math.sqrt => 제곱근

        System.out.print((int)Math.floor(a*H) + " " + (int)Math.floor(a*W));
        //Math.floor => 내림

    }

}
