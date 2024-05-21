package Meal;

import Item.ItemAmount;

import java.util.ArrayList;

public class Meal<T> {
    private String name;
    private ArrayList<ItemAmount<T>> items;

    public Meal(String name) {
        this.name = name;
        this.items = new ArrayList();
    }

    public void addItem(T item, int amount) {
        this.items.add(new ItemAmount<T>(item, amount));
    }

    public String getName() { return this.name; }
    public ArrayList<ItemAmount<T>> getItems() { return this.items; }

    public String toString() {
        String str = "Meal: { Name: " + name + ", Items: { ";
        for (ItemAmount ia : items) {
            str += ia.toString() + ", ";
        }
        str += "} }";
        return str;
    }
}
