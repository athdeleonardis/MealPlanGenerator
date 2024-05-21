package Item;

public class ItemAmount<T> {
    public T item;
    public int amount;

    public ItemAmount(T item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public String toString() {
        return item.toString() + " x" + amount;
    }
}
