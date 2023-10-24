class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] ch = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if (ch[i] >= 'a' && ch[i] <= 'z') { // 소문자
                if (ch[i] + n > 'z') // z가 있을 때,
                    answer += (char) (ch[i] + n - 26);
                else
                    answer += (char) (ch[i] + n);
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') { // 대문자
                if (ch[i] + n > 'Z') // Z가 있을 때,
                    answer += (char) (ch[i] + n - 26);
                else
                    answer += (char) (ch[i] + n);
            } else
                answer += (char) ch[i];
        }
        return answer;
    }
}