import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = "";
        for(String s : arr){
            answer += s;
        }
        return Long.parseLong(answer);
    }
}