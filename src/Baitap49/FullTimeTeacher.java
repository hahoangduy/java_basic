package Baitap49;

public class FullTimeTeacher extends Teacher{
    private double baseSalary = 5000000;
    public FullTimeTeacher(String id, String fullName, int birthYear, double teachingHours) {
        super(id, fullName, birthYear, teachingHours);
    }


    @Override
    public double calculateSalary() {
        return  baseSalary + (getTeachingHours() * 100000);
    }
    @Override
    public String getTeacherType() {
        return "Full time";
    }
    @Override
    public void display() {
        System.out.println("Name: " + getFullName() + " |Base salary: " + baseSalary + " |Teaching hours: " + getTeachingHours());
    }
}
