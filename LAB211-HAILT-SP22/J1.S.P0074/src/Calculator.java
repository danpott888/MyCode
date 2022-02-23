
public class Calculator {

    InputMatrix input = new InputMatrix();

    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {

        int[][] matrixResult = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return matrixResult;
    }

    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixResult = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return matrixResult;
    }

    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {

        int[][] matrixResult = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return matrixResult;
    }

}
