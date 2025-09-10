package classes2.inheritance.car;

public class EV extends Car { // extends; 상속 받기
    private int battery; // 배터리 잔량 (0~100%)

    // 생성자
    public EV(String brand, String model, int battery) {
        super(brand, model); // 자기껀 this, 상속받을 때는 super 함수 super(변수1,변수2)
        this.battery = battery;
    }

    // 충전기능
    public void charge(int amount) {
        battery += amount;
        if (battery > 100)
            battery = 100; // 최대값 제한
        System.out.println(model + " 충전됨 - 배터리: "+ battery + "%");
    }

    // EV 정보 출력 - 메서드 재정의(override)
    @Override
    public void showInfo() {
        super.showInfo(); // 부모 메서드 상속
        System.out.println("Battery: " + battery + "%");
    }
}
