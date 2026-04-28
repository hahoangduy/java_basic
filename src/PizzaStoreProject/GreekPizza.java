package PizzaStoreProject;

public class GreekPizza extends Pizza{
    public GreekPizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
    }

    public static void addGreek() {
        System.out.println("Adding greek");
    }
}
