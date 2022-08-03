import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int K = sc.nextInt();
        for(int i=0;i<K;i++)
        {
            int N = sc.nextInt();
            Integer[] arr = new Integer[N];
            for(int j=0;j<N;j++)
            {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr, Collections.reverseOrder());
            int max = arr[0];
            int min = arr[N-1];
            int gap = Integer.MIN_VALUE;
            for(int j=0;j<arr.length-1;j++){
                gap = Math.max(arr[j] - arr[j+1], gap);
            }
            sb.append("Class ").append(i + 1).append('\n');
            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap).append('\n');

        }
        System.out.print(sb);
    }

}