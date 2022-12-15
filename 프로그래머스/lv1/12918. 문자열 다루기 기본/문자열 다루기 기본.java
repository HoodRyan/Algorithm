class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() !=4 && s.length() !=6){   //길이가 4or6이 아니라면 false
            answer = false;
        }else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){ //숫자 범위가 아니라면
                    answer = false; //false 반환
                }
            }
        }
        
        return answer;
    }
}