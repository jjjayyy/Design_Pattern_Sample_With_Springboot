package Structural_Pattern.Facade;

public class Menu {

    private int price;
    private String name;

    public Menu (String name) {
        this.name = name;
        this.price = priceByMenu(name);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        int deliveryFee = 3000;
        System.out.println("음식 가격 : " + price + " / 배달비 : " + deliveryFee);
        return price + deliveryFee;
    }

    private int priceByMenu(String name) {
        int menuPrice = 0;
        switch (name) {
            case "치킨" : menuPrice = 15000; break;
            case "피자" : menuPrice = 20000; break;
        }
        return menuPrice;
    }
}
