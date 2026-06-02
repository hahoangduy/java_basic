package Baitap45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.spi.AbstractResourceBundleProvider;

public class BankManager {
    private HashMap<String, Customer> customerList;
    private ArrayList<Transfer> transferList;
    public BankManager() {
        customerList = new HashMap<>();
        transferList = new ArrayList<>();
    }
    public void addCustomer(Customer c) {
        customerList.put(c.getName(), c);
    }

    public ArrayList<Transfer> getTransferList() {
        return transferList;
    }

    public HashMap<String, Customer> getCustomerList() {
        return customerList;
    }

    public Account searchAccount(String accNum) {
        for (Customer c : customerList.values()) {
            if (c.getBankAccountList().containsKey(accNum)) {
                return c.getBankAccountList().get(accNum);
            }
        }
        return null;
    }

    public Customer searchCustomer(String cusName) {
        for (Customer c : customerList.values()) {
            if (c.getName().equals(cusName)) {
                return c;
            }
        }
        return null;
    }
    public void transfer(String accFrom, String accTo, int amount) {
        Account accFrom1 = searchAccount(accFrom);
        Account accTo1 = searchAccount(accTo);
        if (accFrom1 == null) {
            System.out.println("Thất bại: Không tìm thấy tài khoản này!");
            transferList.add(new Transfer("Chuyển khoản", accFrom, accTo, amount, 0, "Thất bại (Sai TK chuyển)"));
        }
        if (accTo1 == null) {
            System.out.println("Thất bại: Tài khoản nhận không tồn tại!");
            transferList.add(new Transfer("Chuyển khoản", accFrom, accTo, amount, 0, "Thất bại (Sai TK nhận)"));
        }
        if (accFrom1.getAccountType().equals("Savings account")) {
            System.out.println("Thất bại: Tính năng bị cấm!");
            transferList.add(new Transfer("Chuyển khoản", accFrom, accTo, amount, 0, "Thất bại (Tính năng bị cấm)"));
            accFrom1.addTransfer(new Transfer("Chuyển khoản", accFrom, accTo, amount, 0, "Thất bại (Tính năng bị cấm)"));
            return;
        }
        int fee = accFrom1.tracsactionOut(amount);
        if (fee != 0) {
            System.out.println("Chuyển khoản thành công!");
            System.out.println("Phí giao dịch: " + fee + " |Số dư hiện tại: " + accFrom1.getBalance());
            accTo1.transactionIn(amount);
            transferList.add(new Transfer("Chuyển khoản",accFrom, accTo, amount, fee, "Thành công"));
            accFrom1.addTransfer(new Transfer("Chuyển khoản",accFrom, accTo, amount, fee, "Thành công"));
            accTo1.addTransfer(new Transfer("Nhận tiền",accFrom, accTo, amount, fee, "Thành công"));
        }
        else {
            System.out.println("Thất bại: Số dư không đủ!");
            transferList.add(new Transfer("Chuyển khoản", accFrom, accTo, amount, 0, "Thất bại (Số dư không đủ)"));
            accFrom1.addTransfer(new Transfer("Chuyển khoản", accFrom, accTo, amount, 0, "Thất bại (Số dư không đủ)"));
        }
    }

    public void withdraw(String accNum, int amount) {
        Account acc = searchAccount(accNum);
        if (acc == null) {
            System.out.println("Thất bại: Không tìm thấy tài khoản này!");
            transferList.add(new Transfer("Rút tiền", accNum, "Null", amount, 0, "Thất bại (Sai STK)"));
            return;
        }
        boolean success = acc.withdrawMoney(amount);
        if (!success) {
            System.out.println("Thất bại: Số dư không đủ!");
            transferList.add(new Transfer("Rút tiền", accNum, "Null", amount, 0, "Thất bại (Số dư không đủ)"));
            acc.addTransfer(new Transfer("Rút tiền", accNum, "Null", amount, 0, "Thất bại (Số dư không đủ)"));
        } else {
            System.out.println("Rút tiền thành công!");
            System.out.println("Số dư còn lại: " + acc.getBalance());
            transferList.add(new Transfer("Rút tiền", accNum, "Null", amount, 0, "Thành công"));
            acc.addTransfer(new Transfer("Rút tiền", accNum, "Null", amount, 0, "Thành công"));
        }
    }
    public void calculateInterest(String accNum, int months) {
        Account acc = searchAccount(accNum);
        if (acc == null) {
            System.out.println("X Thất bại: Không tìm thấy tài khoản này!");
        }
        if (acc.getAccountType().equals("Savings account")) {
            if (months <= 0) {
                System.out.println("Thất bại: Số tháng tiết kiệm phải lớn hơn 0!");
            }
            SavingsAccount savingsAcc = (SavingsAccount) acc;
            double interestEarned = savingsAcc.applyInterest(months);
            System.out.println("Cộng dồn tiền lãi thành công!");
            System.out.println("Lãi xuất ngân hàng: " + savingsAcc.getInterestRate() * 100 + "%");
            System.out.println("Tổng tiền lãi nhận được: " + interestEarned + " VNĐ");
            System.out.println("Số dư mới sau khi cộng lãi: " + savingsAcc.getBalance() + " VNĐ");
        }
    }

    public void displayCustomer() {
        for (Customer customer : customerList.values()) {
            customer.display();
        }
    }
}
