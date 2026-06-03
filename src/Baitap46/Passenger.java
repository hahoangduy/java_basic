package Baitap46;

public class Passenger {
    private String id;
    private String name;
    private int yob;

    public Passenger(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
