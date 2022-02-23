
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Item> list = new ArrayList<>();

    static int checkChoice() {
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
                if (choice < 1 || choice > 2) {
                    throw new NumberFormatException();
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid value!!!");
            }
        }
        return choice;
    }

    static boolean checkChar(String msg, char ch1, char ch2) {
        char c = sc.nextLine().toLowerCase().trim().charAt(0);
        while (c != ch1 && c != ch2) {
            System.out.print(msg);
            c = sc.nextLine().toLowerCase().trim().charAt(0);
        }
        return c == ch1;
    }

    static Item checkItem(String name) {
        for (Item item : list) {
            if (name.equalsIgnoreCase(item.getName())) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        list.add(new Item("Candy Bar", 1.35, 0.25));
        list.add(new Item("Hamburger", 1.0, 0.0));
        list.add(new Item("Coke", 0.5, 0.0));
        list.add(new Item("Pizza", 15.0, 1.5));
        list.add(new Item("Noodles", 2.0, 0.15));

        Employee employee = new Employee();
        int choice;
        do {
            System.out.println("======================\n"
                    + "1. Print Bill\n"
                    + "2. Exit");
            System.out.print("Your choice <1 -> 2>: ");
            choice = checkChoice();

            switch (choice) {
                case 1:
                    System.out.println("Enter name of customer: ");
                    employee.setName(sc.nextLine().trim());
                    System.out.printf("Are %s preffered? (T/F): ", employee.getName());
                    boolean pr = checkChar("Must enter T/F: ", 't', 'f');
                    DiscountBill db = new DiscountBill(employee, pr);
                    System.out.printf("Input name of items %s were bought: \n", employee.getName());
                    do {
                        String name = sc.nextLine().trim();
                        if (checkItem(name) == null) {
                            System.out.println("Not found!!!");
                        } else {
                            db.add(checkItem(name));
                            System.out.println("Add successfully!!!");
                        }
                        System.out.print("Continue? (Y/N): ");
                    } while (checkChar("Must enter Y/N: ", 'y', 'n'));

                    db.printRecieipt();
                    System.out.println("--------");
                    System.out.printf("Total: %.2f\n", db.getTotal() + db.getDiscountAmount());
                    System.out.println("The amount of discount items: " + db.getDiscountCount());
                    System.out.printf("Total discount: %.2f\n", db.getDiscountAmount());
                    System.out.printf("Percentage of discount: %.2f%%\n", db.getDiscountPercent());
                    System.out.printf("Total price: %.2f\n", db.getTotal());
                    break;
                case 2:
                    return;

            }
        } while (choice > 0 && choice < 3);

    }

}
