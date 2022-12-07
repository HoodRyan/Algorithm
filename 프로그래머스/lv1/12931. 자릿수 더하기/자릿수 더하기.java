import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        int answer = 0;
        for(int i = 0; i<str.length();i++){
            arr[i] = str.charAt(i) - '0';
            answer += arr[i];
        }
        
        return answer;
    }
}