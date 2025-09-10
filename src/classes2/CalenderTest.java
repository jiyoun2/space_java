package classes2;

import java.util.Calendar;

/*
 * java util 패키지(import 필요)에 있는 Calender
 * Calender - 날짜 및 시간 관련 메서드를 가지고 있음
 * - static이 있는 메서드를 포함하고 있으므로 new하지 않고, Calender이름으로 메서드에 직접 접근
 */

public class CalenderTest {
    public static void main(String[] args) {
        // Calender 인스턴스 생성
        Calendar cal = Calendar.getInstance();
        // System.out.println(cal);

        // 현재 날짜와 시간 출력 - getTime()
        System.out.println(cal.getTime()); // Tue Sep 09 12:14:30 KST 2025

        // 날짜 - 년, 월, 일 - get()
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int date = cal.get(Calendar.DATE);
        System.out.println(date);

        // 시간 - 시, 분, 초
        int hour = cal.get(Calendar.HOUR)+12;
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(hour + ":" + minute + ":" + second);

        // 요일
        int day = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(day); // 1 = 일요일 ...

        String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        System.out.println("Today is " + days[day-1]);
    }
}
