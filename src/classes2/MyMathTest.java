package classes2;

/*
 * Static이 있는 메서드는 메모리의 데이터 영역 사용
 */

public class MyMathTest {
    public static void main(String[] args) {
        // 메서드 사용
        // MyMath math = new MyMath(); // 수학 관련은 new를 사용하지 않고, static
        // System.out.println(math.abs(-6)); // 6

        // 메서드 사용 - 클래스로 직접 접근
        int val1 = Math.abs(-6);
        System.out.println(Math.abs(val1)); // 6

        int val2 = Math.min(10, 20);
        System.out.println(val2);
        

    }
}
