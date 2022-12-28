import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 9;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for (int j=i+1; j<n; j++) {
                int sum = 0;
                for (int k=0; k<n; k++) {
                    if (i == k || j == k)
                        continue;
                    sum += arr[k];
                }
                if (sum == 100) {
                    for (int k=0; k<n; k++) {
                        if (i == k || j == k)
                            continue;
                        System.out.println(arr[k]);
                    }
                    System.exit(0);
                }
            }
        }

    }
}