package Baitap48;

import java.util.HashMap;

public class ParkingManager {
    private ParkingZone zone;
    private HashMap<String, MonthlyPass> monthlyPassList = new HashMap<>();
    private HashMap<String, Vehicle> parkingList = new HashMap<>();
    private double totalRevenue = 0;
    private int totalServingCount = 0;
    private HashMap<String, Integer> servingCount = new HashMap<>();

    public ParkingManager(int cap2W, int cap4W) {
        this.zone = new ParkingZone(cap2W, cap4W);
        servingCount.put("Xe đạp", 0);
        servingCount.put("Xe máy", 0);
        servingCount.put("Ô tô", 0);
    }
    public void addRegisterMonthlyPass(MonthlyPass pass) {
        monthlyPassList.put(pass.getId(), pass);
    }

    public MonthlyPass getMonthlyPass(String id) {
        return monthlyPassList.get(id);
    }

    public boolean checkIn(Vehicle vehicle, ParkingPass pass) {
        if (!zone.hasSpace(vehicle.getType())) {
            System.out.println("Khu vực tương ứng đã hết chỗ đỗ!");
            return false;
        }
        if (pass.isMonthly()) {
            MonthlyPass mPass = monthlyPassList.get(pass.getId());
            if (mPass == null) {
                System.out.println("Thẻ không tồn tại!");
                return false;
            }
            if (!mPass.getRegisteredLicensePlate().equals(vehicle.getLicensePlate())) {
                System.out.println("Phát hiện thẻ xe không phải chính chủ!");
                System.out.println("Biển số xin đậu: " + vehicle.getLicensePlate() + " |Biển số đăng ký: " + mPass.getRegisteredLicensePlate());
                return false;
            }
        }
        zone.parkVehicle(vehicle.getType());
        parkingList.put(pass.getId(), vehicle);
        System.out.println("Biển số xe (" + vehicle.getLicensePlate() + ") đã vào bãi đậu.");
        return true;
    }

}
