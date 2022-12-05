import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N<=2){   // N = 1 일때 1이 연속된 값. N = 2 일때 2가 연속된 값.
            System.out.println(1);
        }else{
            int sum;
            int cnt = 1;
            for(int i=1; i < (N/2)+1; i++){ // N의 절반까지만 계산하면 됨. 
                sum = 0;
                for(int j = i; sum<N;j++){
                    sum = sum + j;
                    if(sum == N){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
