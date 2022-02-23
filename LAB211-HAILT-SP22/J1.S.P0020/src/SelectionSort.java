
import java.util.Scanner;

public class SelectionSort {

    static Scanner sc = new Scanner(System.in);

    public static int checkInt(int min, int max) {
        int a = 0;
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine().trim());
                if (a < min || a > max) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Please re-input a integer [" + min + ", " + max + "]: ");
            }

        }
        return a;
    }

    public static int[] inputArr(int numArr) {
        int[] arr = new int[numArr];
        for (int i = 0; i < numArr; i++) {
            System.out.printf("Enter arr[%d]: ", i);
            arr[i] = checkInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        return arr;
    }

    public static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[ " + arr[i] + ", ");
            } else if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");

            }
        }
    }
    
    public static void selectionSort(int[] arr) {
        int i = 0, j = 0;
        int min = 0;
        for (i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if (min_index == i) {
                continue;
            }

            int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;

        }
        showArr(arr);

    }
    
    // 0 5 2 4
    // 

    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        int numArr = checkInt(1, Integer.MAX_VALUE);
        int[] arr = inputArr(numArr);
        System.out.print("Unsorted array: ");
        showArr(arr);
        System.out.println();
        System.out.print("Sorted array: ");

        selectionSort(arr);

    }
}
