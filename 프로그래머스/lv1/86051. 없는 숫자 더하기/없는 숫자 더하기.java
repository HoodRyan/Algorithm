class Solution {
    public int solution(int[] numbers) {
        int answer = 45;    //0~9 까지 모두 더한 값
        for (int n : numbers) {
            answer = answer- n;
        }
        return answer;
    }
}