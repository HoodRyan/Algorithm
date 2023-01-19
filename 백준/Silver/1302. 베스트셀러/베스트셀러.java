import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            String book = br.readLine();
            if(hashMap.containsKey(book)){
                hashMap.replace(book,hashMap.get(book)+1);
            }else{
                hashMap.put(book,1);
            }
        }

        String maxBook = "";
        int max = 0;
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if(max == value && maxBook.compareTo(key) > 0) {
                maxBook = key;
                max = value;
            } else if(max < value) {
                maxBook = key;
                max = value;
            }
        }
        System.out.println(maxBook);

    }

}