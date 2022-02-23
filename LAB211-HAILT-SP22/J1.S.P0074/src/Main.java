
public class Main {

    static InputMatrix input = new InputMatrix();
    static Calculator calculator = new Calculator();

    static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("======= Calculator program =======");
            System.out.println("1. Addtion Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Your choice : ");
            choice = input.checkInt(1, 4);

            switch (choice) {
                case 1:
                    System.out.println("------- Addition -------");
                    System.out.print("Enter row for Matrix 1 : ");
                    int row_1 = input.checkInt(1, Integer.MAX_VALUE);
                    System.out.print("Enter column for Matrix 1 : ");
                    int col_1 = input.checkInt(1, Integer.MAX_VALUE);
                    int[][] addMatrix1 = input.inputMatrix(1, row_1, col_1);
                    System.out.println("Enter row for Matrix 2 : ");
                    int row_2 = input.checkInt(1, Integer.MAX_VALUE);
                    while (row_1 != row_2) {
                        System.out.println("Row of Matrix 2 must equal to Matrix 1!!!");
                        row_2 = input.checkInt(1, Integer.MAX_VALUE);
                    }
                    int col_2 = input.checkInt(1, Integer.MAX_VALUE);
                    while (col_1 != col_2) {
                        System.out.println("Column of Matrix 2 must equal to Matrix 1!!!");
                        col_2 = input.checkInt(1, Integer.MAX_VALUE);
                    }
                    int[][] addMatrix2 = input.inputMatrix(2, row_2, col_2);
                    showMatrix(addMatrix1);
                    System.out.println("+");
                    showMatrix(addMatrix2);
                    System.out.println("=");
                    showMatrix(calculator.additionMatrix(addMatrix1, addMatrix2));
                    break;
                case 2:
                    System.out.println("------- Subtraction -------");
                    System.out.print("Enter row for Matrix 1 : ");
                    int subrow_1 = input.checkInt(1, Integer.MAX_VALUE);
                    System.out.print("Enter column for Matrix 1 : ");
                    int subcol_1 = input.checkInt(1, Integer.MAX_VALUE);
                    int[][] subMatrix1 = input.inputMatrix(1, subrow_1, subcol_1);
                    System.out.println("Enter row for Matrix 2 : ");
                    int subrow_2 = input.checkInt(1, Integer.MAX_VALUE);
                    while (subrow_1 != subrow_2) {
                        System.out.println("Row of Matrix 2 must equal to Matrix 1!!!");
                        subrow_2 = input.checkInt(1, Integer.MAX_VALUE);
                    }
                    int subcol_2 = input.checkInt(1, Integer.MAX_VALUE);
                    while (subcol_1 != subcol_2) {
                        System.out.println("Column of Matrix 2 must equal to Matrix 1!!!");
                        subcol_2 = input.checkInt(1, Integer.MAX_VALUE);
                    }
                    int[][] subMatrix2 = input.inputMatrix(2, subrow_2, subcol_2);
                    showMatrix(subMatrix1);
                    System.out.println("-");
                    showMatrix(subMatrix2);
                    System.out.println("=");
                    showMatrix(calculator.subtractionMatrix(subMatrix1, subMatrix2));
                    break;
                case 3:
                    System.out.println("----- Multiplication -----");
                    System.out.print("Enter row for Matrix 1 : ");
                    int row1 = input.checkInt(1, Integer.MAX_VALUE);
                    System.out.print("Enter column for Matrix 1 : ");
                    int col1 = input.checkInt(1, Integer.MAX_VALUE);
                    int[][] multiMatrix1 = input.inputMatrix(1, row1, col1);
                    System.out.print("Enter row for Matrix 2 : ");
                    int row2 = input.checkInt(1, Integer.MAX_VALUE);
                    while (col1 != row2) {
                        System.out.println("Row of Matrix 2 must be equal to Column of Matrix 1");
                        row2 = input.checkInt(1, Integer.MAX_VALUE);
                    }
                    System.out.print("Enter column for Matrix 2 : ");
                    int col2 = input.checkInt(1, Integer.MAX_VALUE);
                    int[][] multiMatrix2 = input.inputMatrix(2, row2, col2);
                    showMatrix(multiMatrix1);
                    System.out.println("*");
                    showMatrix(multiMatrix2);
                    System.out.println("=");
                    showMatrix(calculator.multiplicationMatrix(multiMatrix1, multiMatrix2));
                    break;
                case 4:
                    return;

            }
        } while (choice > 0 && choice < 5);
    }
}
