package rockpaperscissorsv2;

public class Computer {
    public Choice playerChoice() {
        Choice[] rps = {Choice.ROCK, Choice.PAPER, Choice.SCISSORS};
        return rps[(int) (Math.random() * rps.length)];
    }
}

