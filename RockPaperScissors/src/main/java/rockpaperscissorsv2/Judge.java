package rockpaperscissorsv2;

import static rockpaperscissorsv2.Choice.*;
import static rockpaperscissorsv2.RoundResult.PLAYER_ONE_WON;
import static rockpaperscissorsv2.RoundResult.PLAYER_TWO_WON;
import static rockpaperscissorsv2.RoundResult.TIE;

public class Judge {
    private HumanInterfaceDevice humanInterfaceDevice = new HumanInterfaceDevice();
    //private Player playerOne = new HumanPlayer(humInDe);
    private Computer computer = new Computer();
    private int playerOneWins = 0;
    private int playerTwoWins = 0;
    private String playerOneName;
    public String playerTwoName = "Computer";

    private RoundResult compareChoices(Choice playerOneChoice, Choice playerTwoChoice) {

        if (playerOneChoice == playerTwoChoice) {
            return TIE;
        }
        switch (playerOneChoice) {
            case ROCK: {
                return (playerTwoChoice == SCISSORS ? PLAYER_ONE_WON : PLAYER_TWO_WON);
            }
            case PAPER: {
                return (playerTwoChoice == ROCK ? PLAYER_ONE_WON : PLAYER_TWO_WON);

            }
            case SCISSORS: {
                return (playerTwoChoice == PAPER ? PLAYER_ONE_WON : PLAYER_TWO_WON);
            }
        }
        return TIE;
    }

    public void winnerOfTheRound() {

        Choice playerOneChoice = humanInterfaceDevice.getPlayerCorrectChoice();
        humanInterfaceDevice.displayChoices(playerOneName, playerOneChoice);

        Choice playerTwoChoice = computer.playerChoice();
        humanInterfaceDevice.displayChoices(playerTwoName, playerTwoChoice);

        RoundResult winLoseTie = compareChoices(playerOneChoice, playerTwoChoice);

        switch (winLoseTie) {
            case TIE:
                humanInterfaceDevice.displayTieMassage();
                break;
            case PLAYER_ONE_WON:
                humanInterfaceDevice.displayRoundWinner(playerOneName);
                playerOneWins++;
                break;
            case PLAYER_TWO_WON:
                humanInterfaceDevice.displayRoundWinner(playerTwoName);
                playerTwoWins++;
                break;
        }
    }

    private int numberOfGames() {
        boolean isNotCorrect = true;
        int numberOfGames = -1;
        humanInterfaceDevice.displayNumbersMustBeOddMassage();
        while (isNotCorrect) {
            numberOfGames = humanInterfaceDevice.getNumbersOfGame();
            if (numberOfGames % 2 == 0) {
                humanInterfaceDevice.displayIncorrectInputMassage("number of games!");
                isNotCorrect = true;
            } else {
                isNotCorrect = false;
            }
        }
        return numberOfGames;
    }

    private boolean isPlayerOneAWinnerOfTheGame(int gamesNeededToWin) {
        boolean didPlayerOneWin = true;
        boolean playerOneOrPlayerTwoIsNotWinnerOfGame = true;

        while (playerOneOrPlayerTwoIsNotWinnerOfGame) {
            humanInterfaceDevice.displayYourChoiceMassage();
            winnerOfTheRound();
            humanInterfaceDevice.displayGameStatus(playerOneName, playerOneWins, playerTwoName, playerTwoWins);

            if (playerOneWins == gamesNeededToWin) {

                playerOneOrPlayerTwoIsNotWinnerOfGame = false;

            } else if (playerTwoWins == gamesNeededToWin) {

                didPlayerOneWin = false;
                playerOneOrPlayerTwoIsNotWinnerOfGame = false;

            }
        }
        return didPlayerOneWin;
    }

    private void gameLogic() {
        humanInterfaceDevice.displayNumberOfGamesMassage();

        int numberOfGames = (numberOfGames() + 1) / 2;

        if (isPlayerOneAWinnerOfTheGame(numberOfGames)) {
            humanInterfaceDevice.displayGameWinner(playerOneName);
        } else {
            humanInterfaceDevice.displayGameWinner(playerTwoName);
        }
    }

    public void startGame() {
        humanInterfaceDevice.displayWelcomeMassage();
        humanInterfaceDevice.displayEnterPlayerNameMassage();
        playerOneName = humanInterfaceDevice.enterPlayerName();
        humanInterfaceDevice.displayHiMassage(playerOneName);
        gameLogic();
    }
}
