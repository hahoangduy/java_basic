package Baitap43;

public class FullTimeTeachers extends Teacher{
    private double basicSalary;

    public FullTimeTeachers(String id, String name, String yob, int teachingHours, double basicSalary) {
        super(id, name, yob, teachingHours);
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        double teachingHours = getTeachingHours() * 100000;
        double salary = teachingHours + basicSalary;
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Type: Full time teachers |Teaching hours: " + getTeachingHours() + " |Basic salary: " + basicSalary + " |Total salary: " + calculateSalary());
    }
}
