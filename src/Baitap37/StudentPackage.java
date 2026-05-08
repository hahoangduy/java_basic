package Baitap37;

public class StudentPackage extends Viettel{
    public StudentPackage(String contractNumber, String name, String address, int totalCapacity, int baseRate) {
        super(contractNumber, name, address, totalCapacity, baseRate);
    }

    public StudentPackage() {
    }

    @Override
    public void calculateCapacity(String service) {
        if (service.equals("1")) {
            System.out.println("Tổng dung lượng bị trừ 10GB");
            setTotalCapacity(getTotalCapacity() - 10);
            System.out.println("Tổng dung lượng còn lại: " + getTotalCapacity() + "GB");
        }
        if (service.equals("2")) {
            System.out.println("Tổng dung lượng bị trừ 15GB");
            setTotalCapacity(getTotalCapacity() - 15);
            System.out.println("Tổng dung lượng còn lại: " + getTotalCapacity() + "GB");
        }
        if (service.equals("3")) {
            System.out.println("Tổng dung lượng bị trừ 5GB");
            setTotalCapacity(getTotalCapacity() - 5);
            System.out.println("Tổng dung lượng còn lại: " + getTotalCapacity() + "GB");
        }
    }

    @Override
    public int totalBill() {
        if (getTotalCapacity() < 0) {
            setTotalBill(getBaseRate() + (getTotalCapacity() * -5000));
        }
        else {
            setTotalBill(getBaseRate());
        }
        return getTotalBill();
    }

    @Override
    public void hasSafeWeb() {
    }

    @Override
    public void display() {
        if (getTotalCapacity() < 0) {
            setTotalBill(getBaseRate() + (getTotalCapacity() * -5000));
            System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Student" + " |Total Capacity: " + getTotalCapacity() + "GB" + " |Bill: " + getTotalBill());
        }
        else {
            setTotalBill(getBaseRate());
            System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Student" + " |Total Capacity: " + getTotalCapacity() + "GB" + " |Bill: " + getTotalBill());
        }
    }
}
