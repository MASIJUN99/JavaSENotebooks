import org.junit.Test;
import sample.java.Game;

public class TestGame {
    @Test
    public void testGame() {
        Game game = new Game();
        game.name = "COD";
        game.category = "FPS";
        game.level = "18+";
        game.size = 1024 * 1024 * 60;
        game.info = "三亿鼠标的枪战梦想";

        System.out.println(game.getInfo());
    }


}

