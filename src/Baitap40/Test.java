package Baitap40;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        1. Bối cảnh
        Bạn được giao nhiệm vụ viết phần lõi (Core Engine) cho một trò chơi chiến đấu theo lượt.
        Trong thế giới này, có các Anh hùng và Quái vật chiến đấu với nhau.
        Mỗi thực thể đều có các chỉ số sinh tồn cơ bản và sở hữu các cơ chế chiến đấu/kỹ năng bị động khác nhau.

        2. Yêu cầu nghiệp vụ và cơ chế Game

        * Đặc điểm chung:
        Bất kỳ nhân vật nào tham gia trận chiến (dù là người hay quái vật) đều cần lưu trữ Tên gọi,
         Lượng máu ban đầu (Max HP), Lượng máu hiện tại, Lực tấn công cơ bản và Trạng thái sống/chết.
        Mọi nhân vật đều có khả năng hiển thị thông tin chỉ số của mình, có khả năng ra đòn tấn công một nhân vật khác,
         và có cơ chế nhận sát thương (bị trừ máu dựa trên đòn đánh của kẻ địch). Khi lượng máu giảm xuống mức 0 hoặc thấp hơn,
          nhân vật được tính là đã chết và không thể tiếp tục hành động.

        * Cơ chế của Kiếm Khách (Warrior):
        - Đánh gần bằng sức mạnh vật lý. Sát thương gây ra cho mục tiêu bằng đúng Lực tấn công cơ bản.
        - Kỹ năng bị động "Cuồng nộ": Ngay trước khi ra đòn, nếu lượng máu hiện tại của Kiếm Khách bị giảm xuống mức bằng hoặc thấp hơn 30% so với lượng máu tối đa
         ban đầu, đòn đánh đó sẽ kích hoạt bạo kích, gây ra mức sát thương gấp đôi bình thường.

        * Cơ chế của Pháp Sư (Mage):
        - Sử dụng năng lượng để dùng phép, do đó hệ thống cần quản lý thêm chỉ số Năng lượng (Mana) cho phái này.
        - Tấn công: Mỗi đòn đánh phép thuật tiêu tốn 20 Mana nhưng gây ra sát thương gấp đôi Lực tấn công cơ bản.
        Trong trường hợp bị cạn kiệt năng lượng (không đủ 20 Mana), Pháp Sư buộc phải đánh thường (không tốn Mana) với sát thương bằng đúng Lực tấn công cơ bản.
        - Khả năng Trị liệu: Trò chơi yêu cầu một cơ chế chuẩn hóa dành riêng cho các nhân vật có khả năng tự phục hồi sức khỏe
        (để sau này có thể áp dụng cho các phái khác như Tu Sĩ). Pháp Sư có thể vận dụng cơ chế này: Tiêu tốn 10 Mana để tự hồi phục 30 Máu.
        Lưu ý không thể hồi vượt mức máu tối đa ban đầu. Nếu không đủ 10 Mana, thao tác hồi máu thất bại.

        * Cơ chế của Quái Vật (Monster):
        - Quái vật tấn công bình thường với sát thương bằng đúng Lực tấn công cơ bản.
        - Kỹ năng bị động "Phản đòn": Cơ thể quái vật có gai nhọn. Bất cứ khi nào quái vật nhận sát thương từ một đòn tấn công,
        kẻ vừa ra đòn sẽ lập tức bị dội lại một lượng sát thương bằng đúng x% sát thương vừa gây ra cho quái vật.

        3. Kịch bản mô phỏng (Test Cases)
        Hãy thiết kế hệ thống OOP để đáp ứng các yêu cầu trên, sau đó khởi tạo một kịch bản trong hàm main() như sau:

        - Khởi tạo phe Anh hùng:
            + Một Kiếm Khách tên "Arthur", HP tối đa: 100, Lực tấn công: 15.
            + Một Pháp Sư tên "Merlin", HP tối đa: 80, Lực tấn công: 10, Năng lượng: 50.
        - Khởi tạo phe Địch:
            + Một Quái Vật tên "Dragon", HP tối đa: 300, Lực tấn công: 25.

        - Giả lập trận chiến diễn ra theo thứ tự sau:
            + Hiệp 1: Arthur tấn công Dragon. Merlin tấn công Dragon. Dragon tấn công Arthur.
            + Hiệp 2: Merlin tự hồi máu cho bản thân. Arthur tiếp tục tấn công Dragon. Dragon chuyển mục tiêu tấn công Merlin.
        - Cuối cùng, in ra trạng thái của tất cả nhân vật để đối chiếu xem logic trừ máu, trừ năng lượng, cơ chế cuồng nộ và phản đòn có hoạt động chính xác không.*/

        Scanner sc = new Scanner(System.in);
        CharacterManager cm = new CharacterManager();
        int choice;
        boolean isDead;
        double car = 0;
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
                            cm.addC(new Warrior(name, hp, dameSet, "Warrior"));
                            System.out.println("Bạn thêm nhân vật thành công!");
                            break;
                        case 2:
                            System.out.println("Mana của nhân vật: ");
                            double mana = sc.nextDouble();
                            cm.addC(new Mage(name, hp, dameSet, mana, "Mage"));
                            System.out.println("Bạn thêm nhân vật thành công!");
                            break;
                        case 3:
                            System.out.println("Mời nhập tỉ lệ phản đòn của quái vật: ");
                            car = sc.nextDouble();
                            cm.addC(new Monster(name, hp, dameSet, "Monster", car));
                            break;
                        default:
                            System.out.println("Không có chức năng này!");
                            break;
                    }
                    break;
                case 2:
                    cm.display();
                    System.out.println("Nhập tên nhân vật của bạn: ");
                    String nameOut = sc.next();
                    double dame = cm.fight(nameOut);
                    for (Character x : cm.getList()) {
                        if (x.getCharacterName().equals(nameOut)) {
                            if (x.getType().equals("Warrior")) {
                                System.out.println("Bạn muốn làm gì?");
                                System.out.println("1. Tấn công | 2. Phòng thủ | 3. Tạo thêm nhân vật");
                                int choice1 = sc.nextInt();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Bạn muốn tấn công quái vật nào?");
                                        for (Character k : cm.getList()) {
                                            if (k.getType().equals("Monster")) {
                                                k.display();
                                            }
                                        }
                                        String nameAttack = sc.next();
                                        for (Character z : cm.getList()) {
                                            if (z.getType().equals("Monster")) {
                                                if (z.getCharacterName().equals(nameAttack)) {
                                                    isDead = cm.status(nameOut);
                                                    if (isDead) {
                                                        System.out.println(nameOut + " đã chết!");
                                                        break;
                                                    } else {
                                                        System.out.println(nameAttack + " bị trừ " + dame + " máu.");
                                                        double dameCounter = cm.attacked(nameAttack, dame);
                                                        cm.attacked(nameOut, dameCounter);
                                                    }
                                                    isDead = cm.status(nameAttack);
                                                    if (isDead) {
                                                        System.out.println(nameAttack + " đã chết!");
                                                    }
                                                }
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
                            if (x.getType().equals("Mage")) {
                                System.out.println("Bạn muốn làm gì?");
                                System.out.println("1. Tấn công | 2. Hồi máu | 3. Tạo thêm nhân vật");
                                int choice1 = sc.nextInt();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Bạn muốn tấn công quái vật nào?");
                                        for (Character k : cm.getList()) {
                                            if (k.getType().equals("Monster")) {
                                                k.display();
                                            }
                                        }
                                        String nameAttack = sc.next();
                                        for (Character z : cm.getList()) {
                                            if (z.getType().equals("Monster")) {
                                                if (z.getCharacterName().equals(nameAttack)) {
                                                    isDead = cm.status(nameOut);
                                                    if (isDead) {
                                                        System.out.println(nameOut + " đã chết!");
                                                        break;
                                                    } else {
                                                        System.out.println(nameAttack + " bị trừ " + dame + " máu.");
                                                        double dameCounter = cm.attacked(nameAttack, dame);
                                                        cm.attacked(nameOut, dameCounter);
                                                    }
                                                    isDead = cm.status(nameAttack);
                                                    if (isDead) {
                                                        System.out.println(nameAttack + " đã chết!");
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        cm.recovery(nameOut);
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("Không có chức năng này!");
                                        break;
                                }
                            }
                            if (x.getType().equals("Monster")) {
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
                                            for (Character k : cm.getList()) {
                                                if (k.getType().equals("Warrior")) {
                                                    k.display();
                                                }
                                            }
                                            String nameAttack = sc.next();
                                            for (Character z : cm.getList()) {
                                                if (z.getType().equals("Warrior")) {
                                                    if (z.getCharacterName().equals(nameAttack)) {
                                                        isDead = cm.status(nameOut);
                                                        if (isDead) {
                                                            System.out.println(nameOut + " đã chết!");
                                                            break;
                                                        } else {
                                                            System.out.println(nameAttack + " bị trừ " + dame + " máu.");
                                                            cm.attacked(nameAttack, dame);
                                                        }
                                                        isDead = cm.status(nameAttack);
                                                        if (isDead) {
                                                            System.out.println(nameAttack + " đã chết!");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (choice2 == 2) {
                                            System.out.println("Bạn muốn tấn công ai?");
                                            for (Character k : cm.getList()) {
                                                if (k.getType().equals("Mage")) {
                                                    k.display();
                                                }
                                            }
                                            String nameAttack = sc.next();
                                            for (Character i : cm.getList()) {
                                                if (i.getType().equals("Mage")) {
                                                    if (i.getCharacterName().equals(nameAttack)) {
                                                        isDead = cm.status(nameOut);
                                                        if (isDead) {
                                                            System.out.println(nameOut + " đã chết!");
                                                            break;
                                                        } else {
                                                            System.out.println(nameAttack + " bị trừ " + dame + " máu.");
                                                            cm.attacked(nameAttack, dame);
                                                        }
                                                        isDead = cm.status(nameAttack);
                                                        if (isDead) {
                                                            System.out.println(nameAttack + " đã chết!");
                                                        }
                                                    }
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
        }while (choice != 3);
    }
}
