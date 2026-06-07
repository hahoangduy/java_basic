package Baitap47;

public class Table {
    private String vacantStatus = "Vacant";
    private String servingStatus = "Serving";
    private String tableId;
    private int maxCapacity;
    private String status;

    public Table(String tableId, int maxCapacity) {
        this.tableId = tableId;
        this.maxCapacity = maxCapacity;
        this.status = vacantStatus;
    }

    public String getTableId() {
        return tableId;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public String getStatus() {
        return status;
    }

    public boolean checkIn(int customerCount) {
        if (this.status == vacantStatus && customerCount <= this.maxCapacity) {
            this.status = servingStatus;
            return true;
        }
        return false;
    }
    public void checkOut() {
        this.status = vacantStatus;
    }

}

