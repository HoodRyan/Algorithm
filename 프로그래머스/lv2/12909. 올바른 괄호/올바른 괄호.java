import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){ // ( 이면 스택에 넣음
                stack.push(s.charAt(i));
            }else{ 
                if(stack.isEmpty()){ // 스택이 비어있다면 짝인 ( 가 없는 것이므로 false 리턴
                    return false;
                }
                stack.pop(); // 스택이 있는 것이므로 짝인 ( 가 있는 것 = 스택의 값을 제거 = 짝을 맞춘 것.
            }
        }
        if(stack.isEmpty()){ // () 의 짝이 제대로 맞아 스택이 비어 있다면 true 리턴
            answer = true;
        }

        return answer;
    }
}