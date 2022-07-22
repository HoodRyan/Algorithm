import java.util.Arrays;
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
        int D = (x2-x1)*(y3-y1) - (x3-x1)*(y2-y1);
        // a벡터 x b벡터 = (0,0,(x2-x1)*(y3-y1) - (x3-x1)*(y2-y1))
        // 방향성 D>0 =>반시계 / D<0 =>시계 / D=0 =>평행
        if(D>0)
        {
            System.out.println("1");
        }
        else if(D<0)
        {
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }

}
