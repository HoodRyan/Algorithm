import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(N>=5){
            //N이 5의 배수일때마다 0의 개수가 하나씩 증가
            //N이 25일때는 2개 증가 = 5의 개수에 따라 카운트 갯수 달라짐
            cnt = cnt+N/5;
            N = N/5;
        }
        System.out.println(cnt);

    }

}