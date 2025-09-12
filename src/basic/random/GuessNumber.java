package basic.random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 입력 클래스 호출
        Scanner sc = new Scanner(System.in);
        // Random 클래스 호출
        Random rnd = new Random();
        // 컴퓨터의 난수 발생(1~30)
        int comNum = rnd.nextInt(30) + 1;
        
        // 무한 반복문
        while (true) {
            try {
                System.out.println("Insert Number(1~30): ");
                // 숫자 입력(문자를 숫자로 변환)
                int guessNum = Integer.parseInt(sc.nextLine());
                if (guessNum == comNum) {
                System.out.println("Correct!");
                break;
                } else if (guessNum > comNum) {
                    if (guessNum > 30) {
                        System.out.println("Number range is 1~30");
                    } else
                    System.out.println("Down");
                } else if (guessNum < comNum) {
                    if (guessNum < 1) {
                    System.out.println("Number range is 1~30");                    
                    } else
                    System.out.println("Up");
                } else {
                    System.out.println("Error");
                }
            } catch(NumberFormatException e) {
                System.out.println("Insert valid number");
            }
        }
        sc.close();
    }
}
