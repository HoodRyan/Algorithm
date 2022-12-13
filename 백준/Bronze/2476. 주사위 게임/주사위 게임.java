
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;    //최대 상금
        int total;  //현재 상금
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && b == c) { //주사위 숫자가 모두 같은경우
                total = 10000 + a * 1000;
            } else if (a == b) {    //주사위 숫자가 2개만 같은 경우
                total = 1000 + a * 100;
            } else if (b == c) {    //주사위 숫자가 2개만 같은 경우
                total = 1000 + b * 100;
            } else if (c == a) {    //주사위 숫자가 2개만 같은 경우
                total = 1000 + c * 100;
            } else {                //주사위 숫자가 모두 다른 경우
                total = Math.max(a, Math.max(b,c)) * 100;
            }
            max = Math.max(max, total);
        }
         System.out.println(max);
     }
}
