
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

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

    public static int[] ramdomIntArr(int numArr, int min, int max) {
        int[] ranNum = new int[numArr];
        for (int i = 0; i < numArr; i++) {
            Random rand = new Random();
            ranNum[i] = rand.nextInt((max - min) + 1) + min; //[0...n-1]

        }
        return ranNum;
    }
    
    public static void showArr(int[] arr){
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

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                break;
            }
        }
        showArr(arr);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        int numArr = checkInt(1, Integer.MAX_VALUE);
        System.out.print("Min = ");
        int min = checkInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("Max = ");
        int max = checkInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] arr = ramdomIntArr(numArr, min, max);
        System.out.print("Unsorted array: ");
        showArr(arr);
        System.out.println();
        System.out.print("Sorted array: ");

        bubbleSort(arr);
    }
}
