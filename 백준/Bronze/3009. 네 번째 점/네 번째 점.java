import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.printf("%d %d",x1^x2^x3,y1^y2^y3);
        //비트연산자 
        //ex) x1 = 5 , x2= 5 , x3 = 7 일때
        //x1^x2 -> x1 = 0101 , x2 = 0101 -> x1^x2 = 0000
        //(x1^x2)^x3 -> (x1^x2) = 0000 , x3 = 0111 -> x1^x2^x3 = 0111
        
        //ex) x1 = 5 , x2= 7 , x3 = 5 일때
        //x1^x2 -> x1 = 0101 , x2 = 0111 -> x1^x2 = 0010
        //(x1^x2)^x3 -> (x1^x2) = 0010 , x3 = 0101 -> x1^x2^x3 = 0111

    }
}
