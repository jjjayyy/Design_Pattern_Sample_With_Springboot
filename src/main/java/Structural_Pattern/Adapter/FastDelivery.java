package Structural_Pattern.Adapter;

public class FastDelivery extends Delivery {
    private NormalDelivery normalDelivery;

    public FastDelivery (String item) {
        this.normalDelivery = new NormalDelivery(item);
    }

    public void makeDelivery() {
        normalDelivery.makeADelivery();
    }
}
