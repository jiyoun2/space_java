package classes2.inheritance.drink;

public class Alcohol extends Drink {
    private float alcper; // 도수

    public Alcohol(String name, int price, int quantity, float alcper) {
        super(name, price, quantity);
        this.alcper = alcper;
    }


    // 제목행 재정의
    public static void printTitle() {
        System.out.println("상품명(도수[%])\t가격\t수량\t금액");
    }

    @Override
    public void printData() {
        System.out.println(name+"("+alcper+")"+"\t"+price+"\t"+quantity+"\t"+calcPrice());
    }
}
