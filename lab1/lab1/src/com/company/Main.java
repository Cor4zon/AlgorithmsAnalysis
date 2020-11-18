package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        testLevenstein();
//        testLevensteinMatrix();
//        testDameradLevenstein();
//        testDameradLevensteinRecurion();



//        String myString = generateRandomString(5);
//        System.out.println(myString);

        System.out.println(timeCheckerLevensterin());
    }

    static void testLevenstein() {
        // Levenstein tests
        System.out.println("TESTS FOR LEVENSTEIN DISTANCE");

        // test 1.
        // String 1 is empty
        if (Levenstain.getEditDistance("", "bingo") != 5){
            System.out.println("TEST 1: FAILED");
        }
        else
            System.out.println("TEST 1: PASSED");

        // test 2.
        // String 2 is empty
        if (Levenstain.getEditDistance("bingo", "") != 5){
            System.out.println("TEST 2: FAILED");
        }
        else
            System.out.println("TEST 2: PASSED");

        // test 3.
        // Both strings are empty
        if (Levenstain.getEditDistance("", "") != 0){
            System.out.println("TEST 3: FAILED");
        }
        else
            System.out.println("TEST 3: PASSED");

        // test 4.
        // Delete 1 symbol from the end
        if (Levenstain.getEditDistance("bing", "bingo") != 1){
            System.out.println("TEST 4: FAILED");
            System.out.println(Levenstain.getEditDistance("bing", "bingo"));
        }
        else
            System.out.println("TEST 4: PASSED");

        // test 5.
        // Delete 1 symbol from the begging
        if (Levenstain.getEditDistance("ingo", "bingo") != 1){
            System.out.println("TEST 5: FAILED");
            System.out.println(Levenstain.getEditDistance("ingo", "bingo"));
        }
        else
            System.out.println("TEST 5: PASSED");

        // test 6.
        // Delete 1 symbol from random position
        if (Levenstain.getEditDistance("bino", "bingo") != 1){
            System.out.println("TEST 6: FAILED");
        }
        else
            System.out.println("TEST 6: PASSED");

        // test 7.
        // Delete symbols from the end and from the begging
        if (Levenstain.getEditDistance("bingo", "ing") != 2){
            System.out.println("TEST 7: FAILED");
        }
        else
            System.out.println("TEST 7: PASSED");

        // test 8.
        // Insert symbol in the end
        if (Levenstain.getEditDistance("bing", "bingo") != 1){
            System.out.println("TEST 8: FAILED");
        }
        else
            System.out.println("TEST 8: PASSED");

        // test 9.
        // Insert symbol in the begging
        if (Levenstain.getEditDistance("ingo", "bingo") != 1){
            System.out.println("TEST 9: FAILED");
        }
        else
            System.out.println("TEST 9: PASSED");

        // test 10.
        // Insert symbol in random position
        if (Levenstain.getEditDistance("bngo", "bingo") != 1){
            System.out.println("TEST 10: FAILED");
        }
        else
            System.out.println("TEST 10: PASSED");


        // test 11.
        // Insert 3 symbols
        if (Levenstain.getEditDistance("bi", "bingo") != 3){
            System.out.println("TEST 11: FAILED");
        }
        else
            System.out.println("TEST 11: PASSED");

        // test 12.
        // Change symbol
        if (Levenstain.getEditDistance("binvo", "bingo") != 1){
            System.out.println("TEST 12: FAILED");
        }
        else
            System.out.println("TEST 12: PASSED");

        // test 13.
        // Change symbol in the end
        if (Levenstain.getEditDistance("binga", "bingo") != 1){
            System.out.println("TEST 13: FAILED");
        }
        else
            System.out.println("TEST 13: PASSED");

        // test 14.
        // Change symbol in the begging
        if (Levenstain.getEditDistance("vingo", "bingo") != 1){
            System.out.println("TEST 14: FAILED");
        }
        else
            System.out.println("TEST 14: PASSED");

        // test 15.
        // Change 2 symbols in random positions
        if (Levenstain.getEditDistance("bxxgo", "bingo") != 2){
            System.out.println("TEST 15: FAILED");
        }
        else
            System.out.println("TEST 15: PASSED");

        // test 16.
        // Transposition
        if (Levenstain.getEditDistance("binog", "bingo") != 2){
            System.out.println("TEST 16: FAILED");
        }
        else
            System.out.println("TEST 16: PASSED");

        // test 17.
        // Transposition
        if (Levenstain.getEditDistance("ibnog", "bingo") != 4){
            System.out.println("TEST 17: FAILED");
        }
        else
            System.out.println("TEST 17: PASSED");

        // test 18.
        // Insert and Delete
        if (Levenstain.getEditDistance("vbing", "bingo") != 2){
            System.out.println("TEST 18: FAILED");
        }
        else
            System.out.println("TEST 18: PASSED");

        // test 19.
        // Insert and Delete
        if (Levenstain.getEditDistance("boing", "bingo") != 2){
            System.out.println("TEST 19: FAILED");
        }
        else
            System.out.println("TEST 19: PASSED");

        // test 20.
        // Insert and change
        if (Levenstain.getEditDistance("ving", "bingo") != 2){
            System.out.println("TEST 20: FAILED");
        }
        else
            System.out.println("TEST 20: PASSED");

        // test 21.
        // Delete and change
        if (Levenstain.getEditDistance("bingaa", "bingo") != 2){
            System.out.println("TEST 21: FAILED");
        }
        else
            System.out.println("TEST 21: PASSED");
    }

    static void testLevensteinMatrix() {

        // Levenstein Matrix tests
        System.out.println("TESTS FOR LEVENSTEIN MATRIX DISTANCE");

        // test 1.
        // String 1 is empty
        if (LevenstainMatrix.levenshtein("", "bingo") != 5){
            System.out.println("TEST 1: FAILED");
        }
        else
            System.out.println("TEST 1: PASSED");

        // test 2.
        // String 2 is empty
        if (LevenstainMatrix.levenshtein("bingo", "") != 5){
            System.out.println("TEST 2: FAILED");
        }
        else
            System.out.println("TEST 2: PASSED");

        // test 3.
        // Both strings are empty
        if (LevenstainMatrix.levenshtein("", "") != 0){
            System.out.println("TEST 3: FAILED");
        }
        else
            System.out.println("TEST 3: PASSED");

        // test 4.
        // Delete 1 symbol from the end
        if (LevenstainMatrix.levenshtein("bing", "bingo") != 1){
            System.out.println("TEST 4: FAILED");
        }
        else
            System.out.println("TEST 4: PASSED");

        // test 5.
        // Delete 1 symbol from the begging
        if (LevenstainMatrix.levenshtein("ingo", "bingo") != 1){
            System.out.println("TEST 5: FAILED");
        }
        else
            System.out.println("TEST 5: PASSED");

        // test 6.
        // Delete 1 symbol from random position
        if (LevenstainMatrix.levenshtein("bino", "bingo") != 1){
            System.out.println("TEST 6: FAILED");
        }
        else
            System.out.println("TEST 6: PASSED");

        // test 7.
        // Delete symbols from the end and from the begging
        if (LevenstainMatrix.levenshtein("bingo", "ing") != 2){
            System.out.println("TEST 7: FAILED");
        }
        else
            System.out.println("TEST 7: PASSED");

        // test 8.
        // Insert symbol in the end
        if (LevenstainMatrix.levenshtein("bing", "bingo") != 1){
            System.out.println("TEST 8: FAILED");
        }
        else
            System.out.println("TEST 8: PASSED");

        // test 9.
        // Insert symbol in the begging
        if (LevenstainMatrix.levenshtein("ingo", "bingo") != 1){
            System.out.println("TEST 9: FAILED");
        }
        else
            System.out.println("TEST 9: PASSED");

        // test 10.
        // Insert symbol in random position
        if (LevenstainMatrix.levenshtein("bngo", "bingo") != 1){
            System.out.println("TEST 10: FAILED");
        }
        else
            System.out.println("TEST 10: PASSED");


        // test 11.
        // Insert 3 symbols
        if (LevenstainMatrix.levenshtein("bi", "bingo") != 3){
            System.out.println("TEST 11: FAILED");
        }
        else
            System.out.println("TEST 11: PASSED");

        // test 12.
        // Change symbol
        if (LevenstainMatrix.levenshtein("binvo", "bingo") != 1){
            System.out.println("TEST 12: FAILED");
        }
        else
            System.out.println("TEST 12: PASSED");

        // test 13.
        // Change symbol in the end
        if (LevenstainMatrix.levenshtein("binga", "bingo") != 1){
            System.out.println("TEST 13: FAILED");
        }
        else
            System.out.println("TEST 13: PASSED");

        // test 14.
        // Change symbol in the begging
        if (LevenstainMatrix.levenshtein("vingo", "bingo") != 1){
            System.out.println("TEST 14: FAILED");
        }
        else
            System.out.println("TEST 14: PASSED");

        // test 15.
        // Change 2 symbols in random positions
        if (LevenstainMatrix.levenshtein("bxxgo", "bingo") != 2){
            System.out.println("TEST 15: FAILED");
        }
        else
            System.out.println("TEST 15: PASSED");

        // test 16.
        // Transposition
        if (LevenstainMatrix.levenshtein("binog", "bingo") != 2){
            System.out.println("TEST 16: FAILED");
        }
        else
            System.out.println("TEST 16: PASSED");

        // test 17.
        // Transposition
        if (LevenstainMatrix.levenshtein("ibnog", "bingo") != 4){
            System.out.println("TEST 17: FAILED");
        }
        else
            System.out.println("TEST 17: PASSED");

        // test 18.
        // Insert and Delete
        if (LevenstainMatrix.levenshtein("vbing", "bingo") != 2){
            System.out.println("TEST 18: FAILED");
        }
        else
            System.out.println("TEST 18: PASSED");

        // test 19.
        // Insert and Delete
        if (LevenstainMatrix.levenshtein("boing", "bingo") != 2){
            System.out.println("TEST 19: FAILED");
        }
        else
            System.out.println("TEST 19: PASSED");

        // test 20.
        // Insert and change
        if (LevenstainMatrix.levenshtein("ving", "bingo") != 2){
            System.out.println("TEST 20: FAILED");
        }
        else
            System.out.println("TEST 20: PASSED");

        // test 21.
        // Delete and change
        if (LevenstainMatrix.levenshtein("bingaa", "bingo") != 2){
            System.out.println("TEST 21: FAILED");
        }
        else
            System.out.println("TEST 21: PASSED");
    }

    static void testDameradLevenstein() {
        // Damerad Levenstein tests
        System.out.println("TESTS FOR Damerad-LEVENSTEIN MATRIX DISTANCE");

        // test 1.
        // String 1 is empty
        if (DameradLevenstein.calculateDistance("", "bingo") != 5){
            System.out.println("TEST 1: FAILED");
        }
        else
            System.out.println("TEST 1: PASSED");

        // test 2.
        // String 2 is empty
        if (DameradLevenstein.calculateDistance("bingo", "") != 5){
            System.out.println("TEST 2: FAILED");
        }
        else
            System.out.println("TEST 2: PASSED");

        // test 3.
        // Both strings are empty
        if (DameradLevenstein.calculateDistance("", "") != 0){
            System.out.println("TEST 3: FAILED");
        }
        else
            System.out.println("TEST 3: PASSED");

        // test 4.
        // Delete 1 symbol from the end
        if (DameradLevenstein.calculateDistance("bing", "bingo") != 1){
            System.out.println("TEST 4: FAILED");
        }
        else
            System.out.println("TEST 4: PASSED");

        // test 5.
        // Delete 1 symbol from the begging
        if (DameradLevenstein.calculateDistance("ingo", "bingo") != 1){
            System.out.println("TEST 5: FAILED");
        }
        else
            System.out.println("TEST 5: PASSED");

        // test 6.
        // Delete 1 symbol from random position
        if (DameradLevenstein.calculateDistance("bino", "bingo") != 1){
            System.out.println("TEST 6: FAILED");
        }
        else
            System.out.println("TEST 6: PASSED");

        // test 7.
        // Delete symbols from the end and from the begging
        if (DameradLevenstein.calculateDistance("bingo", "ing") != 2){
            System.out.println("TEST 7: FAILED");
        }
        else
            System.out.println("TEST 7: PASSED");

        // test 8.
        // Insert symbol in the end
        if (DameradLevenstein.calculateDistance("bing", "bingo") != 1){
            System.out.println("TEST 8: FAILED");
        }
        else
            System.out.println("TEST 8: PASSED");

        // test 9.
        // Insert symbol in the begging
        if (DameradLevenstein.calculateDistance("ingo", "bingo") != 1){
            System.out.println("TEST 9: FAILED");
        }
        else
            System.out.println("TEST 9: PASSED");

        // test 10.
        // Insert symbol in random position
        if (DameradLevenstein.calculateDistance("bngo", "bingo") != 1){
            System.out.println("TEST 10: FAILED");
        }
        else
            System.out.println("TEST 10: PASSED");


        // test 11.
        // Insert 3 symbols
        if (DameradLevenstein.calculateDistance("bi", "bingo") != 3){
            System.out.println("TEST 11: FAILED");
        }
        else
            System.out.println("TEST 11: PASSED");

        // test 12.
        // Change symbol
        if (DameradLevenstein.calculateDistance("binvo", "bingo") != 1){
            System.out.println("TEST 12: FAILED");
        }
        else
            System.out.println("TEST 12: PASSED");

        // test 13.
        // Change symbol in the end
        if (DameradLevenstein.calculateDistance("binga", "bingo") != 1){
            System.out.println("TEST 13: FAILED");
        }
        else
            System.out.println("TEST 13: PASSED");

        // test 14.
        // Change symbol in the begging
        if (DameradLevenstein.calculateDistance("vingo", "bingo") != 1){
            System.out.println("TEST 14: FAILED");
        }
        else
            System.out.println("TEST 14: PASSED");

        // test 15.
        // Change 2 symbols in random positions
        if (DameradLevenstein.calculateDistance("bxxgo", "bingo") != 2){
            System.out.println("TEST 15: FAILED");
        }
        else
            System.out.println("TEST 15: PASSED");

        // test 16.
        // Transposition
        if (DameradLevenstein.calculateDistance("binog", "bingo") != 1){
            System.out.println("TEST 16: FAILED");
        }
        else
            System.out.println("TEST 16: PASSED");

        // test 17.
        // Transposition
        if (DameradLevenstein.calculateDistance("ibnog", "bingo") != 2){
            System.out.println("TEST 17: FAILED");
        }
        else
            System.out.println("TEST 17: PASSED");

        // test 18.
        // Insert and Delete
        if (DameradLevenstein.calculateDistance("vbing", "bingo") != 2){
            System.out.println("TEST 18: FAILED");
        }
        else
            System.out.println("TEST 18: PASSED");

        // test 19.
        // Insert and Delete
        if (DameradLevenstein.calculateDistance("boing", "bingo") != 2){
            System.out.println("TEST 19: FAILED");
        }
        else
            System.out.println("TEST 19: PASSED");

        // test 20.
        // Insert and change
        if (DameradLevenstein.calculateDistance("ving", "bingo") != 2){
            System.out.println("TEST 20: FAILED");
        }
        else
            System.out.println("TEST 20: PASSED");

        // test 21.
        // Delete and change
        if (DameradLevenstein.calculateDistance("bingaa", "bingo") != 2){
            System.out.println("TEST 21: FAILED");
        }
        else
            System.out.println("TEST 21: PASSED");
    }

    static void testDameradLevensteinRecurion() {
        // Damerad Levenstein tests
        System.out.println("TESTS FOR Damerad-LEVENSTEIN MATRIX DISTANCE");

        // test 1.
        // String 1 is empty
        if (DameradLevensteinRecursion.getEditDistance("", "bingo") != 5){
            System.out.println("TEST 1: FAILED");
        }
        else
            System.out.println("TEST 1: PASSED");

        // test 2.
        // String 2 is empty
        if (DameradLevensteinRecursion.getEditDistance("bingo", "") != 5){
            System.out.println("TEST 2: FAILED");
        }
        else
            System.out.println("TEST 2: PASSED");

        // test 3.
        // Both strings are empty
        if (DameradLevensteinRecursion.getEditDistance("", "") != 0){
            System.out.println("TEST 3: FAILED");
        }
        else
            System.out.println("TEST 3: PASSED");

        // test 4.
        // Delete 1 symbol from the end
        if (DameradLevensteinRecursion.getEditDistance("bing", "bingo") != 1){
            System.out.println("TEST 4: FAILED");
            System.out.println(DameradLevensteinRecursion.getEditDistance("bing", "bingo"));
        }
        else
            System.out.println("TEST 4: PASSED");

        // test 5.
        // Delete 1 symbol from the begging
        if (DameradLevensteinRecursion.getEditDistance("ingo", "bingo") != 1){
            System.out.println("TEST 5: FAILED");
            System.out.println(DameradLevensteinRecursion.getEditDistance("ingo", "bingo"));
        }
        else
            System.out.println("TEST 5: PASSED");

        // test 6.
        // Delete 1 symbol from random position
        if (DameradLevensteinRecursion.getEditDistance("bino", "bingo") != 1){
            System.out.println("TEST 6: FAILED");
            System.out.println(DameradLevensteinRecursion.getEditDistance("bino", "bingo"));
        }
        else
            System.out.println("TEST 6: PASSED");

        // test 7.
        // Delete symbols from the end and from the begging
        if (DameradLevensteinRecursion.getEditDistance("bingo", "ing") != 2){
            System.out.println("TEST 7: FAILED");
        }
        else
            System.out.println("TEST 7: PASSED");

        // test 8.
        // Insert symbol in the end
        if (DameradLevensteinRecursion.getEditDistance("bing", "bingo") != 1){
            System.out.println("TEST 8: FAILED");
        }
        else
            System.out.println("TEST 8: PASSED");

        // test 9.
        // Insert symbol in the begging
        if (DameradLevensteinRecursion.getEditDistance("ingo", "bingo") != 1){
            System.out.println("TEST 9: FAILED");
        }
        else
            System.out.println("TEST 9: PASSED");

        // test 10.
        // Insert symbol in random position
        if (DameradLevensteinRecursion.getEditDistance("bngo", "bingo") != 1){
            System.out.println("TEST 10: FAILED");
        }
        else
            System.out.println("TEST 10: PASSED");


        // test 11.
        // Insert 3 symbols
        if (DameradLevensteinRecursion.getEditDistance("bi", "bingo") != 3){
            System.out.println("TEST 11: FAILED");
        }
        else
            System.out.println("TEST 11: PASSED");

        // test 12.
        // Change symbol
        if (DameradLevensteinRecursion.getEditDistance("binvo", "bingo") != 1){
            System.out.println("TEST 12: FAILED");
        }
        else
            System.out.println("TEST 12: PASSED");

        // test 13.
        // Change symbol in the end
        if (DameradLevensteinRecursion.getEditDistance("binga", "bingo") != 1){
            System.out.println("TEST 13: FAILED");
        }
        else
            System.out.println("TEST 13: PASSED");

        // test 14.
        // Change symbol in the begging
        if (DameradLevensteinRecursion.getEditDistance("vingo", "bingo") != 1){
            System.out.println("TEST 14: FAILED");
        }
        else
            System.out.println("TEST 14: PASSED");

        // test 15.
        // Change 2 symbols in random positions
        if (DameradLevensteinRecursion.getEditDistance("bxxgo", "bingo") != 2){
            System.out.println("TEST 15: FAILED");
        }
        else
            System.out.println("TEST 15: PASSED");

        // test 16.
        // Transposition
        if (DameradLevensteinRecursion.getEditDistance("binog", "bingo") != 1){
            System.out.println("TEST 16: FAILED");
        }
        else
            System.out.println("TEST 16: PASSED");

        // test 17.
        // Transposition
        if (DameradLevensteinRecursion.getEditDistance("ibnog", "bingo") != 2){
            System.out.println("TEST 17: FAILED");
        }
        else
            System.out.println("TEST 17: PASSED");

        // test 18.
        // Insert and Delete
        if (DameradLevensteinRecursion.getEditDistance("vbing", "bingo") != 2){
            System.out.println("TEST 18: FAILED");
        }
        else
            System.out.println("TEST 18: PASSED");

        // test 19.
        // Insert and Delete
        if (DameradLevensteinRecursion.getEditDistance("boing", "bingo") != 2){
            System.out.println("TEST 19: FAILED");
        }
        else
            System.out.println("TEST 19: PASSED");

        // test 20.
        // Insert and change
        if (DameradLevensteinRecursion.getEditDistance("ving", "bingo") != 2){
            System.out.println("TEST 20: FAILED");
        }
        else
            System.out.println("TEST 20: PASSED");

        // test 21.
        // Delete and change
        if (DameradLevensteinRecursion.getEditDistance("bingaa", "bingo") != 2){
            System.out.println("TEST 21: FAILED");
        }
        else
            System.out.println("TEST 21: PASSED");
    }

    static String generateRandomString(int stringSize)
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(stringSize);
        Random random = new Random();
        for (int i = 0; i < stringSize; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
//        System.out.println(output);

        return output;
    }

    static double timeCheckerLevensterin() {
        //System.nanoTime()
        int mesurmentNumber = 100;
        double resultTime = 0;
        double time_begin;
        double time_finish;
        String stringSource;
        String stringDestination;
        int stringSize = 10;

        while (stringSize <= 1000) {
            resultTime = 0;
            for (int i = 0; i < mesurmentNumber; i++) {
                stringSource = generateRandomString(stringSize);
                stringDestination = generateRandomString(stringSize);
                time_begin = System.nanoTime();
//                Levenstain.getEditDistance(stringSource, stringDestination);
//                LevenstainMatrix.levenshtein(stringSource, stringDestination);
                DameradLevenstein.calculateDistance(stringSource, stringDestination);
//                DameradLevensteinRecursion.getEditDistance(stringSource, stringDestination);
                time_finish = System.nanoTime();
                resultTime += time_finish - time_begin;
            }
            System.out.println(resultTime / mesurmentNumber);
            stringSize += 100;
        }
        return 0;
    }
}