package Baitap49;

public class RegularStudent extends Student{
    public RegularStudent(String id, String fullName, int birthYear, double mathScore, double literatureScore, double englishScore) {
        super(id, fullName, birthYear, mathScore, literatureScore, englishScore);
    }

    @Override
    public double calculateTuition() {
        return getBaseTuition();
    }

    @Override
    public String getStudentType() {
        return "Regular Student";
    }
    @Override
    public void display() {
        System.out.println("Name: " + getFullName() + " |Average score: " + calculateAverageScore());
    }
}
