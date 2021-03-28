package sample.java;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '0', '0', '1', '0'},
                {'0', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int ans = numIslands(grid);
        System.out.println(ans);

    }

    public static int numIslands(char[][] grid) {
        int nums = 0;
        int xsize = grid.length;
        int ysize = grid[0].length;
        for (int x = 0; x < xsize; x++) {
            for (int y = 0; y < ysize; y++) {
                if (grid[x][y] == '1') {
                    printer(grid, x, y);
                    nums += 1;
                }
            }
        }


        return nums;
    }

    private static void printer(char[][] grid, int x, int y) {
        int xsize = grid.length;
        int ysize = grid[0].length;
        if (!(x > xsize - 1 || y > ysize - 1 || x < 0 || y < 0 || grid[x][y] == '0')) {
            grid[x][y] = '0';
            printer(grid, x - 1, y);
            printer(grid, x + 1, y);
            printer(grid, x, y - 1);
            printer(grid, x, y + 1);
        }
    }
}
