import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 99;
        if(N<=99)
        {
            System.out.println(N);
        }
        else if(N>99)
        {
            for(int i=100;i<=N;i++)
            {
                cnt = cnt + OneNumber(i);
            }
            System.out.println(cnt);
        }
    }
    public static int OneNumber(int number)
    {
        int n = number;
        int[] arr = new int[3];
        arr[0] = n/100;
        arr[1] = (n - arr[0]*100)/10;
        arr[2] = n%10;
        int a = arr[0] - arr[1];
        int b = arr[1] - arr[2];

        if(a==b)
        {
            return 1;
        }
        else
            return 0;

    }
}