import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<N;i++)
        {
            int A = arr[0];
            int B = arr[i];
            int n = min(A,B);
            System.out.println(arr[0]/n + "/" + arr[i]/n);
        }
        
    }
     //최대 공약수 구하기
    public static int min(int A,int B)
    {
        if(A>B)
        {
            while(B!=0){
                int r = A%B;
                A=B;
                B=r;
            }
            return A;
        }
        else if(A<B)
        {
            while(A!=0){
                int r = B%A;
                B=A;
                A=r;
            }
            return B;
        }
        else {
            return A;
        }
    }
}