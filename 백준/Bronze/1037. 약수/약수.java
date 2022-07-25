import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        if(N==1)
        {
            num = arr[0]*arr[0];
        }
        else
        {
            Arrays.sort(arr);
            num = arr[0]*arr[N-1];
        }
        System.out.println(num);
    }
}