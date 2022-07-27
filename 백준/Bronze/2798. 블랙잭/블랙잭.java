import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = blackjack(arr, N, M);
        System.out.println(result);


    }

    static int blackjack(int[] arr, int N, int M){
        int result = 0;
        for(int i=0;i<N-2;i++)  //3개를 고르기 때문에 i<N-2 이전까지
        {
            for(int j=i+1;j<N-1;j++)    //i에서 하나 골랐기 때문에 j=i+1 , 2개를 고르기 때문에 j<N-1 이전까지
            {
                for(int k =j+1;k<N;k++) //i에서 하나, j에서 하나씩 두개 골랐기 때문에 하나만 더 고르면 됨 => k<N 이전까지
                {
                    int temp = arr[i]+arr[j]+arr[k];
                    if(M == temp)   //세 수의 합이 주어진 값(M)과 같으면 리턴
                    {
                        return temp;
                    }
                    if(result<temp && temp<M)
                    {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

}
