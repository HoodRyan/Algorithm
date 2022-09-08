import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[8][2];    //점수 배열
        int[] cnt = new int[5]; //번호 배열
        for(int i=0;i<8;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            //2차원 배열의 정렬
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0])
                    return 1;
                else if (o1[0] == o2[0])
                    return 0;
                else
                    return -1;
            }
        });

        int sum = 0;    //총점
        for(int i=0;i<5;i++){
            sum = sum + arr[i][0];  
            cnt[i] = arr[i][1] + 1;
        }
        Arrays.sort(cnt);   //번호순을 다시 오름차순으로 정렬
        System.out.println(sum);
        for(int i=0;i<5;i++){
            System.out.print(cnt[i] + " ");
        }


    }
}