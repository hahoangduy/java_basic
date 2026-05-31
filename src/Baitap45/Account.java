package Baitap45;

import java.util.HashMap;

public abstract class Account {
    private String accountNumber;
    private int balance;
    private HashMap<String, Transfer> transactionHistory;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
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
    public void addHistory(Transfer t) {
        transactionHistory.put(t.getTransferID(), t);
    }

    public abstract int transactionIn(int transactionAmount);
    public abstract int tracsactionOut(int transactionAmount);
    public abstract void display();
}
