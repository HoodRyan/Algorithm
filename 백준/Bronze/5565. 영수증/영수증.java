import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int[] arr = new int[9];
        int total = 0;
        for(int i=0;i<9;i++){
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }
        System.out.println(price - total);
    }
}
