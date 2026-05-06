package Baitap36;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmyManager am = new ArmyManager();
        System.out.println("HÃY CHUẨN BỊ ĐỘI QUÂN CỦA BẠN!");
        int choice;
        do {
            System.out.println("Bạn muốn?");
            System.out.println("1. Chọn quân lính | 2. Tăng điểm chỉ huy | 3. Xuất quân");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Bạn muốn chọn quân lính nào?");
                    System.out.println("1. Valiant | 2. Archer | 3. Knight");
                    int choice1 = sc.nextInt();

                    switch (choice1) {
                        case 1:
                            System.out.println("Valiant (Dũng sĩ): thiên về tấn công, nếu được trang bị thêm khiên, khả năng phòng thủ sẽ tăng lên 2 lần.");
                            System.out.println("Bạn muốn trang bị khiên cho quân lính của bạn không?");
                            System.out.println("YES | NO");
                            String a = sc.next();
                            am.addArmy(new Valiant("VA01", 20, 30, a, 20));
                            break;
                        case 2:
                            System.out.println("Archer (Cung thủ): thiên về phòng thủ và hỗ trợ tấn công, nếu được trang bị thêm mũi tên lửa, khả năng tấn công sẽ tăng lên 1.5 lần.");
                            System.out.println("Bạn muốn trang bị mũi tên lửa cho quân lính của bạn không?");
                            System.out.println("YES | NO");
                            String b = sc.next();
                            am.addArmy(new Archer("AR01", 30, 50, b, 50));
                            break;
                        case 3:
                            System.out.println("Knight (Hiệp sỹ): dùng để đột phá hoặc tấn công chiến lược, nếu được trang bị thêm ngựa, khả năng tấn công và phòng thủ sẽ tăng lên 3 lần.");
                            System.out.println("Bạn muốn trang bị ngựa cho quân lính của bạn không?");
                            System.out.println("YES | NO");
                            String c = sc.next();
                            am.addArmy(new Knight("KN01", 50, 50, c, 30));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn thêm bao nhiêu điểm cho chỉ huy?");
                    double a = sc.nextDouble();
                    am.setExperience(a);
                    am.addArmy(new ArmyGeneral("AG01", 80, 80, "YES", 80, a));
                    for(Army o : am.getList()) {
                        if (o.getM_Code().contains("VA01")) {
                            am.setExperience(a);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Team A");
                    ArmyManager teamA = new ArmyManager();
                    teamA.addArmy(new ArmyGeneral("AG1", 70, 70, "YES", 30, 3.5));
                    teamA.addArmy(new Valiant("V01", 20, 10, "YES", 15));
                    teamA.addArmy(new Archer("A01", 10, 5, "NO", 14));
                    teamA.addArmy(new Knight("K01", 30, 35, "YES", 20));
                    teamA.display();
                    System.out.println("");
                    System.out.println("Team B");
                    am.display();
                    System.out.println("Bạn chắc chắn muốn tiến quân?");
                    System.out.println("1. YES | 2. NO");
                    int choice2 = sc.nextInt();
                    if (choice2 == 1) {
                        System.out.println("Đang giao tranh...");
                        int kqteamA = 0;
                        int kqteamB = 0;
                        for (Army tvteama :  teamA.getList()) {
                            for (Army tvteamb : am.getList()) {
                                if (tvteama.getM_Code().contains("AG1") && tvteamb.getM_Code().contains("AG01")) {
                                    if (tvteama.getM_Attack() > tvteamb.getM_Attack() && tvteama.getM_Defend() > tvteamb.getM_Defend()) {
                                        System.out.println("AG1 WIN");
                                        kqteamA++;
                                        break;
                                    }
                                    else {
                                        System.out.println("AG01 WIN");
                                        kqteamB++;
                                        break;
                                    }
                                }
                                if (tvteama.getM_Code().contains("V01") && tvteamb.getM_Code().contains("VA01")) {
                                    if (tvteama.getM_Attack() > tvteamb.getM_Attack() && tvteama.getM_Defend() > tvteamb.getM_Defend()) {
                                        System.out.println("V01 WIN");
                                        kqteamA++;
                                        break;
                                    }
                                    else {
                                        System.out.println("VA01 WIN");
                                        kqteamB++;
                                        break;
                                    }
                                }
                                if (tvteama.getM_Code().contains("A01") && tvteamb.getM_Code().contains("AR01")) {
                                    if (tvteama.getM_Attack() > tvteamb.getM_Attack() && tvteama.getM_Defend() > tvteamb.getM_Defend()) {
                                        System.out.println("A01 WIN");
                                        kqteamA++;
                                        break;
                                    }
                                    else {
                                        System.out.println("AR01 WIN");
                                        kqteamB++;
                                        break;
                                    }
                                }
                                if (tvteama.getM_Code().contains("K01") && tvteamb.getM_Code().contains("KN01")) {
                                    if (tvteama.getM_Attack() > tvteamb.getM_Attack() && tvteama.getM_Defend() > tvteamb.getM_Defend()) {
                                        System.out.println("K01 WIN");
                                        kqteamA++;
                                        break;
                                    }
                                    else {
                                        System.out.println("KN01 WIN");
                                        kqteamB++;
                                        break;
                                    }
                                }
                            }
                        }
                        System.out.println("");
                        if (kqteamA > kqteamB) {
                            System.out.println("TEAM A WIN");
                        }
                        else {
                            System.out.println("TEAM B WIN");
                        }
                    }
            }
        } while (choice != 3);
    }
}
