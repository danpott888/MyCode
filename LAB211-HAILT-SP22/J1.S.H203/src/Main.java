
import java.util.Scanner;

public class Main {

    public static String printReverse(String string) {
        String str = "";
        String[] words = string.trim().split("\\s+");
        
        //reverse words
        if (words.length == 1) {
            return string.substring(0, 1).toUpperCase() + string.substring(1, string.length());
        }
        for (int i = words.length - 1; i >= 0; i--) {
            str += (words[i] + " ");
        }

        String[] words1 = str.trim().split("\\s+");

        //preserve punctuation
        for (int i = 0; i < words1.length; i++) {
            if (words[i].endsWith(".") || words[i].endsWith("?")
                    || words[i].endsWith("!") || words[i].endsWith(";") || words[i].endsWith(",")) {
                if (words1[i].endsWith(".") || words1[i].endsWith("?")
                        || words1[i].endsWith("!") || words1[i].endsWith(";") || words1[i].endsWith(",")) {
                    words1[i] = words1[i].substring(0, words1[i].length() - 1) + words[i].charAt(words[i].length() - 1);
                } else {
                    words1[i] = words1[i] + words[i].charAt(words[i].length() - 1);
                }
            } else {
                if (words1[i].endsWith(".") || words1[i].endsWith("?")
                        || words1[i].endsWith("!") || words1[i].endsWith(";") || words1[i].endsWith(",")) {
                    words1[i] = words1[i].substring(0, words1[i].length() - 1);
                }
            }
        }

        //uppercase
        str = "";
        for (int i = 0; i < words1.length; i++) {
            if (i == 0) {
                words1[i] = words1[i].substring(0, 1).toUpperCase() + words1[i].substring(1, words1[i].length());
            }
            if (words1[i].endsWith(".") || words1[i].endsWith("?")
                    || words1[i].endsWith("!")) {
                words1[i + 1] = words1[i + 1].substring(0, 1).toUpperCase() + words1[i + 1].substring(1, words1[i + 1].length());
            }
            str += (words1[i] + " ");
        }

        return str.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Input the string: ");
        do {
            str = sc.nextLine().trim();
            if (str.equals("")) {
                System.out.print("Please re-input a non-empty string: ");
            }

        } while (str.equals(""));
        System.out.println("The reverse of the string is : " + printReverse(str));

    }
}
