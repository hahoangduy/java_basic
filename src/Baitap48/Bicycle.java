package Baitap48;

public class Bicycle extends Vehicle{
    public Bicycle() {
        super("Không có", "Xe đạp");
    }

    @Override
    public void display() {
        System.out.println("Type: " + getType() + " |License plate: " + getLicensePlate());
    }
}
