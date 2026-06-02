package Baitap45;


import java.util.ArrayList;

public abstract class Account {
    private String accountNumber;
    private int balance;
    private ArrayList<Transfer> transfers;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transfers = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addTransfer(Transfer t) {
        transfers.add(t);
    }

    public abstract int transactionIn(int transactionAmount);
    public abstract int tracsactionOut(int transactionAmount);
    public abstract boolean withdrawMoney(int transactionAmount);
    public abstract String getAccountType();
    public abstract void display();

    public void displayTransfer() {
        for (Transfer t : transfers) {
            t.display();
        }
    }
}
