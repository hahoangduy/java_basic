package Baitap43;

public class GeneralStudents extends Student{
    public GeneralStudents(String id, String name, String yob, double mathScore, double englishScore, double literatureScore, double tuition) {
        super(id, name, yob, mathScore, englishScore, literatureScore, tuition);
    }

    @Override
    public double calculateDTB() {
        double DTB = (getEnglishScore() + getLiteratureScore() + getMathScore()) / 3;
        return DTB;
    }

    @Override
    public double calculateTuition() {
        return getTuition();
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Type: General students | Average score: " + calculateDTB() + " |Tuition: " + calculateTuition());
    }
}
