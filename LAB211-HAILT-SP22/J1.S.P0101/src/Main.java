
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int checkInt(int min, int max) {
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value!!!");
            }
        }
        return n;
    }

    static void menu() {
        System.out.println("==============\n"
                + "1. Add employees\n"
                + "2. Update employees\n"
                + "3. Remove employees\n"
                + "4. Search employees\n"
                + "5. Sort employees by salary\n"
                + "6. Exit");
    }

    static Manager manager = new Manager();

    public static void main(String[] args) {
        int choice = 0;
        manager.userAdd();
        do {
            menu();
            System.out.print("Your choice <1 -> 6>: ");
            choice = checkInt(1, 6);
            switch (choice) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.update();
                    break;
                case 3:
                    manager.remove();
                    break;
                case 4:
                    manager.searchName();
                    break;
                case 5:
                    manager.sortBySalary();
                    break;
                case 6:
                    return;

            }
        } while (choice > 0 && choice < 7);

    }

}
