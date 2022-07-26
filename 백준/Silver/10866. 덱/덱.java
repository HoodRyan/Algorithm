import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  //명령 횟수
        StringBuilder sb = new StringBuilder();
        int x = 0;
        Deque<Integer> d = new ArrayDeque<>();  //자료 삽입, 삭제에 유용한 LinkedList 사용
        for(int i=0;i<N;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s){
                case "push_front" :
                    x = Integer.parseInt(st.nextToken());
                    d.offerFirst(x);    //덱의 맨 앞에 값 삽입
                    break;
                case "push_back" :
                    x = Integer.parseInt(st.nextToken());
                    d.offerLast(x);     //덱의 맨 뒤에 값 삽입
                    break;
                case "pop_front" :
                    if(d.isEmpty()) //q.isEmpty() = 큐가 비어있는지 확인
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(d.pollFirst()).append('\n');   //d.pollFirst() = 덱의 맨 앞 값 반환 후 제거
                    }
                    break;
                case "pop_back" :
                    if(d.isEmpty()) //q.isEmpty() = 큐가 비어있는지 확인
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(d.pollLast()).append('\n');   //d.pollLast() = 덱의 맨 뒤 값 반환 후 제거
                    }
                    break;
                case "size" :
                    sb.append(d.size()).append('\n');   //d.size() = 덱의 사이즈 확인
                    break;
                case "empty" :
                    if(d.isEmpty())
                    {
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front" :
                    if(d.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(d.getFirst()).append('\n');   //d.getFirst() = 덱의 맨 앞 값 반환
                    }
                    break;
                case "back" :
                    if(d.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(d.getLast()).append('\n');  // d.getLast() = 덱의 맨 뒤 값 반환
                    }

                    break;
            }
        }
        System.out.println(sb);

    }
}