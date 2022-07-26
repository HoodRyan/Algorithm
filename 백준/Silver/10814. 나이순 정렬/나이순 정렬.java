import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2];    
        for(int i=0;i<N;i++)
        {
            arr[i][0] = sc.next();   //나이
            arr[i][1] = sc.next();   //이름
        }
        Arrays.sort(arr, new Comparator<String[]>() {   //2차원 배열의 sort
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        
        for(int i=0;i<N;i++)
        {
            System.out.println(arr[i][0] + " "+arr[i][1]);
        }
    }
}