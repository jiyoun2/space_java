package classes2.singleton;

import classes2.car.Car;

public class CarTest {
    public static void main(String[] args) {
        // CarFactory 인스턴스 생성
        CarFactory factory1 = CarFactory.getInstance();
        // CarFactory factory2 = CarFactory.getInstance();
        
        // System.out.println(factory1);
        // System.out.println(factory2); // 주소가 같으므로 동일한 인스턴스

        // 자동차 인스턴스 생성
        Car car1 = factory1.createCar();
        Car car2 = factory1.createCar();
        Car car3 = factory1.createCar();

        System.out.println("Car No. " + car1.getCarNumber());
        System.out.println("Car No. " + car2.getCarNumber());
        System.out.println("Car No. " + car3.getCarNumber());

    }
}
