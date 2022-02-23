
import java.util.Scanner;


public class Main {
    
    static int secondHalfLetters(String string){
        int count = 0;
        char[] letter = string.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            if (!Character.isLetter(letter[i])) {
                return -1;
            }
            if (letter[i] >= 'n' && letter[i] <= 'z') {
                count++;
            }
            
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toLowerCase().trim();
        while (secondHalfLetters(string) == -1) {
            System.out.print("All characters must be letters!!! Re-enter: ");
            string = sc.nextLine().toLowerCase().trim();
        }
        System.out.println("The number letters of second half letters: " + secondHalfLetters(string));
    }
    
}
