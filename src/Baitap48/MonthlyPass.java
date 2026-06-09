package Baitap48;

public class MonthlyPass extends ParkingPass{
    private String employeeName;
    private String registeredLicensePlate;
    private double balance;

    public MonthlyPass(String id, String employeeName, String registeredLicensePlate, double balance) {
        super(id, true);
        this.employeeName = employeeName;
        this.registeredLicensePlate = registeredLicensePlate;
        this.balance = balance;
    }

    public String getEmployeeName() { return employeeName; }
    public String getRegisteredLicensePlate() { return registeredLicensePlate; }
    public double getBalance() { return balance; }
}
