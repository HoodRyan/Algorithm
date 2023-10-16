class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String[] arr = new String[2];
        arr[0] = id_pw[0]; //id
        arr[1] = id_pw[1]; //pw
        
        String answer = "fail";
        for(int i=0;i<db.length;i++){
            if(arr[0].equals(db[i][0])){
                if(arr[1].equals(db[i][1])){
                    answer = "login";
                }else{
                    answer = "wrong pw";
                }
            }
        }
        
        return answer;
    }
}