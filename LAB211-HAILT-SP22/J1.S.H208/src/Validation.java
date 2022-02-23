
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public int checkInt(int min, int max) {
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value !!! Please re-enter an integer!!!");
            }
        }
        return n;
    }

    public int checkLength(int input) {
        int length = 0;
        while (input != 0) {
            input /= 10;
            length++;
        }
        return length;
    }

}
