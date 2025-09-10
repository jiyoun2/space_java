package classes2.constant;

import java.util.Calendar;

enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class WeekTest {
    public static void main(String[] args) {
        // 오늘은 무슨 요일?
        Week today = null;

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week); // 4 = 수요일

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.SUNDAY;
                break;
            case 3:
                today = Week.SUNDAY;
                break;
            case 4:
                today = Week.SUNDAY;
                break;
            case 5:
                today = Week.SUNDAY;
                break;
            case 6:
                today = Week.SUNDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
            default:
                System.out.println("요일이 없습니다");
        }
        System.out.println("Today is" + today);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 놀러갑니다.");
        } else {
            System.out.println("평일에는 열심히 코딩합니다.");
        }


    }
}
