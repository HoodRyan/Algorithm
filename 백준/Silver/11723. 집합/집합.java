import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<Integer> set = new HashSet<>(); //중복 허용 x
        int M = Integer.parseInt(br.readLine());

        while (M --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();
            int x;
            switch (operation){
                case "add" :
                    x  = Integer.parseInt(st.nextToken());
                    set.add(x); // 집합 S에 x를 추가, set 을 사용하기 때문에 이미 x가 있을 경우 연산을 무시
                    break;
                case "remove" :
                    x  = Integer.parseInt(st.nextToken());
                    set.remove(x); // 집합 S에서 x를 제거
                    break;
                case "check" :
                    x  = Integer.parseInt(st.nextToken());
                    if(set.contains(x)){ // 집합 S에 x가 있으면 1
                        sb.append("1\n");
                    }else{ // 집합 S에 x가 없으면 0
                        sb.append("0\n");
                    }
                    break;
                case "toggle" :
                    x  = Integer.parseInt(st.nextToken());
                    if(set.contains(x)){ // 집합 S에 x가 있으면 제거
                        set.remove(x);
                    }else{ // 집합 S에 x가 없으면 추가
                        set.add(x);
                    }
                    break;
                case "all" :
                    for(int i=1;i<=20;i++){ //집합 S를 {1,2,...20} 으로 변경
                        set.add(i);
                    }
                    break;
                case "empty" : 
                    set.clear(); //집합 S를 공집합으로 변경
                    break;

            }

        }
        System.out.print(sb);
    }

}