package classes.arrays;

public class ArrayTest2 {

    public static void main(String[] args) {
        // 배열의 크기가 4인 정수형 배열 선언
        int[] number = new int[4];

        // 출력
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        // 값(요소, 원소) 입력
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;

        // 출력
        for(int num : number)
            System.out.println(num);

        // 계산
        System.out.println(number[0] + number[1]); // 30

        int total = 0; // 합계

        // total = total + number[0]; // 0+10=10
        // total = total + number[1]; // 10+20=30 ...

        for (int i = 0; i < number.length; i++) {
            total += number[i]; // total = total + number[i];
        }
        System.out.println("합계: " + total); // 100

        // 평균 = 합계 / 개수
        float average;
        average = (float)total / number.length; // 명시적 형변환, 실수형 = 실수형

        System.out.println("Average: " + average);
    }
}
