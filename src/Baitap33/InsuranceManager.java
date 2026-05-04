package Baitap33;

import java.util.ArrayList;

public class InsuranceManager {
    ArrayList<InsurancePlan> list = new ArrayList<>();
    public void addPlan(InsurancePlan plan) {
        list.add(plan);
        System.out.println("Thêm thành công!");
    }
    public void display() {
        for (InsurancePlan x : list) {
            x.displayInfo();
        }
    }
    public double getTotalMonthlyRevenue() {

        double sum = 0;
        for (InsurancePlan x : list) {
            sum += x.calculateMonthlyPremium();
        }
        System.out.println("Tổng doanh thu: " + sum);
        return sum;
    }

    public void processClaimReport(String planId,String userId, double billAmount, int serviceType) {
        for (InsurancePlan x : list) {
            if (x.getPlanId().equals(planId) && x.getUserId().equals(userId)) {
                    x.calculateClaim(billAmount, serviceType);
            }
        }
    }
}
