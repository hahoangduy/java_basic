package Baitap41;

public class Motorbike extends GoTech{
    private String weather;
    private int kg;

    public Motorbike(String licensePlate, String driverName, double baseRate, int kilometers, String weather) {
        super(licensePlate, driverName, baseRate, kilometers);
        this.weather = weather;
    }

    @Override
    public double ride() {
        double price = getBaseRate() + (getKilometers() * 5000);
        if (weather.equals("Trời mưa")) {
            price += 10000;
        }
        return price;
    }

    @Override
    public double expressDelivery(int kg) {
        setBaseRate(15000);
        double price = getBaseRate() + (getKilometers() * 8000);
        if (kg > 5) {
            price += 20000;
        }
        return price;
    }

    @Override
    public void display() {
        System.out.println("Type: Motorbike |Driver name: " + getDriverName());
    }
}
