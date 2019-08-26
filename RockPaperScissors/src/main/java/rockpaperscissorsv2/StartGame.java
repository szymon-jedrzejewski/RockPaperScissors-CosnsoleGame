package rockpaperscissorsv2;

public class StartGame {
    HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    Judge judge = new Judge();

    public void startGame(){

        humInDe.displayWelcomeMassage();

        humInDe.enterPlayerNameMassage();

        String playerName = humInDe.enterPlayerName();

        humInDe.displayHiMassage(playerName);

        humInDe.enterNumberOfGames();

        int numberOfGames = judge.numberOfGames();

        while(numberOfGames != 0) {


            humInDe.enterYourChoiceMassage();

            judge.winLoseTie(playerName, "Computer");

            int playerOneWins = judge.getPlayerOneWins();
            int playerTwoWins = judge.getPlayerTwoWins();

            humInDe.gameStatus(playerName, playerOneWins, "Computer", playerTwoWins);

            numberOfGames--;
        }
    }
}
