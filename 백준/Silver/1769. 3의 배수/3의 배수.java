
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        String answer;
        while(true){
            int sum = 0;
            if(s.length() == 1){
                break;
            }else{
                for(int i=0;i<s.length();i++){
                    sum = sum + (s.charAt(i)-'0');
                }
                cnt++;
                s = Integer.toString(sum);
            }
        }

        if(Integer.parseInt(s)%3 == 0){
            answer = "YES";
        }else {
            answer = "NO";
        }
        System.out.println(cnt);
        System.out.println(answer);

    }
}