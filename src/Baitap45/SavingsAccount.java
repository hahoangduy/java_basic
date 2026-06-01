package Baitap45;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, int balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public int transactionIn(Account accFrom, int transactionAmount) {
        int total = getBalance() + transactionAmount;
        setBalance(total);
        return getBalance();
    }

    @Override
    public int tracsactionOut(Account accTo, int transactionAmount) {
        return -1;
    }

    @Override
    public boolean withdrawMoney(int transactionAmount) {
        if ((getBalance() - transactionAmount) >= 50000) {
            int total = getBalance() - transactionAmount;
            setBalance(total);
            return true;
        }
        else {
            return false;
        }
    }

    public double applyInterest(int months) {
        double interest = getBalance() * (interestRate / 12) * months;
        double total = getBalance() + interest;
        setBalance((int) total);
        return interest;
    }

    @Override
    public String getAccountType() {
        return "Savings account";
    }

    @Override
    public void display() {
        System.out.println("Account number: " + getAccountNumber() + " |Type: " + getAccountType() + " |Balance: " + getBalance());
    }
}
