package classes2.polymorphism.fruit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Grape | 2. Peach | 3. Banana");
        System.out.print("Select> ");

        int menu = scan.nextInt();

        // 부모타입 인스턴스 생성
        Fruit fruit = null;
        if (menu == 1) {
            fruit = new Grape();
        } else if (menu == 2) {
            fruit = new Peach();
        } else if (menu == 3) {
            fruit = new Banana();
        }
        fruit.showInfo();


        scan.close();

    }
}
