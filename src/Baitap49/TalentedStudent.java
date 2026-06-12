package Baitap49;

public class TalentedStudent extends Student{
    public TalentedStudent(String id, String fullName, int birthYear, double mathScore, double literatureScore, double englishScore) {
        super(id, fullName, birthYear, mathScore, literatureScore, englishScore);
    }

    @Override
    public double calculateTuition() {
        if (calculateAverageScore() >= 8.0) {
            return getBaseTuition() * 0.5;
        }
        return getBaseTuition();
    }

    @Override
    public String getStudentType() {
        return "Talented Student";
    }
    @Override
    public void display() {
        System.out.println("Name: " + getFullName() + " |Average score: " + calculateAverageScore());
    }
}
