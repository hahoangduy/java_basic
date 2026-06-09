package Baitap48;

public class Motorbike extends Vehicle{
    public Motorbike(String licensePlate) {
        super(licensePlate, "Xe máy");
    }

    @Override
    public void display() {
        System.out.println("Type: " + getType() + " |License plate: " + getLicensePlate());
    }
}
