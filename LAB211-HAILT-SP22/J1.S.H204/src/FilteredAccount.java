
public class FilteredAccount extends Account {

    private int totalApproved = 0;
    private int filtered = 0;

    public FilteredAccount(Client c) {
        super(c);
    }

    @Override
    public boolean process(Transaction t) {
        if (t.isApproved()) {
            ++totalApproved;
            if (t.getValue() > 0) {
                return super.process(t);
            } else {
                ++filtered;
                return super.process(t);
            }
        } else {
            return super.process(t);

        }
    }

    public double percentFiltered() {
        System.out.println("Filtered approved account: " + filtered);
        System.out.println("Total approved: " + totalApproved);
        return filtered * 100.0 / totalApproved;

    }

}
