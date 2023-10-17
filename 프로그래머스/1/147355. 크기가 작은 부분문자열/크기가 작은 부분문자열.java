class Solution {
    public int solution(String t, String p) {
        long pNum = Long.parseLong(p); // p의 길이가 최대 18이므로
        int answer = 0;
        
        for(int i=0;i<t.length()-p.length() + 1;i++){
            String q = t.substring(i, i + p.length());

            if(Long.parseLong(q) <= pNum){
                answer++;
            }
        }
        
        return answer;
    }
}