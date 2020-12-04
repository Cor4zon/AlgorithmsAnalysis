public class ClassicalMultiplication {
    public static int[][] multiplicateMatrix(int[][] firstMatrix, int[][] secondMatrix) throws Exception {
        int n1 = firstMatrix.length;
        int n2 = secondMatrix.length;

        if (n1 * n2 == 0) return null;

        int m1 = firstMatrix[0].length;
        int m2 = secondMatrix[0].length;

        if (m1 != n2) return null;

        int[][] res = new int[n1][];
        for (int i = 0; i < n1; i++)
            res[i] =  new int[m2];

        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m2; j++)
                for (int k = 0; k < m1; k++)
                    res[i][j] += firstMatrix[i][k] * secondMatrix[k][j];

        return res;

    }

}

