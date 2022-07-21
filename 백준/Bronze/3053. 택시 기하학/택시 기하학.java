import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        double circle = Math.PI*R*R;    
        double rhombus = 2*R*R; //택시 기하학의 원의 정의 = 마름모 모양
        System.out.println(circle);
        System.out.println(rhombus);
    }
}
