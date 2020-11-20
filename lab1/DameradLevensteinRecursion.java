public class DameradLevensteinRecursion {
    static int getEditDistance(String stringOne, String stringTwo) {
        int lengthOne = stringOne.length();
        int lengthTwo = stringTwo.length();
        if (lengthOne == lengthTwo && lengthOne == 0) return 0;
        if (lengthOne == 0 && lengthTwo > 0) return lengthTwo;
        if (lengthOne > 0 && lengthTwo == 0) return lengthOne;

        int M;
        // ?
        if (stringOne.charAt(lengthOne-1) == stringTwo.charAt(lengthTwo-1)) M = 0;
        else M = 1;

        int I, D, R;
        I = getEditDistance(stringOne, stringTwo.substring(0, lengthTwo-1)) + 1;
        D = getEditDistance(stringOne.substring(0, lengthOne-1), stringTwo) + 1;
        R = getEditDistance(stringOne.substring(0, lengthOne-1), stringTwo.substring(0, lengthTwo-1)) + M;

        int T;
        if (lengthOne > 1 && lengthTwo > 1 &&
                stringOne.charAt(lengthOne-1) == stringTwo.charAt(lengthTwo-2) &&
                stringOne.charAt(lengthOne-2) == stringTwo.charAt(lengthTwo-1)) {
            T = getEditDistance(stringOne.substring(0, lengthOne-2), stringTwo.substring(0, lengthTwo-2)) + 1;
        }
        else T = 10000;

        return Math.min(I, Math.min(D, Math.min(R, T)));
    }
}
