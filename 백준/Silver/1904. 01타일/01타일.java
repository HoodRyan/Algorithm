import java.io.*;

public class Main {
    public static int[] dp = new int[1000001];;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /**
         * n=0 x                                                        // 0
         * n=1 1                                                        // 1
         * n=2 11, 00                                                   // 2
         * n=3 111, 100, 001                                            // 3
         * n=4 1111, 1100, 1001, 0011, 0000                             // 5
         * n=5 11111, 11100, 11001, 10011, 00111, 10000, 00100, 00001   // 8
         * n이 3이상일 때 Tile_01(N) = Tile_01(N-1) + Tile_01(N-2)
         */
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<dp.length;i++){
            dp[i] = -1;
        }
        int answer = Tile_01(n);
        System.out.println(answer);

    }

    public static int Tile_01(int N){
        if(dp[N] == -1){
            dp[N] = (Tile_01(N-1) + Tile_01(N-2)) % 15746;
        }
        return dp[N];
    }
}
