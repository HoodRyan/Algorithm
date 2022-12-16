

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        int sum = 0;
        for(int i=0;i<N;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i=0;i<N-1;i++){
            sum += getD(arr[i][0],arr[i][1],arr[i+1][0],arr[i+1][1]);
        }
        double d = getD(arr[N-1][0], arr[N-1][1], arr[0][0], arr[0][1]);
        sum = (int) (sum + d);
        System.out.println(sum);
    }
    static double getD(int x, int y, int x1, int y1){
        int xd = (int) Math.pow((x1-x),2);
        int yd = (int) Math.pow((y1-y),2);
        double d = Math.sqrt(yd+xd);
        return d;
    }
}