package Baitap41;

public class Car extends GoTech{
    private String caoDiem;

    public Car(String licensePlate, String driverName, double baseRate, int kilometers, String caoDiem) {
        super(licensePlate, driverName, baseRate, kilometers);
        this.caoDiem = caoDiem;
    }

    @Override
    public double ride() {
        double price = getBaseRate() + (getKilometers() * 12000);
        if (caoDiem.equals("Giờ cao điểm")) {
            double a = price * 0.2;
            price += a;
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
        System.out.println("Type: Car |Driver name: " + getDriverName());
    }
}
