import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int N = sc.nextInt();
            int[] arr = new int[4];
            if(N == 0)
            {
                break;
            }
            else if(N<10)
            {
                System.out.println("yes");
            }
            else if(N<100)
            {
                arr[0] = N/10;
                arr[1] = N%10;
                if(arr[0] == arr[1])
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("no");
                }
            }
            else if(N<1000)
            {
                arr[0] = N/100;
                arr[1] = N%10;
                if(arr[0] == arr[1])
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("no");
                }
            }
            else if(N<10000)
            {
                arr[0] = N/1000;    //천의 자리
                arr[1] = N%10;    //일의 자리
                arr[2] = (N - (N/1000)*1000)/100;    //백의 자리
                arr[3] = (N%100 - N%10)/10;    //십의 자리
                if(arr[0] == arr[1] && arr[2] == arr[3])
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("no");
                }
            }
            else if(N<100000)
            {
                arr[0] = N/10000;    //만의 자리
                arr[1] = N%10;    //일의 자리
                arr[2] = (N - (N/10000)*10000)/1000;    //천의 자리
                arr[3] = (N%100 - N%10)/10;    //십의 자리
                if(arr[0] == arr[1] && arr[2] == arr[3])
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("no");
                }
            }
        }
    }
}