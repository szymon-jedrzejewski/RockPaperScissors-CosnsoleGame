package rockpaperscissorsv2;

import static rockpaperscissorsv2.RPS.*;

public class Judge {
    private HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    private Player playerOne = new HumanPlayer();
    private Player computer = new Computer();
    private static int playerOneWins = 0;
    private static int playerTwoWins = 0;

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
        //displayChoice

        RPS playerTwoChoice = computer.playerChoice();
        //displayChoice

        RPS winLoseTie = compareChoices(playerOneChoice, playerTwoChoice);

        switch (winLoseTie){
            case TIE:
                humInDe.tieMsg();
                break;
            case PLAYER_ONE_WON:
                humInDe.winnerOfTheGameOrRound("round", playerOneName);
                playerOneWins++;
                break;
            case PLAYER_TWO_WON:
                humInDe.winnerOfTheGameOrRound("round", playerTwoName);
                playerTwoWins++;
                break;
        }
    }
}
