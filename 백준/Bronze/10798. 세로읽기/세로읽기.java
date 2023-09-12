
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        char[][] ch = new char[5][15];
        int max = 0;

        for (int i=0;i<5;i++){
            String s = br.readLine();
            if(max<s.length()){ 
                max = s.length();
            }

            for(int j=0;j<s.length();j++){
                ch[i][j] = s.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<max;i++){
            for(int j=0;j<5;j++){
                if(ch[j][i] == '\0')
                    continue;
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }

}