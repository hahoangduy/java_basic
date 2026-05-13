package Baitap40;

public class Monster extends Character{
    private double presentHP;
    private double car;
    public Monster(String characterName, double maxHP, double attack, String type, double car) {
        super(characterName, maxHP, attack, type);
        this.presentHP = maxHP;
        this.car = car;
    }

    @Override
    public double fight() {
        return getAttack();
    }

    @Override
    public double attacked(double dame) {
        presentHP -= dame;
        System.out.println("Bạn bị quái vật phản đòn mất " + (dame * car) + " máu.");
        return dame * car;
    }

    @Override
    public double recovery() {
        return 0;
    }

    @Override
    public String status() {
        if (presentHP <= 0) {
            presentHP = 0;
            return "Đã chết";
        }
        return "Còn sống";
    }

    @Override
    public void display() {
        System.out.println(getCharacterName() + " |Type: Monster" + " |HP: " + presentHP + " |Attack: " + getAttack() + " |Counter-Attack ratio: " + car);
    }
}
