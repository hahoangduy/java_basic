package Baitap41;

public abstract class GoTech {
    private String licensePlate;
    private String driverName;
    private double baseRate;
    private int kilometers;

    public GoTech(String licensePlate, String driverName, double baseRate, int kilometers) {
        this.licensePlate = licensePlate;
        this.driverName = driverName;
        this.baseRate = baseRate;
        this.kilometers = kilometers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public abstract double ride();
    public abstract double expressDelivery(int kg);
    public abstract void display();
}
