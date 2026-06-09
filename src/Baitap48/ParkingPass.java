package Baitap48;

public class ParkingPass {
    private String id;
    private boolean isMonthly;
    public ParkingPass(String id, boolean isMonthly) {
        this.id = id;
        this.isMonthly = isMonthly;
    }

    public String getId() { return id; }
    public boolean isMonthly() { return isMonthly; }

}
