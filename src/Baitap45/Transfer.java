package Baitap45;

public class Transfer {
    private String transactionType;
    private String accFrom;
    private String accTo;
    private double amount;
    private double fee;
    private String resultStatus;

    public Transfer(String transactionType, String accFrom, String accTo, double amount, double fee, String resultStatus) {
        this.transactionType = transactionType;
        this.accFrom = accFrom;
        this.accTo = accTo;
        this.amount = amount;
        this.fee = fee;
        this.resultStatus = resultStatus;
    }
    public void display() {
        System.out.println("Type: " + transactionType + " |Account from: " + accFrom + " |Account to: " + accTo + " |Amount: " + amount + " |Fee: " + fee + " |Status: " + resultStatus);
    }
}
