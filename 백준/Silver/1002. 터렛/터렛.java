import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            System.out.println(point(x1,y1,r1,x2,y2,r2));
        }

    }

    /**
     * <반지름이 r1인 A, 반지름이 r2인 B의 접점의 개수>
     * [경우의 수]
     * 1. 두 원의 중심이 같고, 반지름이 같을 때(접점의 개수 무한)
     *  ㄴ x1=x2,y1=y2,r1=r2
     * 2. 접점이 없을 때
     *  ㄴ 2-1 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
     *      ㄴ (x2-x1)^2 + (y2-y1)^2 > (r1+r2)^2
     *  ㄴ 2-2 한 원 안에 다른 원이 있으면서 접점이 없을 때
     *      ㄴ (x2-x1)^2 + (y2-y1)^2 < (r2-r1)^2
     * 3. 접점이 한 개일 때
     *  ㄴ 3-1 내접하는 경우
     *      ㄴ (x2-x1)^2 + (y2-y1)^2 = (r2-r1)^2
     *  ㄴ 3-2 외접하는 경우
     *      ㄴ (x2-x1)^2 + (y2-y1)^2 = (r1+r2)^2
     *  
     */
    public static int point(int x1,int y1,int r1,int x2,int y2,int r2){
        int dd = (int)(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));  //중점간 거리 d의 제곱

        //case1 : 두 원의 중심이 같고, 반지름이 같을 때
        if(x1==x2 && y1==y2 && r1==r2){
            return -1;
        }
        //case2-1 : 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
        else if(dd > Math.pow(r1+r2,2)){
            return 0;
        }
        //case2-2 : 한 원 안에 다른 원이 있으면서 접점이 없을 때
        else if(dd < Math.pow(r2-r1,2)){
            return 0;
        }
        //case3-1 : 내접하는 경우
        else if(dd == Math.pow(r2-r1,2)){
            return 1;
        }
        //case3-2 : 외접하는 경우
        else if(dd == Math.pow(r2+r1,2)){
            return 1;
        }
        //case Ex : 무제한
        else
            return 2;

    }
}
