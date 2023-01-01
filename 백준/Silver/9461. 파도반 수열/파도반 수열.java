import java.io.*;

public class Main {
    public static Long[] arr = new Long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        arr[0] = 0L;
        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n  = Integer.parseInt(br.readLine());
            long pado = pado(n);
            sb.append(pado).append('\n');

        }
        System.out.println(sb);
    }

    public static long pado(int n){
        if(arr[n] == null){ //해당 배열에 값이 없을시 재귀호출
            arr[n] = pado(n-2) + pado(n-3);
        }
        return arr[n];
    }


}
