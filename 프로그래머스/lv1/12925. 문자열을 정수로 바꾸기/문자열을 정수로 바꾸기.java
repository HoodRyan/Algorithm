class Solution {
    public int solution(String s) {
        String[] str = s.split("");
        if(str[0] == "+"){
            return Integer.parseInt(s);
        }else if(str[0] == "-"){
            return Integer.parseInt(s) * (-1);
        }else{
            return Integer.parseInt(s);
        }
        
    }
}