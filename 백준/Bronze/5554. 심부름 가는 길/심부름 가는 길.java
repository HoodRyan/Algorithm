import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        int d= Integer.parseInt(br.readLine());

        int x = (a+b+c+d)/60;
        int y = (a+b+c+d)%60;
        System.out.println(x);
        System.out.println(y);

    }
}
