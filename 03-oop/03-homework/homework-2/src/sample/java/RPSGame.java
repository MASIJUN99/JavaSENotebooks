package sample.java;

import java.util.Random;

public class RPSGame {
    private int score;

    public RPSGame() {
        this.score = 0;
    }

    public void signalPlay(int user) {
        int bot = (int) (Math.random() * 3);

        String[] dic = {"Scissors", "Rock", "Paper"};

        System.out.println("bot is " + dic[bot]);

        /*
        if (bot == 1) {
            switch (user) {
                case 1 -> System.out.println("平局");
                case 2 -> System.out.println("你赢了");
                case 3 -> System.out.println("你输了");
            }
        } else if (bot == 2) {
            switch (user) {
                case 1 -> System.out.println("你输了");
                case 2 -> System.out.println("平局");
                case 3 -> System.out.println("你赢了");
            }
        } else if (bot == 3) {
            switch (user) {
                case 1 -> System.out.println("你赢了");
                case 2 -> System.out.println("你输了");
                case 3 -> System.out.println("平局");
            }
        }
        */

        int delta = user - 1 - bot;

        switch (delta) {
            case 0 -> System.out.println("平局");
            case 1 -> {
                System.out.println("你赢了");
                score += 1;
            }
            case -2 -> {
                System.out.println("你赢了");
                score += 1;
            }
            default -> {
                System.out.println("你输了");
                score -= 1;
            }
        }




    }

    public int getScore() {
        return score;
    }
}
