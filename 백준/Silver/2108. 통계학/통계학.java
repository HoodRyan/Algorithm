import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //N개의 수
        double sum = 0;
        int[] arr = new int[N];

        //산술 평균
        for(int i=0;i<N;i++)    //arr[0] ....arr[N-1]
        {
            arr[i] = sc.nextInt();
            sum = arr[i]+sum;
        }
        System.out.println(Math.round(sum/(double) N));

        //중앙값
        int[] arr1 = new int[N];
        for(int i=0;i<N;i++)
        {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        System.out.println(arr1[((N+1)/2)-1]);

        //최빈값
        int cnt = 0;
        int max = -1;
        int mod = arr1[0];
        boolean check = false;
        for(int i=0; i<N-1;i++)
        {
            if(arr1[i]==arr1[i+1]){
                cnt++;
            }else{
                cnt = 0;
            }

            if(max<cnt){
                max = cnt;
                mod = arr1[i];
                check = true;
            }else if(max==cnt && check == true){
                mod = arr1[i];
                check = false;
            }
        }
        System.out.println(mod);
        //범위
        System.out.println(Math.abs(arr1[N-1] - arr1[0]));
    }

}
