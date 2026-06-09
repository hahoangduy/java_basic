package Baitap48;

public class ParkingZone {
    private int capacity2Wheels;
    private int capacity4Wheels;

    public ParkingZone(int capacity2Wheels, int capacity4Wheels) {
        this.capacity2Wheels = capacity2Wheels;
        this.capacity4Wheels = capacity4Wheels;
    }

    public int getCapacity2Wheels() { return capacity2Wheels; }
    public int getCapacity4Wheels() { return capacity4Wheels; }

    public boolean hasSpace(String type) {
        if (type.equals("Xe đạp") || type.equals("Xe máy")) {
            return capacity2Wheels > 0;
        } else if (type.equals("Ô tô")) {
            return capacity4Wheels > 0;
        }
        return false;
    }

    public void parkVehicle(String type) {
        if (type.equals("Xe đạp") || type.equals("Xe máy")) {
            capacity2Wheels--;
        } else if (type.equals("Ô tô")) {
            capacity4Wheels--;
        }
    }

    public void freeUpSpace(String type) {
        if (type.equals("Xe đạp") || type.equals("Xe máy")) {
            capacity2Wheels++;
        } else if (type.equals("Ô tô")) {
            capacity4Wheels++;
        }
    }

    public void displayCapacity() {
        System.out.println("Khu 2 bánh còn trống: " + getCapacity2Wheels() + " chỗ");
        System.out.println("Khu 4 bánh còn trống: " + getCapacity4Wheels() + " chỗ");
    }
}
