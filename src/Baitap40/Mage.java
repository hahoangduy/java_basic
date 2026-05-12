package Baitap40;

public class Mage extends Character{
    private double mana;
    private double presentHP;

    public Mage(String characterName, double maxHP, double attack, double mana) {
        super(characterName, maxHP, attack);
        this.mana = mana;
        this.presentHP = maxHP;
    }

    @Override
    public double fight() {
        double a = getAttack();
        if (mana >= 20) {
            a = getAttack() * 2;
            mana -= 20;
        }
        return a;
    }

    @Override
    public double biTancong(double dame) {
        presentHP = presentHP - dame;
        return dame;
    }

    @Override
    public double recovery() {
        double a = 0;
        if (presentHP >= getMaxHP()) {
            System.out.println("Bạn không thể hồi máu vượt quá lượng máu tối đa");
            return 0;
        }
        if (mana < 10) {
            System.out.println("Bạn không thể hồi máu vì mana không đủ 10");
            return 0;
        }
        else {
            if ((presentHP + 30) > getMaxHP()) {
                System.out.println("Bạn không thể hồi máu vượt quá lượng máu tối đa");
            }
            else {
                presentHP += 30;
                a += 30;
                mana -= 10;
                System.out.println("Bạn đã được hồi " + a + " máu.");
            }
        }
        return a;
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
        System.out.println(getCharacterName() + " |HP: " + presentHP + " |Attack: " + getAttack() + " |Mana: " + mana);
    }
}
