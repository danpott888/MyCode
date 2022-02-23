
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input the string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();
        if (string.length() == 0) {
            return;
        }
        String str = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            str += string.charAt(i);
        }
        System.out.println("The reverse of string is: " + str);

    }
}
