import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

        if(king == 1)
        {
            System.out.print(0+" ");
        }
        else{
            System.out.print(1-king+" ");
        }

        if(queen == 1)
        {
            System.out.print(0+" ");
        }
        else{
            System.out.print(1-queen+" ");
        }

        if(rook == 2)
        {
            System.out.print(0+" ");
        }
        else{
            System.out.print(2-rook+" ");
        }

        if(bishop ==2)
        {
            System.out.print(0+" ");
        }
        else{
            System.out.print(2-bishop+" ");
        }

        if(knight == 2)
        {
            System.out.print(0+" ");
        }
        else{
            System.out.print(2-knight+" ");
        }

        if(pawn == 8)
        {
            System.out.print(0+" ");
        }
        else{
            System.out.print(8-pawn+" ");
        }
    }
}