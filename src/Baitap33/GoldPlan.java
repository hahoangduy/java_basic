package Baitap33;

public class GoldPlan extends InsurancePlan{
    private int hasPreCondition;

    public GoldPlan(String planId, String policyHolder, int age, String userId, double baseRate, int hasPreCondition) {
        super(planId, policyHolder, age, userId, baseRate);
        this.hasPreCondition = hasPreCondition;
    }

    double newPrice = 0;
    @Override
    public double calculateMonthlyPremium() {
        newPrice = getBaseRate() * 1.5;
        if (hasPreCondition == 1) {
            double hasPreCondition = newPrice * 0.2;
            newPrice += hasPreCondition;
        }
        return newPrice;
    }

    @Override
    public double calculateClaim(double billAmount, int serviceType) {
        System.out.println("Khách " + getPolicyHolder() + " (" + ("Gói BH " + getPlanId()) + ", userId: " + getUserId() + ")" + " khám hóa đơn: " + billAmount);
        double a = 0;
        if (serviceType == 1) {
            a = billAmount * 1;
            if (a > 1000000) {
                System.out.println("Do vượt hạn mức nha khoa (1.000.000 VNĐ) nên bảo hiểm trả 1.000.000 VNĐ.");
                billAmount -= 1000000;
            }
            else {
                System.out.println("Bảo hiểm sẽ trả: " + a);
                billAmount -= a;
            }
        }
        else {
            a = billAmount * 0.9;
            System.out.println("Bảo hiểm sẽ trả: " + a);
            billAmount -= a;
        }
        System.out.println("Số tiền khách hàng còn phải trả là: " + billAmount);
        return billAmount;
    }

    @Override
    public void displayInfo() {
        System.out.println("UserId: " + getUserId() + " | " + "Name: " + getPolicyHolder() + " | " + "Age: " + getAge() + " | " + "PlanId: " + getPlanId() + " | " + "Base Rate: " + getBaseRate());
    }
}
