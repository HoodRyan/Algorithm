import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N]; //원본 배열
        int[] sortedarr = new int[N];   //정렬 할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();    //해쉬맵
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++)
        {
            sortedarr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sortedarr);

        int rank = 0;
        for(int i : sortedarr)
        {
            if(!rankingMap.containsKey(i)){
                rankingMap.put(i,rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

    }
}