class Solution {
    public int[] solution(int n) {
        // n 이하의 홀수 개수 사이즈의 배열 선언
        int[] answer = new int[(n + 1)/2];
        int index = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%2 != 0){ // 홀수일 때
                answer[index] = i; // 현재 인덱스에 값 저장
                index++;
            }
        }
        return answer;
    }
}