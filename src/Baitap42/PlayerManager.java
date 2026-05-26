package Baitap42;

import java.util.HashMap;

public class PlayerManager {
    HashMap<String, Player> listPlayer = new HashMap<>();

    public HashMap<String, Player> getListPlayer() {
        return listPlayer;
    }

    public void addPlayer(Player pl) {
        listPlayer.put(pl.getNamePlayer(), pl);
        System.out.println("Thêm người chơi thành công!");
    }

    public void displayPlayer() {
        for (String key : listPlayer.keySet()) {
            Player value = listPlayer.get(key);
            value.display();
        }
    }

    public void displayPlayerWithOut(String name) {
        for (String key : listPlayer.keySet()) {
            if (!key.equals(name)) {
                Player value = listPlayer.get(key);
                value.display();
            }
        }
    }

    public void attackPlayer(String nameAttacked, int dame) {
        for (Player pl : getListPlayer().values()) {
            if (nameAttacked.equals(pl.getNamePlayer())) {
                pl.attacked(dame);
            }
        }

    }

    public void attackPlayerV2(Player player, int dame) {
        player.attacked(dame);
        if (player.getHpPlayer() <= 0) {
            System.out.println(player.getNamePlayer() + " da chet");
            getListPlayer().remove(player.getNamePlayer());
        }
    }

}
