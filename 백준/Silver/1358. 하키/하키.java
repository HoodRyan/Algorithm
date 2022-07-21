import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();   //경기장 가로 길이
        int H = sc.nextInt();   //경기장 높이
        int X = sc.nextInt();   //좌측 모서리 X좌표
        int Y = sc.nextInt();   //좌측 모서리 Y좌표
        int P = sc.nextInt();   //선수 수
        int cnt = 0;

        for(int i=0;i<P;i++)
        {
            int a = sc.nextInt();   //선수의 x좌표
            int b = sc.nextInt();   //선수의 y좌표

            if(b>=Y && b<=Y+H)  //선수의 y좌표가 경기장높이에 포함될때만
            {
                if(a>=X)
                {
                    if(a<=X+W ) //직사각형 구역에 포함될 때
                    {
                        cnt++;
                    }
                    else if(a>X+W){ //직사각형 우측 구역
                        if((a-(X+W))*(a-(X+W)) + (b-(Y+H/2))*(b-(Y+H/2)) <= (H/2)*(H/2))
                        {   //반지름 길이의 제곱이 경기장 반원의 반지름(H/2) 제곱보다 작으면 cnt++
                            cnt++;
                        }
                    }
                }
                else if(a<X)    //직사각형 좌측 구역
                {
                    if((X-a)*(X-a) + ((Y+H/2)-b)*((Y+H/2)-b) <= (H/2)*(H/2))    
                    {   //반지름 길이의 제곱이 경기장 반원의 반지름(H/2) 제곱보다 작으면 cnt++
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
