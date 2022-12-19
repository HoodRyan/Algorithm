import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("");
        String a = "";
        a = a + arr[2] + arr[1] + arr[0];
        System.out.println(a);
    }
}