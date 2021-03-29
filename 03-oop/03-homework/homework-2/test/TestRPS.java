import org.junit.Test;
import sample.java.RPSGame;

import java.util.Scanner;

public class TestRPS {
    @Test
    public void testRPS() {
        RPSGame game = new RPSGame();
        Scanner scanner = new Scanner(System.in);
        int user;
        System.out.println("请输入 1.剪刀， 2.石头， 3.布， -1.退出");
        while (scanner.hasNextInt()) {
            user = scanner.nextInt();
            if (user >= 0 && 2 >= user){
                game.signalPlay(user);
                System.out.println("总积分为："  + game.getScore());
                System.out.println("请输入 1.剪刀， 2.石头， 3.布， -1.退出");
            } else if (user == -1 ) {
                break;
            }
        }
        System.out.println("结束，总积分为：" + game.getScore());
    }

    @Test
    public void testRPS2() {
        RPSGame game = new RPSGame();
        game.signalPlay(1);
        game.signalPlay(1);
        game.signalPlay(2);
        game.signalPlay(2);
        game.signalPlay(3);
        game.signalPlay(3);
        System.out.println("总积分为：" + game.getScore());
    }
}
