package Baitap42;

public class SpellCard extends Card{
    private int atkSpell;
    private int healSpell;

    public SpellCard(String nameCard, String type, int manaCost, int atkSpell, int healSpell) {
        super(nameCard, type, manaCost);
        this.atkSpell = atkSpell;
        this.healSpell = healSpell;
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
        if (getHp()+heal >= getHp()) {
            System.out.println("Bạn không thể hồi máu vượt quá lượng máu tối đa!");
        }
        else {
            setHp(getHp() + heal);
        }
        return 0;
    }

    @Override
    public void displayCard() {
        if (getType().equals("Attack Spell")) {
            System.out.println("Name card: " + getNameCard() + " |Type: " + getType() + " |Attack: " + getAtk() + " |Mana cost: " + getManaCost());
        }
        if (getType().equals("Heal Spell")) {
            System.out.println("Name card: " + getNameCard() + " |Type: " + getType() + " |Heal: " + getHp() + " |Mana cost: " + getManaCost());
        }
    }
}
