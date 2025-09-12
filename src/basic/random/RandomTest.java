package basic.random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // 난수 생성
        // 1. Math.random(); - * n
        int n1 = (int)(Math.random()*2); 
        System.out.println(n1); // 0 or 1

        // 2. Random 클래스 - param n
        Random rnd = new Random();
        // System.out.println(rnd.nextInt());
        int n2 = rnd.nextInt(2);
        // System.out.println(n2); // 0 or 1

        // 동전 던지기 - 1(앞), 2(뒤)
        int coin = rnd.nextInt(2) + 1; // 1 or 2
        // System.out.println(coin);

        if (coin == 1) {
            System.out.println("Front");
        } else if (coin == 2) {
            System.out.println("Back");
        }
    }
}
