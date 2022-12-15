class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i] == false){
                answer = answer + absolutes[i]*(-1); 
            }else if(signs[i] == true){
                answer = answer + absolutes[i];
            }
        }
        
      
        return answer;
    }
}