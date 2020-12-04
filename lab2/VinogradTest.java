import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VinogradTest {

    @Test
    void multiplicateMatrix1() throws Exception {
        int[][] firstMatrix = new int[1][1];
        int[][] secondMatrix = new int[1][1];
        firstMatrix[0][0] = 0;
        secondMatrix[0][0] = 0;

        int[][] expected = new int[1][1];
        expected[0][0] = 0;

        int[][] actual;
        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);

        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();

    }

    @Test
    void testMultiplicateMatrix2() throws Exception {
        int[][] firstMatrix = {{0}};
        int[][] secondMatrix = {{1}};
        int[][] expected = {{0}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix3() throws Exception {
        int[][] firstMatrix = {{1}};
        int[][] secondMatrix = {{1}};
        int[][] expected = {{1}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix4() throws Exception {
        int[][] firstMatrix = {{2}};
        int[][] secondMatrix = {{2}};
        int[][] expected = {{4}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix5() throws Exception {
        int[][] firstMatrix = {
                {1, 1},
                {1, 1}
        };

        int[][] secondMatrix = {{1, 1}, {1, 1}};
        int[][] expected = {{2, 2}, {2, 2}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix6() throws Exception {
        int[][] firstMatrix = {{2, 2}, {2, 2}};
        int[][] secondMatrix = {{2, 2}, {2, 2}};
        int[][] expected = {{8, 8}, {8, 8}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix7() throws Exception {
        int[][] firstMatrix = {{0, 0}, {0, 0}};
        int[][] secondMatrix = {{0, 0}, {0, 0}};
        int[][] expected = {{0, 0}, {0, 0}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix8() throws Exception {
        int[][] firstMatrix = {{0, 0}, {0, 0}};
        int[][] secondMatrix = {{1, 1}, {1, 1}};
        int[][] expected = {{0, 0}, {0, 0}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix9() throws Exception {
        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{1, 1}, {1, 1}};
        int[][] expected = {{3, 3}, {7, 7}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix10() throws Exception {
        int[][] firstMatrix = {{1, 1}, {1, 1}};
        int[][] secondMatrix = {{1, 2}, {3, 4}};
        int[][] expected = {{4, 6}, {4, 6}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix11() throws Exception {
        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{1, 2}, {3, 4}};
        int[][] expected = {{7, 10}, {15, 22}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix12() throws Exception {
        int[][] firstMatrix = {{1}, {1}};
        int[][] secondMatrix = {{1, 1}};
        int[][] expected = {{1, 1}, {1, 1}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix13() throws Exception {
        int[][] firstMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] secondMatrix = {{6, 5, 4}, {3, 2, 1}};
        int[][] expected = {{12, 9, 6}, {30, 23, 16}, {48, 37, 26}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix14() throws Exception {
        int[][] firstMatrix = {{1, 4, 8}, {16, 32, 64}};
        int[][] secondMatrix = {{1, 3}, {9, 27}, {81, 243}};
        int[][] expected = {{685, 2055}, {5488, 16464}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @Test
    void testMultiplicateMatrix15() throws Exception {
        int[][] firstMatrix = {{1, 4, 1}, {5, 9, 2}, {6, 5, 3}, {5, 8, 9}};
        int[][] secondMatrix = {{7, 9, 3, 2}, {3, 8, 4, 6}, {2, 6, 4, 3}};
        int[][] expected = {{21, 47, 23, 29}, {66, 129, 59, 70}, {63, 112, 50, 51}, {77, 163, 83, 85}};
        int[][] actual;

        actual = Vinograd.vinogradMultiplication(firstMatrix, secondMatrix);
        if (Matrix.isMatricesEqual(expected, actual)) Assert.assertTrue(true);
        else Assert.fail();
    }
}