import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int rev1 = Rev(X);
        int rev2 = Rev(Y);
        int rev = Rev(rev1 + rev2);
        System.out.println(rev);

    }

    public static int Rev(int x) {
        if (x < 10) {
            return x;
        }else if(x>=10 && x<100){
            int a = x/10;
            int b = x%10;
            int q = b*10 + a;
            return q;
        }
        else if(x>=100 && x<1000){
            int a = x/100;
            int b = (x%100)/10;
            int c = x%10;
            int q = c*100 + b*10 + a;

            return q;
        }else{
            int a = x/1000;
            int b = (x%1000)/100;
            int c = (x%100)/10;
            int d = x%10;
            int q = d*1000 + c*100 + b*10 + a;

            return q;
        }
    }
}
