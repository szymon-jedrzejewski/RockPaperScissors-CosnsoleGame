package rockpaperscissorsv2;

public class StartGame {
    HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    Judge judge = new Judge();

    public void startGame(){
        int playerOneWins = judge.getPlayerOneWins();
        int playerTwoWins = judge.getPlayerTwoWins();

        humInDe.welcomeMsg();

        humInDe.enterPlayerNameMsg();

        String playerName = humInDe.enterPlayerName();

        humInDe.hiMsg(playerName);

        humInDe.enterNumberOfGames();

        int numberOfGames = judge.numberOfGame();

        while(numberOfGames != 0) {

            humInDe.enterYourChoiceMsg();

            judge.winLoseTie(playerName, "Computer");

            humInDe.gameStatus(playerName,playerOneWins, "Computer", playerTwoWins);

            numberOfGames--;
        }
    }
}
