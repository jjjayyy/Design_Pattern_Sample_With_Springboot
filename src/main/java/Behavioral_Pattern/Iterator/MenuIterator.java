package Behavioral_Pattern.Iterator;

public class MenuIterator implements Iterator {

    private Menu menu;
    private int index;

    public MenuIterator(Menu menu) {
        this.menu = menu;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < menu.getLength();
    }

    @Override
    public Object next() {
        Food food = menu.getFoodAt(index);
        index++;
        return food;
    }
}
