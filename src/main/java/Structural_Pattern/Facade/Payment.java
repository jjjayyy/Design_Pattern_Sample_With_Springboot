package Structural_Pattern.Facade;

public class Payment {
    private int price;

    public Payment(int price) {
        this.price = price;
    }

    public void payForMenu() {
        System.out.println("복잡한 결제로직 ing...");
        System.out.println("결제가 완료되었습니다.");
    }
}
