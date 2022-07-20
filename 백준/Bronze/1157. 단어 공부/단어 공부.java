import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //toUpperCase() = 소문자 -> 대문자, toLowerCase() = 대문자->소문자
        int[] arr = new int[26];    //알파벳 26자
        for(int i=0;i<s.length();i++)
        {
            if('A'<=s.charAt(i) && s.charAt(i) <= 'Z'){ //대문자
                arr[s.charAt(i) - 'A']++;
            }
            else{   //소문자
                arr[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for(int i=0;i<26;i++)
        {
            if(arr[i]>max){
                max = arr[i];
                ch = (char)(i+65);  //소문자를 대문자로 출력하기 위함
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}