import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static boolean isMatricesEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length)
            return false;
        if (firstMatrix[0].length != secondMatrix[0].length)
            return false;

        for (int row = 0; row < firstMatrix.length; row++)
            for (int column = 0; column < firstMatrix[row].length; column++) {
                if (firstMatrix[row][column] != secondMatrix[row][column]) return false;
            }
        return true;
    }

    public static void setMatrix(int[][] matrix, int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < rows; row++)
            for (int column = 0; column < columns; column++){
                matrix[row][column] = scanner.nextInt();
            }
    }

    public static void getMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0;column < matrix[0].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkMatricesSizes(int[][] firstMatrix, int[][] secondMatrix) {
        return firstMatrix[0].length == secondMatrix.length;
    }

    public static void fillMatrixRandom(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j< matrix[0].length; j++)
                matrix[i][j] = (int) Math.round((Math.random() * 100));
    }
}
