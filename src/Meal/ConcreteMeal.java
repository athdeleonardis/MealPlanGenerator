package Meal;

import Item.ConcreteItem;

public class ConcreteMeal extends Meal<ConcreteItem> {
    private int costInCents;
    private int kilojoules;

    public ConcreteMeal(String name) {
        super(name);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public int getKilojoules() {
        return kilojoules;
    }

    @Override
    public void addItem(ConcreteItem item, int amount) {
        super.addItem(item, amount);
        this.costInCents += item.getCostInCents() * amount;
        this.kilojoules += item.getKilojoules() * amount;
    }
}
