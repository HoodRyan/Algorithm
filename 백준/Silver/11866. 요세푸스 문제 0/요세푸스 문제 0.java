import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();   //인원수
        int K = sc.nextInt();   //제거번호
        Queue<Integer> q = new LinkedList<>();  //자료 삽입, 삭제에 유용한 LinkedList 사용
        for(int i=1;i<=N;i++)
        {
            q.add(i);
        }
        sb.append('<');
        while(q.size()>1)   //마지막 인자 입력후에는 띄워쓰기 없이 '>' 가 입력 되므로
        {
            for(int i = 0; i < K - 1; i++) {
                int val = q.poll(); //큐의 맨앞 부터 K-1번째 인덱스까지 지우고
                q.offer(val);   // 큐의 맨뒤로 보냄
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');    //마지막 인자 입력 후 '>' 입력
        System.out.println(sb);
    }
}