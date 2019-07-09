package RockPaperScissors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameMain {
    private static final Logger log = LoggerFactory.getLogger(GameMain.class);
    public static void main(String[] args) {

        Game game = new Game();
        try{
            game.startGame();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
}
