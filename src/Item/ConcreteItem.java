package Item;

public class ConcreteItem {
    private String nameSpecific;
    private String nameBroad;
    private int costInCents;
    private int kilojoules;

    public ConcreteItem(String nameSpecific, String nameBroad, int costInCents, int kCalories) {
        this.nameSpecific = nameSpecific;
        this.nameBroad = nameBroad;
        this.costInCents = costInCents;
        this.kilojoules = kCalories;
    }

    public String getNameSpecific() {
        return nameSpecific;
    }

    public String getNameBroad() {
        return nameBroad;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public int getKilojoules() {
        return kilojoules;
    }

    public String toString() { return nameSpecific; }
}
