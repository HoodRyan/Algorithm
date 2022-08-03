import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        double g1 = (y1-y2)/(double)(x1-x2);
        double g2 = (y2-y3)/(double)(x2-x3);
        double g3 = (y3-y1)/(double)(x3-x1);

        if(g1==g2 && g2==g3 && g3==g1)
        {

            System.out.print("WHERE IS MY CHICKEN?");
        }
        else{
            if((x1==x2 && x2==x3 && x3==x1)||(y1==y2 && y2==y3 && y3==y1))
            {
                System.out.print("WHERE IS MY CHICKEN?");
            }
            else{
                System.out.print("WINNER WINNER CHICKEN DINNER!");
            }

        }
    }

}