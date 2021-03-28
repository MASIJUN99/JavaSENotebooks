package sample.java;

public class EditDistance {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";

        int ans = minDistance(word1, word2);
        System.out.println(ans);

    }

    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];

        for (int i = 0; i < len1+1; i++){
            dp[i][0] = i;
        }
        for (int i = 0; i < len2+1; i++){
            dp[0][i] = i;
        }

        for (int x = 1; x < len1+1; x++) {
            for (int y = 1; y < len2+1; y++) {
                if (word1.charAt(x-1) == word2.charAt(y-1)) {
                    dp[x][y] = myMin(dp[x-1][y], dp[x][y-1], dp[x-1][y-1]-1) + 1;
                } else {
                    dp[x][y] = myMin(dp[x-1][y], dp[x][y-1], dp[x-1][y-1]) + 1;
                }
            }
        }
        return dp[len1][len2];
    }


    private static int myMin(int...args) {
        int min = Integer.MAX_VALUE;
        for (int arg : args){
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }
}
