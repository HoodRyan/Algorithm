class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int x; //분자
        int y; //분모
        
        x = numer1*denom2 + numer2*denom1;
        y = denom1*denom2;
        int gcd = GCD(x,y);
        answer[0] = x/gcd;
        answer[1] = y/gcd;
        
        return answer;
    }
    
    //최대공약수 구하기
    public static int GCD(int a, int b){
        if(b == 0)
            return a;
        else
            return GCD(b, a%b);
    }
}