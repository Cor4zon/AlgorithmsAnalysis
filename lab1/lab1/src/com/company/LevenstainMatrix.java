package com.company;

public class LevenstainMatrix {
    public static int levenshtein(String stringOne, String stringTwo)
    {
        int m = stringOne.length();
        int n = stringTwo.length();
        int[][] deltaM = new int[m+1][n+1];

        for(int i = 1;i <= m; i++)
            deltaM[i][0] = i;

        for(int j = 1;j <= n; j++)
            deltaM[0][j] = j;

        for(int j=1;j<=n;j++)
        {
            for(int i=1;i<=m;i++)
            {
                if(stringOne.charAt(i-1) == stringTwo.charAt(j-1))
                {
                    deltaM[i][j] = deltaM[i-1][j-1];
                }
                else
                {
                    deltaM[i][j] = Math.min(
                            deltaM[i-1][j]+1,
                            Math.min(
                                    deltaM[i][j-1]+1,
                                    deltaM[i-1][j-1]+1
                            )
                    );
                }
            }
        }
        return deltaM[m][n];
    }
}
