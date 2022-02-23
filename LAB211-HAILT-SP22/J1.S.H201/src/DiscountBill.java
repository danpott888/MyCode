
public class DiscountBill extends GroceryBill {

    private boolean preffered;
    private int discountCount;
    private double discountAmount;

    public DiscountBill(Employee clerk, boolean preffered) {
        super(clerk);
        this.preffered = preffered;
        discountCount = 0;
        discountAmount = 0.0;
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (preffered == true && i.getDiscount() > 0.0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountPercent() {
        return discountAmount * 100.0 / super.getTotal();
    }

    @Override
    public double getTotal() {
        return super.getTotal() - discountAmount;
    }

}
