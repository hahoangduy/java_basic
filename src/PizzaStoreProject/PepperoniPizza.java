package PizzaStoreProject;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
    }

    public static void addPepper() {
        System.out.println("Adding pepper...");
    }
}
