package Baitap33;

public class PlatinumPlan extends InsurancePlan{
    public PlatinumPlan(String planId, String policyHolder, int age, String userId, double baseRate) {
        super(planId, policyHolder, age, userId, baseRate);
    }

    @Override
    public double calculateMonthlyPremium() {
        return getBaseRate() * 3.0;
    }

    @Override
    public double calculateClaim(double billAmount, int serviceType) {
        System.out.println("Khách " + getPolicyHolder() + " (" + ("Gói BH " + getPlanId()) + ")" + " khám hóa đơn: " + billAmount);
        double newBill = 0;
        if (billAmount <= 500000) {
            System.out.println("Vì hóa đơn nhỏ hơn hoặc bằng 500.000 VNĐ nên bảo hiểm sẽ chi trả 0 VNĐ");
        }
        else {
            System.out.println("Bạn phải thanh toán 500.000VNĐ đầu tiên mỗi hóa đơn");
            newBill = billAmount - 500000;
            System.out.println("Số tiền BH sẽ trả là: " + billAmount + " - 500000.0 = " + newBill);
        }
        return newBill;
    }

    @Override
    public void displayInfo() {
        System.out.println("UserId: " + getUserId() + " | " + "Name: " + getPolicyHolder() + " | " + "Age: " + getAge() + " | " + "PlanId: " + getPlanId() + " | " + "Base Rate: " + getBaseRate());
    }
}
