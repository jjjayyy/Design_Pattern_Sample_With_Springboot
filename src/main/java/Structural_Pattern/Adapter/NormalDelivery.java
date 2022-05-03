package Structural_Pattern.Adapter;

public class NormalDelivery {
    private String item;
    public NormalDelivery (String item) {
        this.item = item;
    }

    public void makeADelivery() {
        System.out.println(item + " 배송이 시작되었습니다!");
    }
}
