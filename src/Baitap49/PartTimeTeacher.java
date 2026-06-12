package Baitap49;

public class PartTimeTeacher extends Teacher{
    public PartTimeTeacher(String id, String name, int yob, double teachingHours) {
        super(id, name, yob, teachingHours);
    }
    @Override
    public double calculateSalary() {
        return getTeachingHours() * 200000;
    }

    @Override
    public String getTeacherType() {
        return "Part time";
    }

    @Override
    public void display() {
        System.out.println("Name: " + getFullName() + " |Teaching hours: " + getTeachingHours());
    }
}
