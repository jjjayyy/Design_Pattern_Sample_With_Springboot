package Behavioral_Pattern.Iterator;

public class Menu implements Aggregate {
    private Food[] foods;
    private int last = 0 ;

    public Menu(int maxsize) {
        this.foods = new Food[maxsize];
    }

    public Food getFoodAt(int index) {
        return foods[index];
    }

    public void addFood(Food food) {
        this.foods[last] = food;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new MenuIterator(this);
    }
}
