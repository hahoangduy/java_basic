package Baitap49;

public class Person {
    private String id;
    private String name;
    private int yob;

    public Person(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public String getId() { return id; }
    public String getFullName() { return name; }
}
