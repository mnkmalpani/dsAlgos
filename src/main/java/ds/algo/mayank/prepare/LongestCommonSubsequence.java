package ds.algo.mayank.prepare;

public class LongestCommonSubsequence {

    private int max(int a, int b)
    {
        return (a > b)? a : b;
    }

    private int lcs(char[] X, char[] Y, int m, int n){
        int[][] L = new int[m + 1][n + 1];

        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                if(i==0 || j==0)
                    L[i][j]=0;
                else if(X[i-1]==Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j],L[i][j-1]);
            }
        }
        return L[m][n];
    }

    public static void main(String[] args) {

        String s1="AGGTAB";
        String s2="GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y =s2.toCharArray();

        LongestCommonSubsequence obj = new LongestCommonSubsequence();

        System.out.println(obj.lcs(X, Y, X.length, Y.length));

    }
}
