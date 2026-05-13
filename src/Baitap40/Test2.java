package Baitap40;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterManagerV2 cm1 = new CharacterManagerV2();
        int choice;
        boolean isDead;
        double car;
        do {
            System.out.println("Bạn muốn?");
            System.out.println("1. Khởi tạo nhân vật | 2. Chiến đấu | 3. Kết thúc trò chơi");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhân vật của bạn tên gì?");
                    String name = sc.next();
                    System.out.println("Điểm tấn công của nhân vật: ");
                    double dameSet = sc.nextInt();
                    System.out.println("Máu tối đa của nhân vật: ");
                    double hp = sc.nextInt();
                    System.out.println("Bạn muốn nhân vật của bạn là?");
                    System.out.println("1. Warrior | 2. Mage | 3. Monster");
                    int chon = sc.nextInt();
                    switch (chon) {
                        case 1:
                            cm1.addC(new Warrior(name, hp, dameSet, "Warrior"));
                            System.out.println("Bạn thêm nhân vật thành công!");
                            break;
                        case 2:
                            System.out.println("Mana của nhân vật: ");
                            double mana = sc.nextDouble();
                            cm1.addC(new Mage(name, hp, dameSet, mana, "Mage"));
                            System.out.println("Bạn thêm nhân vật thành công!");
                            break;
                        case 3:
                            System.out.println("Mời nhập tỉ lệ phản đòn của quái vật: ");
                            car = sc.nextDouble();
                            cm1.addC(new Monster(name, hp, dameSet, "Monster", car));
                            break;
                        default:
                            System.out.println("Không có chức năng này!");
                            break;
                    }
                    break;
                case 2:
                    cm1.display();
                    System.out.println("Bạn muốn sử dụng nhân vật nào?");
                    String nameAttack = sc.next();
                    double dame = cm1.fight(nameAttack);
                    Character nat = cm1.getList().get(nameAttack);
                            if (nat.getType().equals("Warrior")) {
                                System.out.println("Bạn muốn làm gì?");
                                System.out.println("1. Tấn công | 2. Phòng thủ | 3. Tạo thêm nhân vật");
                                int choice1 = sc.nextInt();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Bạn muốn tấn công quái vật nào?");
                                        for (Character k : cm1.getList().values()) {
                                            if (k.getType().equals("Monster")) {
                                                k.display();
                                            }
                                        }
                                        String nameAttacked = sc.next();
                                        Character monAtked = cm1.getList().get(nameAttacked);
                                        if (monAtked.getType().equals("Monster")) {
                                            isDead = cm1.status(nameAttack);
                                            if (isDead) {
                                                System.out.println(nameAttack + " đã chết!");
                                                break;
                                            } else {
                                                System.out.println(nameAttacked + " bị trừ " + dame + " máu.");
                                                double dameCounter = cm1.attacked(nameAttacked, dame);
                                                cm1.attacked(nameAttack, dameCounter);
                                            }
                                            isDead = cm1.status(nameAttacked);
                                            if (isDead) {
                                                System.out.println(nameAttacked + " đã chết!");
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Đang nghỉ ngơi!");
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("Không có chức năng này!");
                                        break;
                                }
                            }
                            if (nat.getType().equals("Mage")) {
                                System.out.println("Bạn muốn làm gì?");
                                System.out.println("1. Tấn công | 2. Hồi máu | 3. Tạo thêm nhân vật");
                                int choice1 = sc.nextInt();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Bạn muốn tấn công quái vật nào?");
                                        for (Character k : cm1.getList().values()) {
                                            if (k.getType().equals("Monster")) {
                                                k.display();
                                            }
                                        }
                                        String nameAttacked = sc.next();
                                        Character monAtked = cm1.getList().get(nameAttacked);
                                        if (monAtked.getType().equals("Monster")) {
                                            isDead = cm1.status(nameAttack);
                                            if (isDead) {
                                                System.out.println(nameAttack + " đã chết!");
                                                break;
                                            } else {
                                                System.out.println(nameAttacked + " bị trừ " + dame + " máu.");
                                                double dameCounter = cm1.attacked(nameAttacked, dame);
                                                cm1.attacked(nameAttack, dameCounter);
                                            }
                                            isDead = cm1.status(nameAttacked);
                                            if (isDead) {
                                                System.out.println(nameAttacked + " đã chết!");
                                            }
                                        }
                                        break;
                                    case 2:
                                        cm1.recovery(nameAttack);
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("Không có chức năng này!");
                                        break;
                                }
                            }
                            if (nat.getType().equals("Monster")) {
                                System.out.println("Bạn muốn làm gì?");
                                System.out.println("1. Tấn công | 2. Hồi sức | 3. Tạo thêm nhân vật");
                                int choice1 = sc.nextInt();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Bạn muốn tấn công nhân vật nào?");
                                        System.out.println("1. Warrior | 2. Mage");
                                        int choice2 = sc.nextInt();
                                        if (choice2 == 1) {
                                            System.out.println("Bạn muốn tấn công ai?");
                                            for (Character k : cm1.getList().values()) {
                                                if (k.getType().equals("Warrior")) {
                                                    k.display();
                                                }
                                            }
                                            String nameAttacked = sc.next();
                                            Character wariAtked = cm1.getList().get(nameAttacked);
                                            if (wariAtked.getType().equals("Warrior")) {
                                                isDead = cm1.status(nameAttack);
                                                if (isDead) {
                                                    System.out.println(nameAttack + " đã chết!");
                                                    break;
                                                } else {
                                                    System.out.println(nameAttacked + " bị trừ " + dame + " máu.");
                                                    cm1.attacked(nameAttacked, dame);
                                                }
                                                isDead = cm1.status(nameAttacked);
                                                if (isDead) {
                                                    System.out.println(nameAttacked + " đã chết!");
                                                }
                                            }
                                        }
                                        if (choice2 == 2) {
                                            System.out.println("Bạn muốn tấn công ai?");
                                            for (Character k : cm1.getList().values()) {
                                                if (k.getType().equals("Mage")) {
                                                    k.display();
                                                }
                                            }
                                            String nameAttacked = sc.next();
                                            Character mageAtked = cm1.getList().get(nameAttacked);
                                            if (mageAtked.getType().equals("Mage")) {
                                                isDead = cm1.status(nameAttack);
                                                if (isDead) {
                                                    System.out.println(nameAttack + " đã chết!");
                                                    break;
                                                } else {
                                                    System.out.println(nameAttacked + " bị trừ " + dame + " máu.");
                                                    cm1.attacked(nameAttacked, dame);
                                                }
                                                isDead = cm1.status(nameAttacked);
                                                if (isDead) {
                                                    System.out.println(nameAttacked + " đã chết!");
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Đang hồi sức!");
                                        break;
                                    case 3:
                                        break;
                                }
                            }
                    break;
                case 3:
                    System.out.println("Đang kết thúc trò chơi!");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
                    break;
            }
        } while (choice != 3);
    }
}
