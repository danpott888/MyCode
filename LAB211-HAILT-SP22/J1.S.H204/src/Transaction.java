
public class Transaction {

    private boolean Approved;
    private int value;

    public Transaction() {
    }

    public Transaction(boolean Approved, int value) {
        this.Approved = Approved;
        this.value = value;
    }

    public boolean isApproved() {
        return Approved;
    }

    public void setApproved(boolean Approved) {
        this.Approved = Approved;
    }

    public int value() {
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
