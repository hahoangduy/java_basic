package PizzaStoreProject;

import java.util.List;

public class Pizza {
    private static String name;
    private String dough;
    private String sauce;

    public Pizza(String name, String dough, String sauce) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public static void perpare() {
        System.out.println("Preparing your pizza...");
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Baking your pizza for 30 minutes...");
        System.out.println("Cutting...");
        System.out.println("Boxing...");
    }
}
