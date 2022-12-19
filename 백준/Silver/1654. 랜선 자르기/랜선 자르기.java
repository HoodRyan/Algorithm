import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;

        for(int i=0;i<K;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //mid가 0인 경우 대비. 자연수 탐색 범위를 0 ~ max+1 범위에서 탐색
        max++;

        long min = 0;
        long mid = 0;

        while(min<max){
            //중간 길이 구하기
            mid = (max+min) /2;

            long cnt = 0;

            //중간 길이로 잘라 총 몇개가 만들어지는지 구함
            for(int i=0;i< arr.length;i++){
                cnt += (arr[i] / mid);
            }

            //upperBound 형식 사용.
            /*
            * mid 길이로 잘랐을 때 개수 < 만들고자 하는 랜선 개수
            * --> 자르고자 하는 길이 줄이기 위해 최대 길이 줄임.
            * 그 외 --> 자르고자 하는 길이 늘려야 하므로 최소길이 down
            * */
            if(cnt<N){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }

        //upperBound 로 얻은 값(min)에 -1 = 최대 길이
        System.out.println(min - 1);
    }


}