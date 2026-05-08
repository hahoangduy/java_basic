package Baitap37;

public abstract class Viettel {
    private String contractNumber;
    private String name;
    private String address;
    private int totalCapacity;
    private int baseRate;
    private int totalBill;

    public Viettel(String contractNumber, String name, String address, int totalCapacity, int baseRate) {
        this.contractNumber = contractNumber;
        this.name = name;
        this.address = address;
        this.totalCapacity = totalCapacity;
        this.baseRate = baseRate;
    }

    public Viettel() {
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getBaseRate() {
        return baseRate;
    }
    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public abstract void calculateCapacity(String service);
    public abstract int totalBill();
    public abstract void hasSafeWeb();
    public abstract void display();
}
