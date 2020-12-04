public class Vinograd {
    public static int[][] vinogradMultiplication(int[][] firstMatrix, int[][] secondMatrix) throws Exception {
        int n1 = firstMatrix.length;
        int n2 = secondMatrix.length;

        if (n1 * n2 == 0) return null;

        int m1 = firstMatrix[0].length;
        int m2 = secondMatrix[0].length;

        if (m1 != n2) return null;

        int[] mulH = new int[n1];
        int[] mulV = new int[m2];

        int[][] res = new int[n1][];
        for (int i = 0; i < n1; i++)
            res[i] = new int[m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1 / 2; j++) {
                mulH[i] = mulH[i] + firstMatrix[i][j*2] * firstMatrix[i][j*2 + 1];
            }
        }

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2 / 2; j++) {
                mulV[i] = mulV[i] + secondMatrix[j*2][i] * secondMatrix[j*2 + 1][i];
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                res[i][j] = -mulH[i] - mulV[j];
                for (int k = 0; k < m1 / 2; k++) {
                    res[i][j] = res[i][j] + (firstMatrix[i][2 * k + 1] + secondMatrix[2 * k][j]) *
                            (firstMatrix[i][2 * k] + secondMatrix[2*k + 1][j]);
                }
            }
        }

        if (m1 % 2 == 1) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    res[i][j] = res[i][j] + firstMatrix[i][m1 - 1] * secondMatrix[m1-1][j];
                }
            }
        }

        return res;
    }
}
