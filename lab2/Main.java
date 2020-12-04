import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {
//
//        int[][] matrixA = new int[1][1];
//        int[][] matrixB = new int[1][1];
//        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
//
//        Matrix.setMatrix(matrixA, 1, 1);
//        Matrix.getMatrix(matrixA);
//
//        Matrix.setMatrix(matrixB, 1, 1);
//        Matrix.getMatrix(matrixB);
//
////        matrixC = Vinograd.vinogradMultiplication(matrixA, matrixB);
////        matrixC = VingradOptimized.vinogradMultiplication(matrixA, matrixB);
//        matrixC = ClassicalMultiplication.multiplicateMatrix(matrixA, matrixB);
//
//        Matrix.getMatrix(matrixC);
    getBestTime();
    }

    public static void getBestTime() throws Exception {
        int size = 0;
        int[][] matrixA;
        int[][] matrixB;
        long time_beg, time_end, time_res;

        for (int i = 0; i < 10; i++) {
            size += 101;
            matrixA = new int[size][size];
            matrixB = new int[size][size];
            time_res = 0;

            Matrix.fillMatrixRandom(matrixA);
            Matrix.fillMatrixRandom(matrixB);

            for (int j = 0; j < 10; j++) {
                time_beg = System.nanoTime();
                ClassicalMultiplication.multiplicateMatrix(matrixA, matrixB);
                time_end = System.nanoTime();

                time_res += time_end - time_beg;
            }
            System.out.println( time_res / 10);
        }

    }
}
