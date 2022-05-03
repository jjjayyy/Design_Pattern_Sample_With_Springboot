package Structural_Pattern.Adapter;


import org.junit.jupiter.api.Test;

class AdapterTest {

    @Test
    public void 빠른배송() {
        Delivery orderItem = new FastDelivery("노트북");
        orderItem.makeDelivery();
    }

}
