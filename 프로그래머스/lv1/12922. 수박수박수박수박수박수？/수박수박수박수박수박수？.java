class Solution {
    public String solution(int n) {
        String answer = "";
        int cnt=0;
        while(true){
            cnt++;
            if(cnt%2==1){
                answer += "수";
            }else{
                answer += "박";
            }
            
            if(n == cnt){
                break;
            }
            
        }
        return answer;
    }
}