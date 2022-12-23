import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            ArrayList<Integer> high = new ArrayList<>(); //현재 숫자가 high 일 때 넣을 리스트
            ArrayList<Integer> low = new ArrayList<>(); //현재 숫자가 low 일 때 넣을 리스트
            int right;

            while(true) {
                int num = Integer.parseInt(br.readLine());
                if(num == 0) {    // 0이 입력되면 종료
                    return;
                }
                String isRight = br.readLine();

                if(isRight.equals("too high")) {    // 현재 숫자가 high 인 경우
                    high.add(num);
                }else if(isRight.equals("too low")) {    // 현재 숫자가 low 인 경우
                    low.add(num);
                }else {                        // 현재 숫자가 right 인 경우
                    right = num;
                    break;
                }
            }
            boolean isTrue = true;  //진실 판별 여부
            for(int i = 0; i < high.size(); i++) { // high 에 저장된 모든 값들이 정답보다 큰지 확인
                if(right >= high.get(i)) {
                    isTrue = false; //진실이 아닐 경우 false
                    break;
                }
            }
            if(isTrue) {
                for(int i = 0; i < low.size(); i++) { // low 에 저장된 모든 값들이 정답보다 작은지 확인
                    if(right <= low.get(i)) {
                        isTrue = false; //진실이 아닐 경우 false
                        break;
                    }
                }
            }
            if(isTrue) {
                System.out.println("Stan may be honest");
            }else {
                System.out.println("Stan is dishonest");
            }
        }

    }

}
