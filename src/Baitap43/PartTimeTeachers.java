package Baitap43;

public class PartTimeTeachers extends Teacher{
    public PartTimeTeachers(String id, String name, String yob, int teachingHours) {
        super(id, name, yob, teachingHours);
    }

    @Override
    public double calculateSalary() {
        double salary = getTeachingHours() * 200000;
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Type: Part time teachers |Teaching hours: " + getTeachingHours() + " |Total salary: " + calculateSalary());
    }
}
