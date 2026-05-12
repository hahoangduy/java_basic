package Baitap40;

public abstract class Character {
    private String characterName;
    private double maxHP;


    private double attack;

    public Character(String characterName, double maxHP, double attack) {
        this.characterName = characterName;
        this.maxHP = maxHP;
        this.attack = attack;
    }

    public String getCharacterName() {
        return characterName;
    }

    public double getMaxHP() {
        return maxHP;
    }


    public double getAttack() {
        return attack;
    }


    public abstract double fight();

    public abstract double biTancong(double dame);

    public abstract double recovery();
    public abstract String status();
    public abstract void display();

}
