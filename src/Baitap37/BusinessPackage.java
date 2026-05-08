package Baitap37;

public class BusinessPackage extends Viettel{
    private String company;

    public BusinessPackage(String contractNumber, String name, String address, int totalCapacity, int baseRate, String company) {
        super(contractNumber, name, address, totalCapacity, baseRate);
        this.company = company;
    }

    public BusinessPackage() {
    }

    @Override
    public void calculateCapacity(String service) {
        double discount = getBaseRate() * 0.1;
        if (service.equals("1234")) {
            System.out.println("Công ty của bạn: Honda (*)");
            System.out.println("Vì là đối tác chiến lược của chúng tôi nên tổng hóa đơn sẽ được giảm giá 10%.");
            System.out.println("Số tiền tháng này phải trả là: " + (getBaseRate() - discount) + "VNĐ");
        }
        else if (service.equals("4321")) {
            System.out.println("Công ty của bạn là: Samsung (*)");
            System.out.println("Vì là đối tác chiến lược của chúng tôi nên tổng hóa đơn sẽ được giảm giá 10%.");
            System.out.println("Số tiền tháng này phải trả là: " + (getBaseRate() - discount) + "VNĐ");
        }
        else if (service.equals("12345")){
            System.out.println("Công ty của bạn là: VinGroup");
            System.out.println("Số tiền tháng này phải trả là: " + getBaseRate() + "VNĐ");
        }
    }

    @Override
    public int totalBill() {
        if (company.equals("1234")) {
            setTotalBill(getBaseRate() - 150000);
        }
        else if (company.equals("4321")) {
            setTotalBill(getBaseRate() - 150000);
        }
        else if (company.equals("12345"))
            setTotalBill(getBaseRate());
        return getTotalBill();
    }

    @Override
    public void hasSafeWeb() {
    }

    @Override
    public void display() {
        if (company.equals("1234")) {
            setTotalBill(getBaseRate() - 150000);
            System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Busniness" + " |CompanyId: " + company + "(HONDA)" + " |Bill: " + getTotalBill());
        }
        else if (company.equals("4321")) {
            setTotalBill(getBaseRate() - 150000);
            System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Busniness" + " |CompanyId: " + company + "(SAMSUNG)" + " |Bill: " + getTotalBill());
        }
        else if (company.equals("12345")){
            setTotalBill(getBaseRate());
            System.out.println("Contract Number: " + getContractNumber() + " |Name: " + getName() + " |Package: Busniness" + " |CompanyId: " + company + "(VINGROUP)" + " |Bill: " + getTotalBill());
        }
    }
}
