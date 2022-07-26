import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                {   //비교한 단어의 길이가 같을 경우
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });
        sb.append(arr[0]).append('\n'); //for문 내 1부터 굴리기 위해 index 0은 미리 출력
        for(int i=1;i<N;i++)
        {
            if(!arr[i].equals(arr[i-1]))    //연속된 두 arr가 중복이면 pass
            {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);

    }
}