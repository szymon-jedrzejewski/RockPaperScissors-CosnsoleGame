package rockpaperscissorsv2;

public class Main {
    public static void main(String[] args) {
        StartGame startGame = new StartGame();
        Player player1 = new HumanPlayer();
        Player computer =  new Computer();
        Judge judge =  new Judge();
        HumanInterfaceDevice humInDe = new HumanInterfaceDevice();

        //judge.winLoseTie("player1", "computer");
        startGame.startGame();
    }
}
