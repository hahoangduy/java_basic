package Baitap42;

public class CreatureCard extends Card{

    public CreatureCard(String nameCard, String type, int manaCost, int atk, int hp) {
        super(nameCard, type, manaCost, atk, hp);
    }

    @Override
    public int attack(int dame) {
        setHp(getHp() - dame);
        if (getHp() <= 0) {
            setHp(0);
        }
        System.out.println("Thẻ bài " + getNameCard() + " của bạn bị tấn công mất " + dame + " máu.");
        return dame;
    }

    @Override
    public int heal(String nameHeal, int heal) {
        return 0;
    }

    @Override
    public void displayCard() {
        if (getHp() <= 0) {
            System.out.println("Name card: " + getNameCard() + " (đã chết)" + " |Type: " + getType() + " |ATK: " + getAtk() + " |HP: " + getHp() + " |Mana cost: " + getManaCost());
        }
        else
            System.out.println("Name card: " + getNameCard() + " |Type: " + getType() + " |ATK: " + getAtk() + " |HP: " + getHp() + " |Mana cost: " + getManaCost());
    }
}
