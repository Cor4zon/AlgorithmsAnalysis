public class VingradOptimized {
    public static int[][] vinogradMultiplication(int[][] firstMatrix, int[][] secondMatrix){
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

        int m1Mod2 = m1 % 2;
        int n2Mod2 = n2 % 2;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < (m1 - m1Mod2); j += 2) {
                mulH[i] += firstMatrix[i][j] * firstMatrix[i][j+1];
            }
        }

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < (n2 - n2Mod2); j += 2) {
                mulV[i] += secondMatrix[j][i] * secondMatrix[j+1][i];
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                int buff = -(mulH[i] + mulV[j]);
                for (int k = 0; k < (m1 - m1Mod2); k+= 2) {
                    buff += (firstMatrix[i][k+1] + secondMatrix[k][j]) * (firstMatrix[i][k] + secondMatrix[k+1][j]);
                }
                res[i][j] = buff;
            }
        }

        if (m1Mod2 == 1) {
            int m1Min_1 = m1 - 1;
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    res[i][j] += firstMatrix[i][m1Min_1] * secondMatrix[m1Min_1][j];
                }
            }
        }

        return  res;
    }
}
