import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N == 0)
            {
                break;
            }else{
                int cm = 2; //숫자 양옆 간격 = 2cm (좌우 1cm씩)
                int k = 0; //숫자 사이 간격
                String num = Integer.toString(N);   //정수를 문자열로 변환
                if(num.length()!=1){    //문자열의 길이가 1이면 숫자 사이 간격X 
                    k = num.length()-1; //1 이상의 수라면 사이 간격 = 문자열 길이 - 1 
                }
                int[] arr = new int[num.length()];
                for(int i=0;i<num.length();i++){
                    arr[i] = num.charAt(i) - '0';       //정수 각 자리수 구하기
                    if(arr[i]==0) {
                        cm = cm + 4;
                    }else if(arr[i]==1) {
                        cm = cm + 2;
                    }else{
                        cm = cm + 3;
                    }
                }
                System.out.println(cm + k);
            }
        }
    }
}