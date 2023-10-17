class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String C = A;
        for(int i=0;i<A.length();i++){
            if(C.equals(B)){
                return answer;
            }else{
                String a = C.substring(C.length()-1); // 맨 뒷글자 (hello -> o)
                C = a + C.substring(0,C.length()-1); // 맨 뒷글자 이전까지 (hello -> hell)
                answer++; //문자열 민 횟수 증가
            }
        }

        return -1;
    }
}