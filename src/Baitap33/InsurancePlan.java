package Baitap33;

public abstract class InsurancePlan {
    private String planId;
    private String policyHolder;
    private int age;
    private double baseRate;
    private String userId;

    public InsurancePlan(String planId, String policyHolder, int age, String userId, double baseRate) {
        this.planId = planId;
        this.policyHolder = policyHolder;
        this.age = age;
        this.userId = userId;
        this.baseRate = baseRate;
    }

    public String getPlanId() {
        return planId;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public int getAge() {
        return age;
    }
    public String getUserId() {
        return userId;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public abstract double calculateMonthlyPremium();
    public abstract double calculateClaim(double billAmount, int serviceType);
    public abstract void displayInfo();
}
