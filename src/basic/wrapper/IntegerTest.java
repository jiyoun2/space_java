package basic.wrapper;

/*
    Wrapper 클래스
    - Integer, Double, Character ...
    - 기본 자료형의 객체를 제공하는 클래스이다
 */

public class IntegerTest {
    public static void main(String[] args) {
        // integer 클래스
        // valueOf() => 문자열을 정수로 변환
        Integer n1 = Integer.valueOf("100");
        System.out.println(n1); // 100

        // parseInt() => 문자열을 정수로 변환. 더 많이 씀
        int n2 = Integer.parseInt("200"); 
        System.out.println(n2); // 200

        // double() => 문자열을 실수로 변환
        double n3 = Double.parseDouble("1.609");
        System.out.println(n3);
    }
}
