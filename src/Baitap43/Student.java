package Baitap43;

public abstract class Student extends Person{
    private double mathScore;
    private double englishScore;
    private double literatureScore;
    private double tuition;

    public Student(String id, String name, String yob, double mathScore, double englishScore, double literatureScore, double tuition) {
        super(id, name, yob);
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.literatureScore = literatureScore;
        this.tuition = tuition;
    }

    public double getMathScore() {
        return mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public double getTuition() {
        return tuition;
    }

    public abstract double calculateDTB();
    public abstract double calculateTuition();
    public abstract void display();

}
