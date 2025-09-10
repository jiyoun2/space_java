package classes2.inheritance.car;

public class Main {
    public static void main(String[] args) {
        EV myEV = new EV("KIA", "EV6", 50);

        // 출력 (테스트 전)
        // myEV.showInfo();

        // 기능 테스트
        myEV.accelerate(60);
        myEV.brake(30);
        // myEV.brake(70); // 최저속도 0
        myEV.charge(60); // 최대 100

        // 출력 (테스트 후)
        myEV.showInfo();

    }
}
