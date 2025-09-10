package classes2.car;

// Static이 있는 변수는 그 값을 생성된 인스턴스가 공유함(유지)

public class Car {
    // 차량번호 생성을 위한 기준번호
    private int serialNum = 1000; // 바로 초기화;
    private int carNumber; // 차량번호

    public Car() {
        serialNum++; // serialNum = serialNum + 1 => 1001
        carNumber = serialNum; // 차량번호 생성시마다 1000 +1
    }

    // 차량번호 반환; 가져오기
    public int getCarNumber() {
        return carNumber;
    }
}
