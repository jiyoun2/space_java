package classes2;

public class MyMath {
    // public MyMath(){} 기본생성자 생략되어있음

    // 절댓값 계산 메서드 정의
    public static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    // 두 수중 작은 수 찾기 메서드
    public static int min(int x, int y) {
        // return (x <= y) ? x : y;
        if (x <= y)
            return x;
        else
            return y; // 위와 같은 결과 출력됨
    }

    // 거듭제곱
    

    
}
