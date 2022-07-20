import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String ch = " ";
        for(int i=0;i<N;i++)    //테스트케이스  N번 반복
        {
            String s = sc.next();
            char[] arr = new char[s.length()];
            for(int j=0;j<s.length();j++)
            {
                arr[j] = s.charAt(j);
            }

            for(int k=0;k<s.length();k++)
            {
                if(arr[k]=='(')
                {
                    sum = sum + 1;
                }else if(arr[k]==')')
                {
                    sum = sum - 1;
                }

                if(sum<0)
                {
                    break;
                }

            }
            if(sum == 0)
            {
                ch = "YES";
            }else if(sum !=0)
            {
                ch = "NO";
            }
            System.out.println(ch);
            ch = " ";
            sum = 0;

        }
    }
}