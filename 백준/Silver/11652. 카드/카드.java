import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long,Integer> hashMap = new HashMap<>();
        int max = 0;
        long num = 0;
        for(int i=0;i<N;i++){
            long card = Long.parseLong(br.readLine());
            hashMap.put(card, hashMap.getOrDefault(card, 0) + 1);

            if(hashMap.get(card) > max){
                max = hashMap.get(card);
                num = card;
            }else if (hashMap.get(card) == max) { //가장 많이 가지고 있는 정수가 여러개인 경우
                num = Math.min(num, card);
            }
        }
        System.out.println(num);

    }

}