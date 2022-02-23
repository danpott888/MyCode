
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int checkInt() {
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine().trim());
                if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value!!!");
            }
        }
        return n;
    }

    static boolean yesNo() {
        char c = sc.nextLine().toLowerCase().charAt(0);
        while (c != 'n' && c != 'y') {
            System.out.println("Invalid value!!!");
            c = sc.nextLine().toLowerCase().charAt(0);
        }

        return c == 'y';
    }

    public static void main(String[] args) {

        System.out.print("Enter Client Name: ");
        String name = sc.nextLine().trim();
        Client c = new Client(name);
        boolean check = true;

        FilteredAccount fa = new FilteredAccount(c);

        while (check == true) {
            System.out.print("Enter value: ");
            int value = checkInt();
            System.out.print("Enter approved status (Y/N): ");
            boolean approved = yesNo();
            Transaction t = new Transaction(approved, value);
            fa.add(t);
            System.out.print("Do you want to continue input (Y/N)? ");
            check = yesNo();
        }

        System.out.println("======================================");
        System.out.println(fa.getC());
        for (Transaction t : fa.getList()) {
            System.out.println("Transaction: " + t.getValue() + ", Approved: " + fa.process(t));
        }

        System.out.println("======================================");
        System.out.printf("Percentage of Approved Transaction (Value less or equals 0): %.2f%%\n", fa.percentFiltered());
    }
}
