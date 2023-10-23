import java.util.*;
class Solution {
    public int solution(int n) {
        String t = Integer.toString(n,3);

        StringBuffer sb = new StringBuffer(t);
        String reverse = sb.reverse().toString();

        int answer = Integer.parseInt(reverse,3);
        return answer;
    }
}