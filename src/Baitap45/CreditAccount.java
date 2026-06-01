package Baitap45;

public class CreditAccount extends Account{
    private int creditLimit;

    public CreditAccount(String accountNumber, int balance, int creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public int transactionIn(Account accFrom, int transactionAmount) {
        int total = getBalance() + transactionAmount;
        setBalance(total);
        return getBalance();
    }

    @Override
    public int tracsactionOut(Account accTo, int transactionAmount) {
        int SystemMaintenanceFee = (int) (transactionAmount * 0.04);
        int total = transactionAmount + SystemMaintenanceFee;
        if ((getBalance() - total) >= -creditLimit) {
            int total1 = getBalance() - total;
            setBalance(total1);
            return SystemMaintenanceFee;
        }
        return 0;
    }

    @Override
    public boolean withdrawMoney(int transactionAmount) {
        int SystemMaintenanceFee = (int) (getBalance() * 0.04);
        int total = transactionAmount + SystemMaintenanceFee;
        if ((getBalance() - total) >= -creditLimit) {
            int total1 = getBalance() - total;
            setBalance(total1);
            return true;
        }
        return false;
    }

    @Override
    public String getAccountType() {
        return "Credit account";
    }

    @Override
    public void display() {
        System.out.println("Account number: " + getAccountNumber() + " |Type: " + getAccountType() + " |Balance: " + getBalance());
    }
}
