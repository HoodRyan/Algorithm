import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        boolean[] arr = new boolean[10001];    //1~10000배열
        for(int i=1;i<10001;i++)
        {
            int n = notSelfNum(i);
            if(n<10001)
            {
                arr[n] = true;  //셀프넘버가 아닌 수에 true값 부여 =>셀프넘버 = false
            }
        }

        StringBuilder sb =new StringBuilder();

        for(int i=1;i<10001;i++)    // 셀프넘버 출력
        {
            if(arr[i]==false)   // -> !arr[i]
            {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int notSelfNum(int number)
    {
        int sum = number;
        while(number != 0)    //셀프넘버 아닌수 구하기
        {
            sum = sum +(number%10);
            number = number/10;
        }
        return sum;
    }
}