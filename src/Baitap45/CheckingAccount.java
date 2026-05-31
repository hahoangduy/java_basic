package Baitap45;

public class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public int transactionIn(int transactionAmount) {
        int total = getBalance() + transactionAmount;
        setBalance(total);
        return getBalance();
    }

    @Override
    public int tracsactionOut(int transactionAmount) {
        int SystemMaintenanceFee = 10000;
        int total = (getBalance() - transactionAmount) + SystemMaintenanceFee;
        setBalance(total);
        return getBalance();
    }

    @Override
    public void display() {
        System.out.println("Account number: " + getAccountNumber() + " |Balance: " + getBalance());
    }
}
