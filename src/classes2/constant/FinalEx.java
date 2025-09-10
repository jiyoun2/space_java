package classes2.constant;
/*
    상수(constant)
    - 한번 설정해두면 프로그램이 종료될 때까지 변경할 수 없는 값
    - final 키워드를 붙임
 */


public class FinalEx {
    public static void main(String[] args) {
        // 최소값 - 0, 최대값 - 100
        final int MIN_NUM = 0;
        final int MAX_NUM = 100;

        System.out.println(MIN_NUM); // 0

        // 원의 넓이 계산
        final double PI = 3.14159;
        int radius = 5;

        double area = PI * radius * radius;

        // System.out.println("원의 넓이: " + area);
        // 서식문자 - %d(정수), %f(실수), %s(문자열)
        System.out.printf("원의 넓이: %f", area);
        
    }
}
