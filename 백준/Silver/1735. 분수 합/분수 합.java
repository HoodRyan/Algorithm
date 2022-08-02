import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int A1 = Integer.parseInt(st.nextToken());  //A분자
        int A2 = Integer.parseInt(st.nextToken());  //A분모

        st = new StringTokenizer(br.readLine()," ");
        int B1 = Integer.parseInt(st.nextToken());  //B분자
        int B2 = Integer.parseInt(st.nextToken());  //B분모
        int sum1 = 0;   //분자
        int sum2 = 0;   //분모
        if(B2==A2)
        {
            sum1 = A1+B1;
            sum2 = A2;
            int n = min(sum1,sum2);
            System.out.print(sum1/n+" "+sum2/n);
        }else{
            sum1 = A1*B2 + B1*A2;
            sum2 = A2*B2;
            int n = min(sum1,sum2);
            System.out.print(sum1/n+" "+sum2/n);

        }
    }
    
    //최대공약수 구하기
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