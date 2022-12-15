class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            if(Sqrt(i) == true){
                answer -= i;
            }else{
                answer += i;
            }
        }
        return answer;
    }
    
    public boolean Sqrt(int n) {
        long tst = (long)Math.sqrt(n);
        return tst*tst == n;
    }
}

