import java.util.*;
import java.io.*;
public class Main{
    public static boolean[] prime = new boolean[10001];     //0~10000까지의 배열 생성
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());    //X번째 분수

        int cross = 1;  //해당 대각선 인자 갯수
        int sum = 0;    //해당 대각선 이전 인자 총 갯수
        while(true)
        {
            if(X<= cross+sum){
                if(cross %2 == 1){  //대각선 인자 갯수 = 홀수
                    //홀수 일 때 = 분자가 큰 수부터 시작됨.
                    //분자 = 해당 대각선 인자 갯수 - (X번째 - 해당 대각선 이전 인자 총 갯수 - 1)
                    //분모 = X번째 - 해당 대각선 이전 인자 총 갯수
                    System.out.println((cross - (X - sum - 1)) + "/" + (X - sum));

                    break;
                }
                else{   //대각선 인자 갯수 = 짝수
                    //짝수 일 때 = 분자가 작은 수부터 시작됨.
                    //분자 = X번째 - 해당 대각선 이전 인자 총 갯수
                    //분모 = 해당 대각선 인자 갯수 - (X번째 - 해당 대각선 이전 인자 총 갯수 - 1)
                    System.out.println((X - sum) + "/" + (cross - (X - sum - 1)));
                    break;
                }
            }
            else{
                sum = sum + cross;
                cross++;
            }
        }

    }
}