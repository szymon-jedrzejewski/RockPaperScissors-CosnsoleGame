package rockpaperscissorsv2;

import java.util.Random;

public class Computer extends  Player{

    @Override
    public RPS playerChoice() {
        RPS[] rps = {RPS.ROCK, RPS.PAPER, RPS.SCISSORS};
        return rps[(int) (Math.random() * rps.length)];
    }
}
