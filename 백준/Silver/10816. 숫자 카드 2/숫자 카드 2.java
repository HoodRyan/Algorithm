import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //배열 정렬

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++){
            int key = Integer.parseInt(st.nextToken());
            sb.append(UpperBound(arr,key) - LowerBound(arr,key)).append(' ');   
            //UpperBound(arr,key) - LowerBound(arr,key) = 중복된 값들의 길이.
        }
        System.out.println(sb);
    }

    //Upper Bound - Lower Bound = 중복된 값들의 길이
    //Upper Bound = 찾고자 하는 값을 초과한 값의 위치
    public static int UpperBound(int[] arr, int key)
    {
        int low = 0; //탐색 범위 왼쪽 끝 인덱스
        int high = arr.length;  //탐색 범위 오른쪽 끝 인덱스
        while(low < high)
        {
            int mid = (low+high)/2; //중간값 구하기
            if(key<arr[mid])    //키가 중간값보다 작을 때
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }

        }

        return low;  //찾는 값 x일 때때
    }
    //Lower Bound = 찾고자 하는 값 이상의 값이 처음 나온 위치
    public static int LowerBound(int[] arr, int key)
    {
        int low = 0; //탐색 범위 왼쪽 끝 인덱스
        int high = arr.length;  //탐색 범위 오른쪽 끝 인덱스
        while(low < high)
        {
            int mid = (low+high)/2; //중간값 구하기
            if(key<=arr[mid])    //키가 중간값보다 작을 때
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }

        }

        return low;  //찾는 값 x일 때때
    }
}
