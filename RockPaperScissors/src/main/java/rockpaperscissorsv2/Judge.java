package rockpaperscissorsv2;

import static rockpaperscissorsv2.RPS.*;

public class Judge {


    public RPS compareChoices(RPS playerOneChoice, RPS playerTwoChoice) {

        if(playerOneChoice == playerTwoChoice){
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
}
