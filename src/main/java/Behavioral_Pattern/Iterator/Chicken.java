package Behavioral_Pattern.Iterator;

public class Chicken extends Food {
    private String name;
    private long price;
    public Chicken(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getPrice() {
        return price;
    }
}
