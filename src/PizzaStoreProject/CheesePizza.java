package PizzaStoreProject;

public class CheesePizza extends Pizza{

    public CheesePizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
    }


    public static void addCheese() {
        System.out.println("Adding cheese...");
    }



}
