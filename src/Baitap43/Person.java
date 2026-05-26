package Baitap43;

public class Person {
    private String id;
    private String name;
    private String yob;

    public Person(String id, String name, String yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYob() {
        return yob;
    }

}
