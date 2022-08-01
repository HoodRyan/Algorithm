import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];    //arr[x좌표][0] , arr[y좌표][1]
        for(int i=0;i<N;i++)
        {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        //2차원 배열의 정렬 Comparator ....
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];   //오름차순 정렬 ... 내림차순 = o2[1] - o1[1] 으로 변경
                }else{
                    return o1[1] - o2[1];   //오름차순 정렬 ... 내림차순 = o2[2] - o1[0]
                }
            }
        });
        for(int i=0;i<N;i++)
        {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}