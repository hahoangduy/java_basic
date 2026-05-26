package Baitap42;

public abstract class Card{
    private String nameCard;
    private String type;
    private int manaCost;
    private int atk;
    private int hp;

    public Card(String nameCard, String type, int manaCost, int atk, int hp) {
        this.nameCard = nameCard;
        this.type = type;
        this.manaCost = manaCost;
        this.atk = atk;
        this.hp = hp;
    }

    public Card(String nameCard, String type, int manaCost) {
        this.nameCard = nameCard;
        this.type = type;
        this.manaCost = manaCost;
    }

    public String getNameCard() {
        return nameCard;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }
    public int getAtk() {
        return atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract int attack(int dame);
    public abstract int heal(String nameHeal, int heal);
    public abstract void displayCard();
}
