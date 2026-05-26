package Baitap42;


import java.util.HashMap;

public class Player {
    private String namePlayer;
    private int hpPlayer;
    private int manaPlayer;

    public Player(String namePlayer, int hpPlayer, int manaPlayer) {
        this.namePlayer = namePlayer;
        this.hpPlayer = hpPlayer;
        this.manaPlayer = manaPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public int getHpPlayer() {
        return hpPlayer;
    }

    public int getManaPlayer() { return manaPlayer; }
    public void setManaPlayer(int manaPlayer) {
        this.manaPlayer = manaPlayer;
    }

    HashMap<String, Card> listCard = new HashMap<>();

    public HashMap<String, Card> getListCard() {
        return listCard;
    }
    public void displayCard() {
        for (String key : listCard.keySet()) {
            Card value = listCard.get(key);
            value.displayCard();
        }
    }
    public void addCard(Card c) {
        listCard.put(c.getNameCard(), c);
        System.out.println("Thêm thẻ bài thành công!");
    }

    public void attacked(int dame) {
        hpPlayer -= dame;
        System.out.println("Người chơi " + namePlayer + " bị tấn công mất " + dame + " máu.");
        if (hpPlayer <= 0) {
            hpPlayer = 0;
            System.out.println(namePlayer + " đã chết!");
        }
    }
    public int attackCard(String nameAttacked, int dame) {
        for (Card c : getListCard().values()) {
            if (nameAttacked.equals(c.getNameCard())) {
                c.attack(dame);
                if (c.getHp() <= 0) {
                    System.out.println("Thẻ bài " + c.getNameCard() + " đã chết!");
                }
            }
        }
        return dame;
    }

    public int attackCardV2 (Card card, int dame) {
        card.attack(dame);
        if (card.getHp() <= 0) {
            System.out.println(card.getNameCard() + " da chet");
            this.listCard.remove(card.getNameCard());
        }
        return dame;
    }

    public boolean checkHasSCC() {
        for (Card c : getListCard().values()) {
            if (c.getType().equals("Shield creature")) {
                System.out.println("Vì đối thủ có thẻ bài Shield Creature nên thẻ bài của bạn phải tấn công vào thẻ bài này!");
                return true;
            }
        }
            return false;
    }

    public String getSCCName() {
        for (Card c : getListCard().values()) {
            if (c.getType().equals("Shield creature")) {
                System.out.println("Vì đối thủ có thẻ bài Shield Creature nên thẻ bài của bạn phải tấn công vào thẻ bài này!");
                return c.getNameCard();
            }
        }
        return "";
    }


    public void healSpell(String nameHeal, int heal) {
        for (Card c : getListCard().values()) {
            if (nameHeal.equals(c.getNameCard())) {
                c.heal(nameHeal, heal);
            }
        }
        if (nameHeal.equals(namePlayer)) {
            hpPlayer += heal;

        }
    }
    public void display() {
        if (hpPlayer <= 0) {
            System.out.println("Name player: " + namePlayer + " (đã chết) |HP: " + hpPlayer + " |Mana: " + getManaPlayer());
        }
        else
            System.out.println("Name player: " + namePlayer + " |HP: " + hpPlayer + " |Mana: " + getManaPlayer());
    }
}
