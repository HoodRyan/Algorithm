import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            String str = br.readLine();
            if(Objects.equals(str, ".")) break;
            else{
                sb.append(balance(str)).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static String balance(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            // ( 이거나 [ 일때 스택에 push
            if(c == '(' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.empty() || stack.peek() != '('){   //스택이 비어있거나, 스택에 쌓인값이 ( 가 아닐때
                    return "no";
                }else{
                    stack.pop();
                }
            }else if(c == ']'){
                if(stack.empty() || stack.peek() != '['){   //스택이 비어있거나, 스택에 쌓인값이 [ 가 아닐때
                    return "no";
                }else{
                    stack.pop();
                }
            }

        }
        if(stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}