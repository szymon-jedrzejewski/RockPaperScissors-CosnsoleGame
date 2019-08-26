package rockpaperscissorsv2;

import static rockpaperscissorsv2.Choice.*;
import static rockpaperscissorsv2.RoundResult.PLAYER_ONE_WON;
import static rockpaperscissorsv2.RoundResult.PLAYER_TWO_WON;
import static rockpaperscissorsv2.RoundResult.TIE;

public class Judge {
    private HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    private Player playerOne = new HumanPlayer(humInDe);
    private Player computer = new Computer();
    private int playerOneWins = 0;
    private int playerTwoWins = 0;

    public RoundResult compareChoices(Choice playerOneChoice, Choice playerTwoChoice) {

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

    public void winLoseTie(String playerOneName, String playerTwoName){

        Choice playerOneChoice = playerOne.playerChoice();
        humInDe.displayChoices(playerOneName, playerOneChoice);

        Choice playerTwoChoice = computer.playerChoice();
        humInDe.displayChoices(playerTwoName, playerTwoChoice);

        RoundResult winLoseTie = compareChoices(playerOneChoice, playerTwoChoice);

        switch (winLoseTie){
            case TIE:
                humInDe.displayTieMassage();
                break;
            case PLAYER_ONE_WON:
                humInDe.displayRoundWinner(playerOneName);
                playerOneWins++;
                break;
            case PLAYER_TWO_WON:
                humInDe.displayRoundWinner(playerTwoName);
                playerTwoWins++;
                break;
        }
    }

    public int getPlayerOneWins(){
        return playerOneWins;
    }

    public int getPlayerTwoWins(){
        return playerTwoWins;
    }

    public int numberOfGames() {
        boolean isNotCorrect = true;
        int numberOfGames = -1;
        humInDe.displayNumbersMustBeOddMassage();
        while (isNotCorrect) {
            numberOfGames = humInDe.getNumbersOfGame();
            if (numberOfGames % 2 == 0) {
                humInDe.displayIncorrectInputMassage("number of games!");
                isNotCorrect = true;
            }else{
                isNotCorrect = false;
            }
        }
        return numberOfGames;
    }
}
