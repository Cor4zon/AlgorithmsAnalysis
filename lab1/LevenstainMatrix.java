
public class LevenstainMatrix {
    public static int getEditDistance(String stringOne, String stringTwo)
    {
        int stringOneLength = stringOne.length();
        int stringTwoLength = stringTwo.length();
        if (stringOneLength == 0) return stringTwoLength;
        if (stringTwoLength == 0) return stringOneLength;

        int[][] D = new int[stringOneLength+1][stringTwoLength+1];

        for(int i = 1;i <= stringOneLength; i++)
            D[i][0] = i;

        for(int j = 1;j <= stringTwoLength; j++)
            D[0][j] = j;

        for(int j=1;j<=stringTwoLength;j++)
        {
            for(int i=1;i<=stringOneLength;i++)
            {
                if(stringOne.charAt(i-1) == stringTwo.charAt(j-1))
                {
                    D[i][j] = D[i-1][j-1];
                }
                else
                {
                    D[i][j] = Math.min(
                            D[i-1][j]+1,
                            Math.min(
                                    D[i][j-1]+1,
                                    D[i-1][j-1]+1
                            )
                    );
                }
            }
        }
        return D[stringOneLength][stringTwoLength];
    }
}
