import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
         //해시에 이름과 추억 점수 입력
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i< name.length;i++){
            String f_name = name[i];
            int point = yearning[i];

            map.put(f_name,point);
        }

        for(int i=0;i< photo.length;i++){
            for(String n_name : photo[i]){
                answer[i] = answer[i] + map.getOrDefault(n_name,0);
            }
        }
        
        return answer;
    }
}