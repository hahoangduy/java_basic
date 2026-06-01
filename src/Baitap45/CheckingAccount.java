package Baitap45;

public class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public int transactionIn(Account accFrom, int transactionAmount) {
        int total = getBalance() + transactionAmount;
        setBalance(total);
        return getBalance();
    }

    @Override
    public int tracsactionOut(Account accTo, int transactionAmount) {
        int SystemMaintenanceFee = 10000;
        if (getBalance() >= (transactionAmount + SystemMaintenanceFee)) {
            int total = getBalance() - (transactionAmount + SystemMaintenanceFee);
            setBalance(total);
            return SystemMaintenanceFee;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean withdrawMoney(int transactionAmount) {
        if (getBalance() >= transactionAmount) {
            int total = getBalance() - transactionAmount;
            setBalance(total);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getAccountType() {
        return "Checking account";
    }

    @Override
    public void display() {
        System.out.println("Account number: " + getAccountNumber() + " |Type: " + getAccountType() + " |Balance: " + getBalance());
    }
}
