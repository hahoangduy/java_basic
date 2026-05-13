package Baitap40;

public abstract class Character {
    private String characterName;
    private double maxHP;

    private String type;
    private double attack;

    public Character(String characterName, double maxHP, double attack, String type) {
        this.characterName = characterName;
        this.maxHP = maxHP;
        this.attack = attack;
        this.type = type;
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

    public String getType() {
        return type;
    }
    public abstract double fight();

    public abstract double attacked(double dame);

    public abstract double recovery();
    public abstract String status();
    public abstract void display();

}
