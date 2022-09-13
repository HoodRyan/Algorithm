import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = 0;
        int M = 0;
        int N = Integer.parseInt(br.readLine());
        int k;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++)
        {
            k = Integer.parseInt(st.nextToken());
            Y = Y + ((k/30)+1)*10;
            M = M + ((k/60)+1)*15;
        }
        if(Y==M){
            System.out.println("Y M "+Y);
        } else if (Y < M) {
            System.out.println("Y "+Y);
        } else {
            System.out.println("M "+M);
        }


    }
}