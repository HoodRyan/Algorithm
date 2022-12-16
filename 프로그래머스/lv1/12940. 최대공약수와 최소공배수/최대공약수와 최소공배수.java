class Solution {
    public int[] solution(int n, int m) {
        int gcd = GCD(n,m); //최대공약수
        int lcm = n*m/gcd;  //최소공배수
        int[] answer = {gcd,lcm};
        return answer;
        
    }
    
    //최대 공약수 구하기
    public static int GCD(int A,int B)
    {
        if(A>B)
        {
            while(B!=0){
                int r = A%B;
                A=B;
                B=r;
            }
            return A;
        }
        else if(A<B)
        {
            while(A!=0){
                int r = B%A;
                B=A;
                A=r;
            }
            return B;
        }
        else {
            return A;
        }

    }
}