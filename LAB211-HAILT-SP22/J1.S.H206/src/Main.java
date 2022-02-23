
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    static int checkInt(int min, int max){
        int input = 0;
        while (true) {            
            try {
                input = Integer.parseInt(sc.nextLine().trim());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value!!! Re-enter an integer!!!");
            }
        }
        return input;
    }
    
    static void showLine(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            
        }
        System.out.println("");
    }
    
    static void printSquare(int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        int tail = min;
        for (int i = 0; i < list.size(); i++) {
            showLine(list);
            list.remove(0);
            list.add(tail);
            tail++;
        }
        
    }
    
    public static void main(String[] args) {
        System.out.print("Enter min: ");
        int min = checkInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("Enter max: ");
        int max = checkInt(min, Integer.MAX_VALUE);
        printSquare(min, max);
    }
    
}
