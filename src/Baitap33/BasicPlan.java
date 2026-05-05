package Baitap33;

public class BasicPlan extends InsurancePlan{
    public BasicPlan(String planId, String policyHolder, int age, String userId, double baseRate) {
        super(planId, policyHolder, age, userId, baseRate);
    }

    @Override
    public double calculateMonthlyPremium() {
        return getBaseRate();
    }

    @Override
    public double calculateClaim(double billAmount, int serviceType) {
        double a = 0;
        double b = 0;
        System.out.println("Khách " + getPolicyHolder() + " ("+ (getAge() + " tuổi, gói BH " + getPlanId()) +", userId: " + getUserId() + ")" + " khám hóa đơn: " + billAmount);
        if (getAge() > 60) {
            a = billAmount * 0.75;
            System.out.println("Tính theo tỉ lệ 75%: " + a);
            if (a > 2000000) {
                System.out.println("Do vượt hạn mức ( 2.000.000 VNĐ) nên bảo hiểm chỉ trả 2.000.000 VNĐ.");
                billAmount -= 2000000;
            }
            else {
                System.out.println("Bảo hiểm sẽ trả: " + a);
                billAmount -= a;
            }
        }
        else {
            b = billAmount * 0.7;
            System.out.println("Tính theo tỉ lệ 70%: " + b);
            if (b > 2000000) {
                System.out.println("Do vượt hạn mức ( 2.000.000 VNĐ) nên bảo hiểm chỉ trả 2.000.000 VNĐ.");
                billAmount -= 2000000;
            }
            else {
                System.out.println("Bảo hiểm sẽ trả: " + b);
                billAmount -= b;
            }
        }
        System.out.println("Số tiền khách hàng còn phải trả là: " + billAmount);
        return billAmount;
    }

    @Override
    public void displayInfo() {
        System.out.println("UserId: " + getUserId() + " | " + "Name: " + getPolicyHolder() + " | " + "Age: " + getAge() + " | " + "PlanId: " + getPlanId() + " | " + "Base Rate: " + getBaseRate());
    }
}
