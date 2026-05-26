package Baitap43;

public class TalentedStudents extends Student{
    public TalentedStudents(String id, String name, String yob, double mathScore, double englishScore, double literatureScore, double tuition) {
        super(id, name, yob, mathScore, englishScore, literatureScore, tuition);
    }

    @Override
    public double calculateDTB() {
        double DTB = (getEnglishScore() + getLiteratureScore() + getMathScore()) / 3;
        return DTB;
    }

    @Override
    public double calculateTuition() {
        double tuitionFeeReduction;
        if (calculateDTB() >= 8.0) {
            tuitionFeeReduction = getTuition() * 0.5;
            return tuitionFeeReduction;
        }
        return getTuition();
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Type: Talented students | Average score: " + calculateDTB() + " |Tuition: " + calculateTuition());
    }
}
