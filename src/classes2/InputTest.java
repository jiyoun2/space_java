package classes2;

import java.util.Scanner;

/*
    사용자 입력 처리
    - Scanner 클래스
    - 정수 입력 : nextInt()
    - 문장 입력 : next(), nextLine()
 */

public class InputTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 이름은 무엇입니까?");

        String name = scanner.nextLine();
        System.out.println("당신의 나이는 몇 세 입니까?");
        int age = scanner.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "yrs");
    
        scanner.close();
    }
}
