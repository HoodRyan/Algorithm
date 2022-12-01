import java.util.*;
public class Main {
    static int cnt; //전역 변수 선언
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            cnt=0;  //0으로 초기화
            System.out.println(isPalindrome(sc.next()) + " " + cnt);
        }
        sc.close();
    }
}
