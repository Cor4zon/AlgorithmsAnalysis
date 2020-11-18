package com.company;

public class DameradLevenstein {
    public static int calculateDistance(CharSequence stringOne, CharSequence stringTwo) {
        if (stringOne == null || stringTwo == null) {
            throw new IllegalArgumentException("Parameter must not be null");
        }

        int stringOneLength = stringOne.length();
        int stringTwoLength = stringTwo.length();
        if (stringOneLength == 0) return stringTwoLength;
        if (stringTwoLength == 0) return stringOneLength;

        int[][] D = new int[stringOneLength + 1][stringTwoLength + 1];

        for (int i = 0; i < stringOneLength + 1; i++) {
            D[i][0] = i;
        }

        for (int j = 0; j < stringTwoLength + 1; j++) {
            D[0][j] = j;
        }

        for (int i = 1; i < stringOneLength + 1; i++) {
            for (int j = 1; j < stringTwoLength + 1; j++) {
                int cost = stringOne.charAt(i - 1) == stringTwo.charAt(j - 1) ? 0 : 1;
                D[i][j] = Math.min(Math.min(D[i - 1][j] + 1, D[i][j - 1] + 1), D[i - 1][j - 1] + cost);
                if (i > 1 &&
                        j > 1 &&
                        stringOne.charAt(i - 1) == stringTwo.charAt(j - 2) &&
                        stringOne.charAt(i - 2) == stringTwo.charAt(j - 1)) {
                    D[i][j] = Math.min(D[i][j], D[i - 2][j - 2] + cost);
                }
            }
        }
        return D[stringOneLength][stringTwoLength];
    }
}