import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  //명령 횟수
        StringBuilder sb = new StringBuilder();
        int x = 0;
        Stack<Integer> stack = new Stack<>();  //자료 삽입, 삭제에 유용한 LinkedList 사용
        for(int i=0;i<N;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s){
                case "push" :
                    x = Integer.parseInt(st.nextToken());
                    stack.push(x);    //스택의 맨 위에 값 삽입
                    break;

                case "pop" :
                    if(stack.isEmpty()) //stack.isEmpty() = 스택이 비어있는지 확인
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(stack.pop()).append('\n');   //stack.pollFirst() = 스택의 가장 위에 쌓인 값 반환 후 제거
                    }
                    break;

                case "size" :
                    sb.append(stack.size()).append('\n');   //stack.size() = 스택의 사이즈 확인
                    break;
                case "empty" :
                    if(stack.isEmpty())
                    {
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "top" :
                    if(stack.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(stack.peek()).append('\n');   //stack.peek() = 스택의 가장 위에 쌓인 값 확인
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}