package Baitap48;

public class Car extends Vehicle{
    public Car(String licensePlate) {
        super(licensePlate, "Ô tô");
    }

    @Override
    public void display() {
        System.out.println("Type: " + getType() + " |License plate: " + getLicensePlate());
    }
}
