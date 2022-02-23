
import java.util.Scanner;

public class Main {

    static int checkInt(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine().trim());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value!!! Please re-enter a integer!!!");
            }
        }
        return input;
    }

    static int[] input() {
        System.out.print("Enter size of array: ");
        int size = checkInt(1, Integer.MAX_VALUE);
        while (size%2!=0) {            
            System.out.println("Size must be even");
            size = checkInt(1, Integer.MAX_VALUE);
        }
        int []elementData = new int[size];
        for (int i = 0; i < elementData.length; i++) {
            System.out.printf("Arr[%d] = ", i);
            if (i % 2 != 0) {
                elementData[i] = checkInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else {
                elementData[i] = checkInt(0, Integer.MAX_VALUE);
            }
            System.out.println("");

        }
        return elementData;
    }

    public static void main(String[] args) {
        int[] elementData = input();
        ArrayIntList list = new ArrayIntList(elementData, elementData.length);
        ArrayIntList list2 = list.fromCount();
        System.out.println(list2.toString());

    }

}
