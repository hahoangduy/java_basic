package Baitap37;


public class FamilyPackage extends Viettel{
    private String hasSafeWeb;

    public FamilyPackage(String contractNumber, String name, String address, int totalCapacity, int baseRate, String hasSafeWeb) {
        super(contractNumber, name, address, totalCapacity, baseRate);
        this.hasSafeWeb = hasSafeWeb;
    }

    public FamilyPackage() {
    }

    @Override
    public void calculateCapacity(String service) {
        if (service.equals("1")) {
            System.out.println("Tổng dung lượng bị trừ 20GB");
            setTotalCapacity(getTotalCapacity() - 20);
            System.out.println("Tổng dung lượng còn lại: " + getTotalCapacity() + "GB");
        }
        if (service.equals("2")) {
            System.out.println("Tổng dung lượng bị trừ 25GB");
            setTotalCapacity(getTotalCapacity() - 25);
            System.out.println("Tổng dung lượng còn lại: " + getTotalCapacity() + "GB");
        }
        if (service.equals("3")) {
            System.out.println("Tổng dung lượng bị trừ 30GB");
            setTotalCapacity(getTotalCapacity() - 30);
            System.out.println("Tổng dung lượng còn lại: " + getTotalCapacity() + "GB");
        }
    }
    @Override
    public int totalBill() {
        if (getTotalCapacity() < 0) {
            if (hasSafeWeb.equals("YES")) {
                setTotalBill(getBaseRate() + (getTotalCapacity() * -3000) + 40000);
            }
            else {
                setTotalBill(getBaseRate() + (getTotalCapacity() * -3000));
            }
        }
        else {
            if (hasSafeWeb.equals("Yes")) {
                setTotalBill(getBaseRate() + 40000);
            }
            else {
                setTotalBill(getBaseRate());
            }
        }
        return getTotalBill();
    }

    @Override
    public void hasSafeWeb() {
        if (hasSafeWeb.equals("YES")) {
            System.out.println("Name: " + getName() + " |Address: " + getAddress() + " |Safe Web: " + hasSafeWeb);
        }
    }

    @Override
    public void display() {
        if (getTotalCapacity() < 0) {
            if (hasSafeWeb.equals("YES")) {
                setTotalBill(getBaseRate() + (getTotalCapacity() * -3000) + 40000);
                System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Family" + " |Total Capacity: " + getTotalCapacity() + "GB" + " |Safe Web: " + hasSafeWeb + " |Bill: " + getTotalBill());
            }
            else {
                setTotalBill(getBaseRate() + (getTotalCapacity() * -3000));
                System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Family" + " |Total Capacity: " + getTotalCapacity() + "GB" + " |Safe Web: " + hasSafeWeb + " |Bill: " + getTotalBill());
            }
        }
        else {
            if (hasSafeWeb.equals("Yes")) {
                setTotalBill(getBaseRate() + 40000);
                System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Family" + " |Total Capacity: " + getTotalCapacity() + "GB" + " |Safe Web: " + hasSafeWeb + " |Bill: " + getTotalBill());
            }
            else {
                setTotalBill(getBaseRate());
                System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Family" + " |Total Capacity: " + getTotalCapacity() + "GB" + " |Safe Web: " + hasSafeWeb + " |Bill: " + getTotalBill());
            }
        }
    }
}
