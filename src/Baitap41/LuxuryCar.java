package Baitap41;

public class LuxuryCar extends GoTech{
    public LuxuryCar(String licensePlate, String driverName, double baseRate, int kilometers) {
        super(licensePlate, driverName, baseRate, kilometers);
    }

    @Override
    public double ride() {
        double price = getBaseRate() + (getKilometers() * 20000) + 50000;
        return price;
    }

    @Override
    public double expressDelivery(int kg) {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Type: Luxury car |Driver name: " + getDriverName());
    }
}
