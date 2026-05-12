package Baitap40;

public class Warrior extends Character{
    private double presentHP;
    public Warrior(String characterName, double maxHP, double attack) {
        super(characterName, maxHP, attack);
        this.presentHP = maxHP;
    }

    @Override
    public double fight() {
        double a;
        double b = getMaxHP() * 0.3;
        if (presentHP <= b){
            a = getAttack() * 2;
            return a;
        }
        return getAttack();
    }

    @Override
    public double biTancong(double dame) {
        presentHP = presentHP - dame;
        return dame;
    }

    @Override
    public String status() {
        if (presentHP <= 0) {
            return "Đã chết";
        }
        return "Còn sống";
    }

    @Override
    public double recovery() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println(getCharacterName() + " |HP: " + presentHP + " |Attack: " + getAttack());
    }
}
