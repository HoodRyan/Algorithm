import java.io.*;
import java.util.StringTokenizer;



public class Main {
    //윤년인지 확인
    public static boolean check(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T_year = Integer.parseInt(st.nextToken());
        int T_month = Integer.parseInt(st.nextToken());
        int T_day = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int D_year = Integer.parseInt(st.nextToken());
        int D_month = Integer.parseInt(st.nextToken());
        int D_day = Integer.parseInt(st.nextToken());

        //캠프가 1000년 이상 지속되는 경우
        if((D_year - T_year > 1000) ||
                (D_year - T_year == 1000 && D_month > T_month) ||
                (D_year - T_year == 1000 && D_month == T_month && D_day >= T_day)){
            System.out.println("gg");
        }else {
            int dDay = 0;
            while (true) {
                T_day++;
                dDay++;

                if (T_day > 31 && (T_month == 1 || T_month == 3 || T_month == 5 || T_month == 7 ||
                        T_month == 8 || T_month == 10 || T_month == 12)) {
                    T_month++;
                    T_day = 1;
                } else if (T_day > 30 && (T_month == 4 || T_month == 6 || T_month == 9 ||
                        T_month == 11)) {
                    T_month++;
                    T_day = 1;
                } else if (T_day > 29 && T_month == 2 && check(T_year)) {
                    T_month++;
                    T_day = 1;
                } else if (T_day > 28 && T_month == 2 && !check(T_year)) {
                    T_month++;
                    T_day = 1;
                }

                if (T_month > 12) {
                    T_year++;
                    T_month = 1;
                }

                if (T_year == D_year && T_month == D_month && T_day == D_day) {
                    System.out.println("D-" + dDay);
                    break;
                }
            }
        }

    }
}
