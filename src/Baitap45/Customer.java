package Baitap45;

import java.util.HashMap;

public class Customer {
    private String CIF;
    private String name;
    private int phoneNumber;
    private HashMap<String, Account> bankAccountList;

    public Customer(String CIF, String name, int phoneNumber) {
        this.CIF = CIF;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bankAccountList = new HashMap<>();
    }

    public String getCIF() {
        return CIF;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Account> getBankAccountList() {
        return bankAccountList;
    }

    public void addAccount(Account account) {
        bankAccountList.put(account.getAccountNumber(), account);
    }

    public void display() {
        System.out.println("Name: " + getName());
    }
}
