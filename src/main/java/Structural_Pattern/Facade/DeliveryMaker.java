package Structural_Pattern.Facade;

public class DeliveryMaker {
    private DeliveryMaker() {

    }

    public static void makeADelivery(String food) {
        Menu menu = new Menu(food);
        Payment payment = new Payment(menu.getPrice());
        payment.payForMenu();
        Shop shop = new Shop(menu.getName());
        shop.makeADish();
    }
}
