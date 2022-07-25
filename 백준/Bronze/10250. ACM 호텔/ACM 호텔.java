import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //테스트케이스 T번
        int w = 0;  //호수
        int h = 0;  //층수
        for(int i=0;i<T;i++)
        {
            int H = sc.nextInt();   //호텔 층 수
            int W = sc.nextInt();   //각 층의 방 수 ->사용 안해도 됨
            int N = sc.nextInt();   //N번째 손님

            //호텔의 층수 = N%H 이지만 N=H일 경우 H임.
           if(N%H == 0) //N=H or 
           {
               System.out.println((H*100)+(N/H));
           }
           else{
               System.out.println(((N % H) * 100) + ((N / H) + 1)); 
           }
        }


    }

}