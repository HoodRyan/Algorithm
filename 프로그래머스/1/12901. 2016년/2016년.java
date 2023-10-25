import java.time.*;
class Solution {
    public String solution(int a, int b) {
        //LocalDate = 날짜 클래스
        LocalDate date = LocalDate.of(2016, a, b);

        //DayOfWeek = 요일 클래스
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        //DayOfWeek 의 getValue() 메소드 = 요일을 숫자로 가져옴 월~일(1~7)
        int day = dayOfWeek.getValue();

        String answer = "";
        switch (day){
            case 1 : answer = "MON";
                break;
            case 2 : answer = "TUE";
                break;
            case 3 : answer = "WED";
                break;
            case 4 : answer = "THU";
                break;
            case 5 : answer = "FRI";
                break;
            case 6 : answer = "SAT";
                break;
            case 7 : answer = "SUN";
                break;
        }
        return answer;
    }
}