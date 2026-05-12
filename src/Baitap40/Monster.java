package Baitap40;

public class Monster extends Character{
    private double presentHP;
    public Monster(String characterName, double maxHP, double attack) {
        super(characterName, maxHP, attack);
        this.presentHP = maxHP;
    }

    @Override
    public double fight() {
        double a = getMaxHP() - presentHP;
        double b = a * 0.1;
        return b + getAttack();
    }

    @Override
    public double biTancong(double dame) {
        presentHP -= dame;
        return dame;
    }

    @Override
    public double recovery() {
        return 0;
    }

    @Override
    public String status() {
        if (presentHP <= 0) {
            return "Đã chết";
        }
        return "Còn sống";
    }

    @Override
    public void display() {
        System.out.println(getCharacterName() + " |HP: " + presentHP + " |Attack: " + getAttack());
    }
}
