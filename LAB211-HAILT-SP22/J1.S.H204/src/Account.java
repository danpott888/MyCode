
import java.util.ArrayList;
import java.util.List;

public class Account {

    private Client c;
    private List<Transaction> list = new ArrayList<>();

    public Account(Client c) {
        this.c = c;
    }

    public boolean process(Transaction t) {
        return t.isApproved();
    }

    public void add(Transaction t) {
        list.add(t);
    }

    public Client getC() {
        return c;
    }

    public List<Transaction> getList() {
        return list;
    }

}
