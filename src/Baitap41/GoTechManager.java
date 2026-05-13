package Baitap41;

import java.util.ArrayList;

public class GoTechManager {
    ArrayList<GoTech> list = new ArrayList<>();

    public void addVehicle(GoTech v) {
        list.add(v);
        System.out.println("Thuê xe thành công");
    }

    public void ride() {
        for (GoTech x : list) {
            if (x.getLicensePlate().equals("1234")) {
                System.out.println("Type: Ride |Driver name: " + x.getDriverName() + " |Distance: " + x.getKilometers() + "km" + " |Bill: " +x.ride() + " VNĐ");
            }
        }
    }

    public void expressDelivery(int kg) {
        for (GoTech x : list) {
            if (x.getLicensePlate().equals("12345")) {
                if (x.getDriverName().equals("Nguyễn Văn A")) {
                    System.out.println("Type: Express delivery |Driver name: " + x.getDriverName() + " |Vehicle: Motorbike |Distance: " + x.getKilometers() + "km" + " |Bill: " +x.expressDelivery(kg) + " VNĐ");
                }
                else {
                    System.out.println("Type: Express delivery |Driver name: " + x.getDriverName() + " |Vehicle: Car |Distance: " + x.getKilometers() + "km" + " |Bill: " +x.expressDelivery(kg) + " VNĐ");
                }
            }
        }
    }

    public void display() {
        for (GoTech x : list) {
            x.display();
        }
    }
}
