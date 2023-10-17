import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int value = -1; //arr의 각 원소는 0~9 사이
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != value){
                list.add(arr[i]);
                value = arr[i];
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
            
        }

        return answer;
    }
}