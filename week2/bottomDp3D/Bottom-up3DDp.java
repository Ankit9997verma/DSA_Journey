import java.util.Scanner;

public class LCSOfThree {
    // Computes the length of LCS among X, Y and Z
    public static int lcsOf3(String X, String Y, String Z) {
        int m = X.length(), n = Y.length(), o = Z.length();
        int[][][] dp = new int[m+1][n+1][o+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= o; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        dp[i][j][k] = 0;
                    } else if (X.charAt(i - 1) == Y.charAt(j - 1)
                            && X.charAt(i - 1) == Z.charAt(k - 1)) {
                        dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                    } else {
                        dp[i][j][k] = Math.max(
                                Math.max(dp[i - 1][j][k], dp[i][j - 1][k]),
                                dp[i][j][k - 1]
                        );
                    }
                }
            }
        }
        return dp[m][n][o];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read three input strings
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();
        sc.close();

        int result = lcsOf3(s1, s2, s3);
        System.out.println(result);
    }
}
