package rockpaperscissorsv2;

import static rockpaperscissorsv2.RPS.*;

public class Judge {
    private HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    private Player playerOne = new HumanPlayer();
    private Player computer = new Computer();
    private int playerOneWins = 0;
    private int playerTwoWins = 0;

    private RPS compareChoices(RPS playerOneChoice, RPS playerTwoChoice) {

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

        RPS playerOneChoice = playerOne.playerChoice();
        humInDe.displayChoices(playerOneName, playerOneChoice);

        RPS playerTwoChoice = computer.playerChoice();
        humInDe.displayChoices(playerTwoName, playerTwoChoice);

        RPS winLoseTie = compareChoices(playerOneChoice, playerTwoChoice);

        switch (winLoseTie){
            case TIE:
                humInDe.tieMsg();
                break;
            case PLAYER_ONE_WON:
                humInDe.winnerOfTheGameOrRound("round", playerOneName);
                playerOneWins = playerOneWins +1;
                break;
            case PLAYER_TWO_WON:
                humInDe.winnerOfTheGameOrRound("round", playerTwoName);
                playerTwoWins = playerTwoWins +1;
                break;
        }
    }

    public int getPlayerOneWins(){
        return playerOneWins;
    }

    public int getPlayerTwoWins(){
        return playerTwoWins;
    }

    public int numberOfGame() {
        boolean isNotCorrect = true;
        int numberOfGame = -1;
        humInDe.numbersMustBeOddMsg();
        while (isNotCorrect) {
            numberOfGame = humInDe.getNumbersOfGame();
            if (numberOfGame % 2 == 0) {
                humInDe.incorrectInputMsg("number of games!");
                isNotCorrect = true;
            }else{
                isNotCorrect = false;
            }
        }
        return numberOfGame;
    }
}
