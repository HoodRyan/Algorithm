import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> ranking = new HashMap<>();
        for(int i=0;i< players.length;i++){
            ranking.put(players[i],i);
        }

        for(String player : callings){
            //등수를 호출
            int call_rank = ranking.get(player);

            //바로 앞 선수
            String before_player = players[call_rank-1];

            //앞 선수와 순서 변경
            players[call_rank-1] = player;
            players[call_rank] = before_player;

            //랭킹 갱신
            ranking.put(player, call_rank-1);
            ranking.put(before_player, call_rank);
        }
        return players;
    }
}