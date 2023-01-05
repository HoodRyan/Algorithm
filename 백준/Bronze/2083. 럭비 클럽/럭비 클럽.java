import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] str = new String[3];
            for(int i=0;i<3;i++){
                str[i] = st.nextToken();
            }

            if(str[0].equals("#") && str[1].equals("0") && str[2].equals("0")){
                break;
            }

            if(Integer.parseInt(str[1]) > 17 || Integer.parseInt(str[2]) >= 80){
                System.out.println(str[0] + " "+ "Senior");
            }else{
                System.out.println(str[0] + " "+ "Junior");
            }


        }
    }
}
