package rockpaperscissorsv2;

import static rockpaperscissorsv2.Choice.*;
import static rockpaperscissorsv2.Result.*;

public class Judge {
    private HumanInterfaceDevice humanInterfaceDevice = new HumanInterfaceDevice();
    private Computer computer = new Computer();
    private int playerOneWins = 0;
    private int playerTwoWins = 0;



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

    public void winnerOfTheRound() throws Exception {

        Choice playerOneChoice = humanInterfaceDevice.getPlayerCorrectChoice();
        humanInterfaceDevice.displayPlayerOneChoice(playerOneChoice);

        Choice playerTwoChoice = computer.playerChoice();
        humanInterfaceDevice.displayPlayerTwoChoice(playerTwoChoice);

        Result winLoseTie = compareChoices(playerOneChoice, playerTwoChoice);

        switch (winLoseTie) {
            case TIE:
                humanInterfaceDevice.displayTieMessage();
                break;
            case PLAYER_ONE_WON:
                humanInterfaceDevice.displayPlayerOneWinRoundMessage();
                playerOneWins++;
                break;
            case PLAYER_TWO_WON:
                humanInterfaceDevice.displayPlayerTwoWinRoundMessage();
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

    private Result getWinnerOfTheGame(int gamesNeededToWin) throws Exception {
        while (playerOneWins < gamesNeededToWin && playerTwoWins < gamesNeededToWin) {
            winnerOfTheRound();
            humanInterfaceDevice.displayGameStatus(playerOneWins, playerTwoWins);
        }
        return playerOneWins > playerTwoWins ? PLAYER_ONE_WON : PLAYER_TWO_WON;
    }

    private void gameLogic() throws Exception {
        humanInterfaceDevice.displayNumberOfGamesMessage();

        int numberOfGames = (numberOfGames() + 1) / 2;

        switch (getWinnerOfTheGame(numberOfGames)) {
            case PLAYER_ONE_WON:
                humanInterfaceDevice.displayPlayerOneWinGameMessage();
                break;
            case PLAYER_TWO_WON:
                humanInterfaceDevice.displayPlayerTwoWinGameMessage();
                break;
        }
    }

    public void startGame() throws Exception {
        humanInterfaceDevice.displayWelcomeMessage();
        humanInterfaceDevice.displayEnterPlayerNameMessage();
        humanInterfaceDevice.enterPlayerName();
        humanInterfaceDevice.displayPlayerOneHiMessage();
        gameLogic();
    }
}
