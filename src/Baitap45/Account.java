package Baitap45;


public abstract class Account {
    private String accountNumber;
    private int balance;

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


    public abstract int transactionIn(Account accFrom, int transactionAmount);
    public abstract int tracsactionOut(Account accTo, int transactionAmount);
    public abstract boolean withdrawMoney(int transactionAmount);
    public abstract String getAccountType();
    public abstract void display();
}
