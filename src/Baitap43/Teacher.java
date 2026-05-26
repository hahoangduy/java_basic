package Baitap43;

public abstract class Teacher extends Person{
    private int teachingHours;

    public Teacher(String id, String name, String yob, int teachingHours) {
        super(id, name, yob);
        this.teachingHours = teachingHours;
    }

    public int getTeachingHours() {
        return teachingHours;
    }
    public abstract double calculateSalary();

    public abstract void display();
}
