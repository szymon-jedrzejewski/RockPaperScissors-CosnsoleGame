package rockpaperscissorsv2;

import static rockpaperscissorsv2.Choice.*;
import static rockpaperscissorsv2.HumanInterfaceDevice.*;
import static rockpaperscissorsv2.Result.*;

public class Judge {
    private HumanInterfaceDevice humanInterfaceDevice = new HumanInterfaceDevice();
    //private Player playerOne = new HumanPlayer(humInDe);
    private Computer computer = new Computer();
    private int playerOneWins = 0;
    private int playerTwoWins = 0;
    private String playerOneName;
    private String playerTwoName = "Computer";


    private Result compareChoices(Choice playerOneChoice, Choice playerTwoChoice) {

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

        Result winLoseTie = compareChoices(playerOneChoice, playerTwoChoice);

        switch (winLoseTie) {
            case TIE:
                humanInterfaceDevice.displayTieMessage();
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
        humanInterfaceDevice.displayNumbersMustBeOddMessage();
        while (isNotCorrect) {
            numberOfGames = humanInterfaceDevice.getNumbersOfGame();
            if (numberOfGames % 2 == 0) {
                humanInterfaceDevice.displayIncorrectInputMessage("number of games!");
                isNotCorrect = true;
            } else {
                isNotCorrect = false;
            }
        }
        return numberOfGames;
    }

    private Result getWinnerOfTheGame(int gamesNeededToWin) {
        while (playerOneWins < gamesNeededToWin && playerTwoWins < gamesNeededToWin) {
            humanInterfaceDevice.displayYourChoiceMessage();
            winnerOfTheRound();
            humanInterfaceDevice.displayGameStatus(playerOneName, playerOneWins, playerTwoName, playerTwoWins);
        }
        return playerOneWins > playerTwoWins ? PLAYER_ONE_WON : PLAYER_TWO_WON;
    }

    private void gameLogic() {
        humanInterfaceDevice.displayNumberOfGamesMessage();

        int numberOfGames = (numberOfGames() + 1) / 2;

        switch (getWinnerOfTheGame(numberOfGames)) {
            case PLAYER_ONE_WON:
                humanInterfaceDevice.displayGameWinner(playerOneName);
                break;
            case PLAYER_TWO_WON:
                humanInterfaceDevice.displayGameWinner(playerTwoName);
                break;
        }
    }

    public void startGame() {
        humanInterfaceDevice.displayWelcomeMessage();
        humanInterfaceDevice.displayEnterPlayerNameMessage();
        playerOneName = humanInterfaceDevice.enterPlayerName();
        humanInterfaceDevice.displayHiMessage(playerOneName);
        gameLogic();
    }
}
