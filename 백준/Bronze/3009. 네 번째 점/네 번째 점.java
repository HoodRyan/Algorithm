import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int a = 0;  //x좌표
        int b = 0;  //y좌표

        if(x1 == x2)
        {
            a = x3;
        }else if(x2==x3)
        {
            a = x1;
        }
        else if(x3 == x1)
        {
            a = x2;
        }

        if(y1 == y2)
        {
            b = y3;
        }else if(y2==y3)
        {
            b = y1;
        }
        else if(y3 == y1)
        {
            b = y2;
        }

        System.out.println(a +" "+b);

    }
}