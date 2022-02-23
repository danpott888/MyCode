
import java.util.Scanner;

public class InputMatrix {

    public int checkInt(int min, int max) {
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

    public int[][] inputMatrix(int num, int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Matrix%d[%d][%d] = ", num, i + 1, j + 1);
                arr[i][j] = checkInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }

        return arr;
    }

}
