package classes2.inheritance.car;

public class Car {
    protected String brand; // protected; 상속받는 클래스에서만 접근 가능(private 같은)
    protected String model;
    protected int speed;

    // 생성자
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // 가속 기능
    public void accelerate(int amount) {
        speed += amount;
        System.out.println(model + " 가속 - 현재속도: " + speed + "km/h");
    }

    // 감속 기능
    public void brake(int amount) {
        speed -= amount;
        if (speed < 0)
            speed = 0; // 최소값 제한
        System.out.println(model + " 감속 - 현재속도: " + speed + "km/h");
    }

    // 차 정보 출력
    public void showInfo() {
        System.out.println("===Car Info===");
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

}
