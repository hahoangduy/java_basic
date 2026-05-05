package PizzaStoreProject;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please chose your pizza type: " +
                "\n 1. Cheese pizza" +
                "\n 2. Greek pizza" +
                "\n 3. Pepperoni pizza");
        String pzType = sc.nextLine();

        System.out.println("Please chose your pizza dough: " +
                "\n 1. Thin" +
                "\n 2. Thick");
        String pzDough = sc.nextLine();

        System.out.println("Please chose your pizza sauce: " +
                "\n 1. Chilli" +
                "\n 2. Sweet");
        String pzSauce = sc.nextLine();
        if (pzType.equals("1")) {
            CheesePizza.perpare();
            CheesePizza.addCheese();

        }
        if (pzType.equals("2")) {
            GreekPizza.perpare();
            GreekPizza.addGreek();
        }
        if (pzType.equals("3")) {
            PepperoniPizza.perpare();
            PepperoniPizza.addPepper();
        }
    }
}
