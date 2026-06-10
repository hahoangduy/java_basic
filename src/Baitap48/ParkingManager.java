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
    private double calculateFee(String type, int hours, boolean isOvernight) {
        double fee = 0;
        if (type.equals("Xe đạp")) {
            fee = 3000;
        } else if (type.equals("Xe máy")) {
            if (hours < 12 && !isOvernight) {
                fee = 5000;
            } else {
                fee = 15000;
            }
        } else if (type.equals("Ô tô")) {
            if (hours <= 2) {
                fee = 20000;
            } else {
                fee = 20000 + (hours - 2) * 15000;
            }
            if (isOvernight) {
                fee += 100000;
            }
        }
        return fee;
    }
    public void checkOut(String passId, int hours, boolean isOvernight) {
        if (!parkingList.containsKey(passId)) {
            System.out.println("Mã thẻ này hiện không giữ xe nào trong bãi!");
            return;
        }
        Vehicle vehicle = parkingList.get(passId);
        String type = vehicle.getType();
        if (monthlyPassList.containsKey(passId)) {
            MonthlyPass mPass = monthlyPassList.get(passId);
            System.out.println("Hẹn gặp lại quý khách " + mPass.getEmployeeName() + "!");
            System.out.println("Phí dịch vụ thẻ tháng: 0 VNĐ.");
        } else {
            double fee = calculateFee(type, hours, isOvernight);
            totalRevenue += fee;
            System.out.println("----- HÓA ĐƠN THANH TOÁN -----");
            System.out.println("Loại xe: " + type + " |Biển số: " + vehicle.getLicensePlate() + " |Thời gian gửi: " + hours + " giờ");
            if (isOvernight) {
                System.out.println("Có gửi qua đêm (phụ thu 100.000 VNĐ)");
            }
            System.out.println("Tổng hóa đơn: " + fee + " VNĐ");
        }
        zone.freeUpSpace(type);
        parkingList.remove(passId);
        totalServingCount++;
        servingCount.put(type, servingCount.get(type) + 1);
    }
    public void displayStatisticalReports() {
        System.out.println("1. Tổng số tiền từ khách vãng lai: " + totalRevenue + " VNĐ");
        System.out.println("2. Tổng số lượt xe đã phục vụ: " + totalServingCount + " lượt");
        System.out.println("3. Chi tiết lượt xe đã phục vụ cho từng loại phương tiện:");
        System.out.println("Xe đạp: " + servingCount.get("Xe đạp") + " lượt");
        System.out.println("Xe máy: " + servingCount.get("Xe máy") + " lượt");
        System.out.println("Ô tô: " + servingCount.get("Ô tô") + " lượt");
    }
}
