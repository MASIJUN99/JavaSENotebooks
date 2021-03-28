package sample.java;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        int ans = minPathSum(grid);
        System.out.println(ans);
    }

    public static int minPathSum(int[][] grid) {
        int xsize = grid.length;
        int ysize = grid[0].length;
        for (int i = 1; i < xsize; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int i = 1; i < ysize; i++) {
            grid[0][i] += grid[0][i-1];
        }
        for (int x = 1; x < xsize; x++) {
            for (int y = 1; y < ysize; y++) {
                grid[x][y] = Math.min(grid[x-1][y], grid[x][y-1]) + grid[x][y];
            }
        }
        return grid[xsize-1][ysize-1];
    }
}
