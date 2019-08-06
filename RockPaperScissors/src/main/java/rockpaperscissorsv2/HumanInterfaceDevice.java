package rockpaperscissorsv2;

import java.util.Scanner;

public class HumanInterfaceDevice {
    private Scanner in = new Scanner(System.in);

    public String getPlayerChoice() {
        return in.next().toLowerCase();
    }

    public int getNumbersOfGame() {
        return in.nextInt();
    }

    public String enterPlayerName() {
        return in.next();
    }

    public void numbersMustBeOddMsg() {
        System.out.println("Number of games must be odd.");
    }

    public void getInputMsg() {
        System.out.println("Enter rock, paper or scissors.");
    }

    /**
     * @param msg Incorrect + msg + Try again.
     */
    public void incorrectInputMsg(String msg) {
        System.out.println("Incorrect" + msg + " Try again.");
    }

    public void welcomeMsg() {
        System.out.println("Welcome in my rock, paper, scissors game!!");
    }

    public void winnerOfTheRound(RPS playerOneChoice, RPS playerTwoChoice){

    }

    /**
     *
     * @param who The winner of the + game/round + is + who
     */
    public void winnerOfTheGameOrRound(String what, String who) {
        System.out.println("The winner of the " + what + " is " + who);
    }

    public void tieMsg(){
        System.out.println("It's tie this time.");
    }

    public void gameStatus(String playerOneName, int playerOneWins, String playerTwoName, int playerTwoWins) {
        System.out.println("\n============================");
        System.out.println(playerOneName + "wins: " + playerOneWins);
        System.out.println(playerTwoName + "wins: " + playerTwoWins);
        System.out.println("============================\n");
    }

    public void displayChoices(String who, RPS choice){

        switch (choice){
            case ROCK:
                System.out.println("-->" + who + "selected rock!\n");
                displayRock();
                break;
            case PAPER:
                System.out.println("-->" + who + "selected paper!\n");
                displayPaper();
                break;
            case SCISSORS:
                System.out.println("-->" + who + "selected scissors!\n");
                displayScissors();
                break;
        }

    }

    private void displayRock() {
        //System.out.println("Rock");
        System.out.println("\n============================");
        System.out.println("    _______ ");
        System.out.println("---'   ____) ");
        System.out.println("      (_____)");
        System.out.println("      (_____)");
        System.out.println("      (____) ");
        System.out.println("---.__(___)");
        System.out.println("============================\n");
    }

    private void displayPaper() {
        //System.out.println("Paper");
        System.out.println("\n============================");
        System.out.println("    _______       ");
        System.out.println("---'   ____)____  ");
        System.out.println("          ______) ");
        System.out.println("---'    ________ ) ");
        System.out.println("        _______) ");
        System.out.println("---.__________)");
        System.out.println("============================\n");
    }

    private void displayScissors() {
        //System.out.println("Scissors");
        System.out.println("\n============================");
        System.out.println("    _______");
        System.out.println("---'   ____)____");
        System.out.println("          ______)");
        System.out.println("      __________)");
        System.out.println("      (____)");
        System.out.println("---.__(___)");
        System.out.println("============================\n");
    }
}
