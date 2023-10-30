import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == ' ')
                sb.append(" ");
            else if(s.charAt(i-1) == ' '){ // 이전 문자가 공백이면 그 다음은 대문자여야 함
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{ // 공백도 x , 이전 문자가 공백 x => 소문자 그대로 입력
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}