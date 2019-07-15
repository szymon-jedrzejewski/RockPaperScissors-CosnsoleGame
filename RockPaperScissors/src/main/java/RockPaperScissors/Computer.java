package RockPaperScissors;

import java.util.Random;

public class Computer {
    //method returning computer random number
    public int computerChoice(){
        Random random = new Random();
//        String[] computerPossibilities = {"rock", "paper", "scissors"};
//        int computerChoice = random.nextInt(computerPossibilities.length);
//        return computerPossibilities[computerChoice];
        int computerChoice = random.nextInt(3)+1;
        return computerChoice;
    }
}
