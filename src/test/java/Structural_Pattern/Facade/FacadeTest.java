package Structural_Pattern.Facade;

import org.junit.jupiter.api.Test;

class FacadeTest {

    @Test
    public void 치킨_배달() {
        DeliveryMaker.makeADelivery("치킨");
    }
}