package Baitap49;

public abstract class Student extends Person{
    private double mathScore;
    private double literatureScore;
    private double englishScore;
    private double baseTuition = 10000000;
    public Student(String id, String fullName, int birthYear, double mathScore, double literatureScore, double englishScore) {
        super(id, fullName, birthYear);
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }

    public double getBaseTuition() {
        return baseTuition;
    }

    public double calculateAverageScore() {
        return (mathScore + literatureScore + englishScore) / 3.0;
    }
    public abstract double calculateTuition();
    public abstract String getStudentType();
    public abstract void display();
}
