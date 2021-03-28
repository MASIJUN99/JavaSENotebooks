package sample.java;

import java.util.Random;

public class PrintMine {
    public static void main(String[] args) {
        int gridSize = 10;  // 图大小
        int mineNum = 10;  // 雷数量

        char[][] map = printMine(gridSize, mineNum);

        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                System.out.print(map[x][y]);
            }
            System.out.print('\n');
        }
    }

    public static char[][] printMine(int gridSize, int mineNum) {
        char[][] map = new char[gridSize][gridSize];

        int[] xpos = new int[mineNum];
        int[] ypos = new int[mineNum];

        for (int i = 0; i < mineNum; i++) {
            xpos[i] = (int) (Math.random() * gridSize);
            ypos[i] = (int) (Math.random() * gridSize);
            if (map[xpos[i]][ypos[i]] != '*') {
                map[xpos[i]][ypos[i]] = '*';
            } else {
                while (map[xpos[i]][ypos[i]] == '*'){
                    xpos[i] = (int) (Math.random() * gridSize);
                    ypos[i] = (int) (Math.random() * gridSize);
                }
                map[xpos[i]][ypos[i]] = '*';
            }
        }

        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                if (map[x][y] != '*') {
                    map[x][y] = 'o';
                }
            }
        }
        return map;


    }
}
