package Baitap49;

public abstract class Teacher extends Person{
    private double teachingHours;

    public Teacher(String id, String name, int yob, double teachingHours) {
        super(id, name, yob);
        this.teachingHours = teachingHours;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public abstract double calculateSalary();
    public abstract String getTeacherType();
    public abstract void display();

}
