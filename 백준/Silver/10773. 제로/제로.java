import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());  //명령 횟수
        StringBuilder sb = new StringBuilder();
        int sum = 0;    //스택 합
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<K;i++)
        {
            int n = Integer.parseInt(br.readLine());
            if(n == 0)
            {
                stack.pop();
            }
            else{
                stack.push(n);
            }
        }

        //for each문
        for(int i:stack)
        {
            sum=sum+i;
        }

        System.out.println(sum);

    }
}