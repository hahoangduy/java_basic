package Baitap42;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Bối cảnh
        Bạn đang phát triển hệ thống Core Engine cho một tựa game thẻ bài chiến thuật đánh theo lượt (tương tự Hearthstone hay Yu-Gi-Oh).
         Trong game, các Người chơi (Player) sẽ sử dụng Năng lượng (Mana) để tung ra các Thẻ bài (Card) nhằm tiêu diệt đối phương.

        2. Yêu cầu nghiệp vụ & Luật chơi

        * Quy tắc của Người chơi (Player):
        - Mỗi người chơi bắt đầu với một Tên gọi, Lượng máu (HP) tối đa là 30, và một lượng Năng lượng (Mana) nhất định trong mỗi hiệp.
        - Người chơi có một "Bàn cờ" để chứa các thẻ bài sinh vật đang bảo vệ mình.
        - Người chơi có thể nhận sát thương (bị trừ máu) hoặc được hồi máu. Nếu máu của người chơi <= 0, trò chơi kết thúc.
        ai thap mau hon thi duoc danh truoc

        * Quy tắc chung của Thẻ bài (Card):
        - Mọi thẻ bài đều có Tên thẻ và mức Tiêu hao năng lượng (Mana Cost). Nếu người chơi không đủ Mana, thẻ bài đó không thể được sử dụng.

        * Thẻ Sinh Vật (Creature Card):
        - Khi được sử dụng, nó sẽ trừ Mana của người chơi và xuất hiện trên "Bàn cờ".
        - Đặc điểm: Có chỉ số Sức tấn công (ATK) và Lượng máu (HP).
        - Cơ chế chiến đấu:
            + Sinh vật có thể chọn tấn công một Sinh vật khác của đối phương:
            Khi va chạm, cả hai bên cùng gây sát thương lên nhau CÙNG LÚC (Máu sinh vật A bị trừ bằng ATK của sinh vật B, và ngược lại).
            Nếu HP của sinh vật <= 0, nó bị tiêu diệt và biến mất khỏi bàn cờ.
            + Sinh vật cũng có thể chọn tấn công trực tiếp Người chơi đối phương: Sát thương sẽ trừ thẳng vào HP của người chơi (Sinh vật tấn công không bị mất máu).



        * Thẻ Sinh Vật Phòng Ngự (Shield Creature - Một biến thể của Thẻ Sinh Vật):
        - Sở hữu mọi đặc tính chiến đấu như Sinh vật thường, nhưng mang thêm cơ chế "Khiêu khích" (Taunt).
        - Luật Khiêu khích: Nếu trên bàn cờ của người chơi CÓ Sinh vật phòng ngự, đối phương (bất kể là dùng Sinh vật hay Thẻ phép)
        BẮT BUỘC phải nhắm mục tiêu vào Sinh vật phòng ngự này. Đối phương KHÔNG ĐƯỢC PHÉP nhắm mục tiêu vào Người chơi hay các Sinh vật thường khác
        cho đến khi Sinh vật phòng ngự bị tiêu diệt.



        * Thẻ Phép Thuật (Spell Card):
        - Thẻ phép không nằm lại trên bàn cờ. Khi sử dụng, nó trừ Mana, tạo ra hiệu ứng ngay lập tức rồi biến mất.
        - Phép Sát Thương (Damage Spell): Gây ra một lượng sát thương (X) cố định lên một MỤC TIÊU BẤT KỲ (có thể là Sinh vật hoặc Người chơi đối phương).
        - Phép Hồi Phục (Heal Spell): Hồi phục một lượng máu (Y) cố định cho một MỤC TIÊU BẤT KỲ. Không thể hồi vượt mức máu tối đa của mục tiêu đó.

        3. Kịch bản mô phỏng (Test Cases)
        Hãy thiết kế hệ thống và giả lập trận đấu sau trong hàm main():

        - Khởi tạo:
            + Player 1: Tên "Yugi", HP: 30, Mana hiện tại: 10.
            + Player 2: Tên "Kaiba", HP: 30, Mana hiện tại: 10.

        - Khởi tạo Thẻ bài của Yugi:
            + "Phù thủy áo đen" (Sinh vật thường): Cost 5, ATK 6, HP 7.
            + "Khiên ma thuật" (Sinh vật phòng ngự): Cost 3, ATK 1, HP 8.

        - Khởi tạo Thẻ bài của Kaiba:
            + "Rồng trắng mắt xanh" (Sinh vật thường): Cost 8, ATK 8, HP 8.
            + "Sét phá hoại" (Phép sát thương): Cost 4, Sát thương 5.

        - Giả lập diễn biến (Lưu ý: Hệ thống cần trừ đúng Mana của Player khi dùng thẻ):
            + Lượt Yugi: Dùng thẻ "Phù thủy áo đen" và "Khiên ma thuật" đặt lên bàn cờ. (Yugi còn 2 Mana).
            + Lượt Kaiba:
                1. Kaiba cố gắng dùng "Rồng trắng mắt xanh" tấn công trực tiếp Yugi. Hệ thống phải BÁO LỖI (in ra màn hình) vì Yugi đang có "Khiên ma thuật" bảo vệ.
                2. Kaiba buộc phải đổi mục tiêu, dùng "Rồng trắng mắt xanh" tấn công "Khiên ma thuật".
                3. Kaiba dùng "Sét phá hoại" giáng vào "Phù thủy áo đen".
            + Kết thúc hiệp: In ra trạng thái HP của cả 2 Người chơi, Mana còn lại, và danh sách Sinh vật còn sống sót trên bàn cờ của mỗi bên
            (cùng số HP còn lại của chúng).*/

        Scanner sc = new Scanner(System.in);
        PlayerManager playerManager = new PlayerManager();
        String cardName = "";
        int choice;
        do {
            System.out.println("---- Card Game ----");
            System.out.println("1. Tạo người chơi | 2. Tạo thẻ bài | 3. Tấn công | 4. Tắt trò chơi");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên người chơi: ");
                    String playerName = sc.next();
                    System.out.println("Nhập HP tối đa của người chơi: ");
                    int playerHP = sc.nextInt();
                    System.out.println("Nhập Mana tối đa của người chơi: ");
                    int playerMana = sc.nextInt();
                    Player player = new Player(playerName, playerHP, playerMana);
                    playerManager.addPlayer(player);
                    break;
                case 2:
                    playerManager.displayPlayer();
                    System.out.println("Mời nhập tên người chơi: ");
                    String playerNameSearch = sc.next();
                    for (Player pl : playerManager.getListPlayer().values()) {
                        if (pl.getNamePlayer().equals(playerNameSearch)) {
                            System.out.println("Bạn muốn tạo thẻ bài gì?");
                            System.out.println("1. Creature Card | 2. Shield Creature Card | 3. Spell Card");
                            int choice1 = sc.nextInt();
                            switch (choice1) {
                                case 1:
                                    System.out.println("Nhập tên thẻ bài: ");
                                    cardName = sc.next();
                                    System.out.println("Nhập lượng Mana tiêu tốn: ");
                                    int cardManaCost = sc.nextInt();
                                    System.out.println("Nhập điểm tấn công của thẻ bài: ");
                                    int cardATK = sc.nextInt();
                                    System.out.println("Nhập HP tối đa của thẻ bài: ");
                                    int cardHP = sc.nextInt();
                                    pl.addCard(new CreatureCard(cardName, "Creature", cardManaCost, cardATK, cardHP));
                                    break;
                                case 2:
                                    System.out.println("Nhập tên thẻ bài: ");
                                    cardName = sc.next();
                                    System.out.println("Nhập lượng Mana tiêu tốn: ");
                                    int cardManaCost1 = sc.nextInt();
                                    System.out.println("Nhập điểm tấn công của thẻ bài: ");
                                    int cardATK1 = sc.nextInt();
                                    System.out.println("Nhập HP tối đa của thẻ bài: ");
                                    int cardHP1 = sc.nextInt();
                                    pl.addCard(new ShieldCreatureCard(cardName,"Shield creature", cardManaCost1, cardATK1, cardHP1));
                                    break;
                                case 3:
                                    System.out.println("Nhập tên thẻ bài: ");
                                    cardName = sc.next();
                                    System.out.println("Nhập lượng Mana tiêu tốn: ");
                                    int cardManaCost2 = sc.nextInt();
                                    System.out.println("Bạn muốn tạo thẻ phép tấn công hay phép hồi máu?");
                                    System.out.println("1. Phép tấn công | 2. Phép hồi máu");
                                    int choice3 = sc.nextInt();
                                    if (choice3 == 1) {
                                        System.out.println("Nhập điểm tấn công của thẻ bài: ");
                                        int cardATK2 = sc.nextInt();
                                        pl.addCard(new SpellCard(cardName,"Attack Spell", cardManaCost2, cardATK2, cardATK2));
                                    }
                                    if (choice3 == 2) {
                                        System.out.println("Nhập số máu được phục hồi của thẻ bài: ");
                                        int heal = sc.nextInt();
                                        pl.addCard(new SpellCard(cardName,"Heal Spell",cardManaCost2, heal, heal));
                                    }
                            }
                        }
                    }
                    break;
                case 3:
                    playerManager.displayPlayer();
                    System.out.println("Bạn muốn chọn người chơi nào để hành động?");
                    String playerNameChose = sc.next();
                    Player pl1 = null;
                    if (playerManager.getListPlayer().containsKey(playerNameChose)) {
                        pl1 = playerManager.getListPlayer().get(playerNameChose);
                        pl1.displayCard();
                    }
                    System.out.println("Mời chọn thẻ bài: ");
                    String cardUse = sc.next();

                    Card cardUse1 = pl1.getListCard().get(cardUse);
                    playerManager.displayPlayerWithOut(playerNameChose);
                    System.out.println("Bạn muốn tác động vào người chơi nào?");
                    String playerNameAttacked = sc.next();
                    Player pl2 = null;
                    if (playerManager.getListPlayer().containsKey(playerNameAttacked)) {
                        pl2 = playerManager.getListPlayer().get(playerNameAttacked);
                    }
                    for (Card c : pl1.getListCard().values()) {
                        if (playerManager.getListPlayer().containsKey(playerNameAttacked)) {
                            if (c.getNameCard().equals(cardUse)) {
                                System.out.println("Bạn muốn tấn công vào người chơi hay thẻ bài của người chơi đó?");
                                System.out.println("1. Player | 2. Card");
                                int choice3 = sc.nextInt();
                                String sccName = pl2.getSCCName();
                                if (sccName != "") {
                                    pl2.attackCard(sccName, c.getAtk());
                                }
                                else {
                                    if (choice3 == 1) {
                                        if (pl1.getManaPlayer() < c.getManaCost()) {
                                            System.out.println(pl1.getNamePlayer() + " không đủ Mana để tung chiêu!");
                                            break;
                                        }
                                        /*playerManager.attackPlayer(playerNameAttacked, c.getAtk());
                                        pl1.setManaPlayer(pl1.getManaPlayer() - c.getManaCost());
                                        if (pl2.getHpPlayer() <= 0) {
                                            playerManager.getListPlayer().remove(pl2.getNamePlayer());
                                        }*/

                                        playerManager.attackPlayerV2(pl2, c.getAtk());
                                    }
                                    if (choice3 == 2) {
                                        pl2.displayCard();
                                        System.out.println("Bạn muốn tấn công thẻ bài nào?");
                                        String cardAttacked = sc.next();
                                        if (pl1.getManaPlayer() < c.getManaCost()) {
                                            System.out.println(pl1.getNamePlayer() + " không đủ Mana để tung chiêu!");
                                            break;
                                        }
                                        pl1.setManaPlayer(pl1.getManaPlayer() - c.getManaCost());


                                        /*pl2.attackCard(cardAttacked, c.getAtk());
                                        for (Card ca : pl2.getListCard().values()) {
                                            if (ca.getHp() <= 0) {
                                                pl2.getListCard().remove(ca.getNameCard());
                                            }
                                        }*/
                                        // tan cong va kiem tra mau, mau <= 0 -> xoa the bai
                                        Card cardAttacked1 = pl2.getListCard().get(cardAttacked);
                                        pl2.attackCardV2(cardAttacked1, c.getAtk());

                                        // tan cong nguoc lai the bai tan cong
                                        /*for (Card card : pl2.getListCard().values()) {
                                            if (card.getNameCard().equals(cardAttacked)) {
                                                if (!(card.getHp() <= 0)) {
                                                    pl1.attackCard(cardUse, card.getAtk());
                                                    for (Card car : pl1.getListCard().values()) {
                                                        if (car.getHp() <= 0) {
                                                            pl1.getListCard().remove(car.getNameCard());
                                                        }
                                                    }
                                                }
                                            }
                                        }*/


                                        if (cardAttacked1.getHp() > 0) {
                                            pl1.attackCardV2(cardUse1, cardAttacked1.getAtk());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Đang tắt...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
                    break;
                    /*
                     cho chọn thẻ bài của player1
                     hỏi muốn tấn công player nào
                     hỏi muốn tấn công thẳng vào player hay thẻ bài của player đó
                     if (player) - > show list player trừ player1
                     lấy thẻ được chọn tấn công vào player bị tấn công
                     if (card) - > show list card của player được chọn
                     */
            }
        }while (choice != 4);
    }
}
