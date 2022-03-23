package Structural_Pattern.Facade;

public class Shop {
    private String menu;

    public Shop(String menu) {
        this.menu = menu;
    }

    public void makeADish() {
        System.out.println("주문 받음");
        System.out.println(menu + " 조리중...");
        System.out.println("조리 완료! 배달 시작!");
    }
}
