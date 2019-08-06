package rockpaperscissorsv2;

public class Computer extends  Player{
    @Override
    public RPS playerChoice() {
        RPS[] rps = {RPS.ROCK, RPS.PAPER, RPS.SCISSORS};
        return rps[(int) (Math.random() * rps.length)];
    }
}

