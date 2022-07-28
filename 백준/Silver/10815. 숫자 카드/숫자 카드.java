import java.util.*;
import java.io.*;
public class Main{
    public static int[] arr;    //전역변수로 지정
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //배열 정렬

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++){
            if(BinarySearch(Integer.parseInt(st.nextToken()))>=0){  //Integer.parseInt(st.nextToken()) = int key;
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    //이분탐색...
    public static int BinarySearch( int key)
    {
        int low = 0; //탐색 범위 왼쪽 끝 인덱스
        int high = arr.length - 1;  //탐색 범위 오른쪽 끝 인덱스
        while(low<=high)
        {
            int mid = (low+high)/2; //중간값 구하기
            if(key<arr[mid])    //키가 중간값보다 작을 때
            {
                high = mid - 1;
            }
            else if(key>arr[mid])   //키가 중간값보다 클 때
            {
                low = mid + 1;
            }
            else{   //키가 중간값과 같을 때때
                return mid; //일치하는 값이 있다면 이분법 한 수 +1/-1 반복하다 보면 키가 중간값과 동일하게 됨
            }
        }

        return -1;  //찾는 값 x일 때때
    }
}
