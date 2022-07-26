import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  //명령 횟수
        StringBuilder sb = new StringBuilder();
        int x = 0;
        Queue<Integer> q = new LinkedList<>();  //자료 삽입, 삭제에 유용한 LinkedList 사용
        for(int i=0;i<N;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s){
                case "push" :
                    x = Integer.parseInt(st.nextToken());
                    q.offer(x); //큐의 맨뒤에 값 추가
                    break;
                case "pop" :
                    if(q.isEmpty()) //q.isEmpty() = 큐가 비어있는지 확인
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(q.poll()).append('\n');   //q.poll() = 큐 맨앞에 있는 값 반환 후 삭제
                    }
                    break;
                case "size" :
                    sb.append(q.size()).append('\n');   //q.size() = 큐의 사이즈 확인
                    break;
                case "empty" :
                    if(q.isEmpty())
                    {
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front" :
                    if(q.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(q.peek()).append('\n');   //q.peek() = 큐의 맨앞 값 반환
                    }
                    break;
                case "back" :
                    if(q.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(x).append('\n');  //q.offer() 가 맨뒤에 정수를 저장 했으므로 큐의 가장 뒤에 저장된 정수는 x
                    }

                    break;
            }
        }
        System.out.println(sb);

    }
}