package sample.java;

public class UniquePaths {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int ans = uniquePath(m,n);
        System.out.println(ans);
    }

    public static int uniquePath(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int x = 1; x < m; x++) {
            for (int y = 1; y < n; y++) {
                dp[x][y] = dp[x - 1][y] + dp[x][y - 1];
            }
        }
        return dp[m-1][n-1];
    }
}
