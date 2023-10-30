class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=i;j<=n;j++){ // 1+ (1+1) + (1+1+1)... // 2 + (2+1) + (2+1+1)....
                sum = sum + j;
                if(sum == n){ // n 조건 만족 시
                    answer++;
                    break;
                }
                else if(sum>n){ // n 초과시 불가능한 경우
                    break;
                }
            }
        }
        return answer;
    }
}