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
    }

    public String getCIF() {
        return CIF;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public HashMap<String, Account> getBankAccountList() {
        return bankAccountList;
    }

    public void addAccount(Account account) {
        bankAccountList.put(account.getAccountNumber(), account);
    }

    public void display() {
        System.out.println("CIF id: " + getCIF() + " |Name: " + getName());
    }
}
