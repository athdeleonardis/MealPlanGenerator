package Test.Meal;


import Item.ConcreteItem;
import Meal.ConcreteMeal;

public class MealTest {
    public static void main(String[] args) {
        ConcreteItem spag = new ConcreteItem("Argo's Spaghetti", "Spaghetti", 300, 300);
        ConcreteItem sauce = new ConcreteItem("Argo's Sauce", "Sauce", 200, 100);
        ConcreteItem meat = new ConcreteItem("Argo's Meat", "Meat", 500, 400);
        ConcreteItem theBanana = new ConcreteItem("Argo's banana", "Banana", 100, 200);

        ConcreteMeal testMeal = new ConcreteMeal("Spaghetti Bolognese");
        testMeal.addItem(spag, 1);
        testMeal.addItem(sauce, 1);
        testMeal.addItem(meat, 1);
        testMeal.addItem(theBanana, 2);

        System.out.println(testMeal.toString());
        System.out.println("Cost: " + (float)testMeal.getCostInCents()/100);
        System.out.println("Kilojoules: " + testMeal.getKilojoules());
    }
}
