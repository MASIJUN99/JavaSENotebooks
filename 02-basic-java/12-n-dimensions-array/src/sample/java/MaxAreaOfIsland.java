package sample.java;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int ans = maxAreaOfIsland(grid);
        System.out.println(ans);
    }



    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int xsize = grid.length;
        int ysize = grid[0].length;
        for (int x = 0; x < xsize; x++) {
            for (int y = 0; y < ysize; y++) {
                int area = printer(grid, x, y);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static int printer(int[][] grid, int x, int y) {
        int xsize = grid.length;
        int ysize = grid[0].length;

        if (x < 0 || y < 0 || x > xsize-1 || y > ysize-1 || grid[x][y] == 0) {
            return 0;
        } else {
            grid[x][y] = 0;
            return 1 +
                    printer(grid, x-1, y) +
                    printer(grid, x+1, y) +
                    printer(grid, x, y-1) +
                    printer(grid, x, y+1);

        }
    }
}
