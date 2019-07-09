package RockPaperScissors;

import java.util.Scanner;

public class Game {

    public int playerWins = 0;
    public int computerWins = 0;

    private Computer computer = new Computer();

    private Player player = new Player();

    private int compareChoices(int computerChoice, int playerChoice) {

        if (computerChoice == playerChoice) {
            return 0;
        }
        switch (playerChoice) {
            case 1:
                return (computerChoice == 3 ? 1 : -1);
            case 2:
                return (computerChoice == 1 ? 1 : -1);
            case 3:
                return (computerChoice == 2 ? 1 : -1);
        }
        return 0;
    }


    public void startGame() {

        player.displayPlayerName();
        winnerOfTheRound();
        displayGameStatus();
    }


    private void winnerOfTheRound() {


        int playerChoice = player.getChoice();
        displayChoice(player.getName(), playerChoice);

        int computerChoice = computer.computerChoice();
        displayChoice("Computer", computerChoice);

        int whoWon = compareChoices(computerChoice, playerChoice);

        switch (whoWon) {
            case 0:
                //display()
                System.out.println("Tie");
                break;
            case 1:
                //display()
                System.out.println("Player has won this round!");
                playerWins++;
                break;
            case -1:
                //display()
                System.out.println("Computer has won this round!");
                computerWins++;
                break;
        }
    }

    private void displayGameStatus() {
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
    }

    private void displayChoice(String who, int choice) {
        {
            switch (choice) {
                case 1:
                    System.out.println(who + " selected rock!");
                    printRock();
                    break;
                case 2:
                    System.out.println(who + " selected paper!");
                    printPaper();
                    break;
                case 3:
                    System.out.println(who + " selected scissors!");
                    printScissors();
                    break;
                default:
                    break;
            }

        }

    }

    private void printRock() {
        //System.out.println("Rock");
        System.out.println("============================");
        System.out.println("    _______ ");
        System.out.println("---'   ____) ");
        System.out.println("      (_____)");
        System.out.println("      (_____)");
        System.out.println("      (____) ");
        System.out.println("---.__(___)");
        System.out.println("============================");
        System.out.println();
    }

    private void printPaper() {
        //System.out.println("Paper");
        System.out.println("============================");
        System.out.println("    _______       ");
        System.out.println("---'   ____)____  ");
        System.out.println("          ______) ");
        System.out.println("---'    ________ ) ");
        System.out.println("        _______) ");
        System.out.println("---.__________)");
        System.out.println("============================");
        System.out.println();
    }

    private void printScissors() {
        //System.out.println("Scissors");
        System.out.println("============================");
        System.out.println("    _______");
        System.out.println("---'   ____)____");
        System.out.println("          ______)");
        System.out.println("      __________)");
        System.out.println("      (____)");
        System.out.println("---.__(___)");
        System.out.println("============================");
        System.out.println();
    }

}
