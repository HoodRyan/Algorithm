import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int n_fac = 1;
        int k_fac = 1;
        int n_k_fac = 1;
        for(int i=N;i>0;i--)
        {
            n_fac = n_fac*i;
        }
        for(int i=K;i>0;i--)
        {
            k_fac = k_fac*i;
        }
        for(int i=N-K;i>0;i--)
        {
            n_k_fac = n_k_fac*i;
        }
        System.out.println(n_fac / (k_fac*n_k_fac));
        
    }
}