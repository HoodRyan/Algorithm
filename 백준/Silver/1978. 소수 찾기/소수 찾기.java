import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int X;
        for(int i=0;i<N;i++)
        {
            X = sc.nextInt();
            for(int j=2;j<=X;j++)    //2~(N-1)까지 나머지를 구해서 0이 되는 값이 있으면 소수가 아님.
            {
                if(j == X)
                {
                    cnt++;
                }
                if(X%j == 0)
                {
                    break;
                }
            }   //소수 2는 자동으로 for문 통과


        }
        System.out.println(cnt);
    }
}