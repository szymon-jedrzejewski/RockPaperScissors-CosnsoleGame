package rockpaperscissorsv2;

import java.util.Scanner;

public class HumanInterfaceDevice {
    private Scanner in = new Scanner(System.in);
    private Choice assignedValue;

    private String enterPlayerChoice() {
        return in.next().toLowerCase();
    }

    public int getNumbersOfGame() {
        return in.nextInt();
    }

    public String enterPlayerName() {
        return in.next();
    }

    public void displayNumberOfGamesMessage(){
        System.out.println("Please enter number of games you want to play.");
    }

    public void displayYourChoiceMessage() {
        System.out.println("Please enter your choice.");
    }

    public void displayNumbersMustBeOddMessage() {
        System.out.println("Number of games must be odd.");
    }

    /**
     * @param message Incorrect + message + Try again.
     */
    public void displayIncorrectInputMessage(String message) {
        System.out.println("Incorrect" + message + " Try again.");
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome in my rock, paper, scissors game!!");
    }

    public void displayEnterPlayerNameMessage(){
        System.out.println("Please enter your name.");
    }

    public void displayHiMessage(String who){
        System.out.println("Hi " + who);
    }

    /**
     *
     * @param who The winner of the + game/round + is + who
     */
    public void displayWinnerOfTheGameOrRound(String what, String who) {
        System.out.println("The winner of the " + what + " is " + who);
    }

    public void displayGameWinner(String who) {
        displayWinnerOfTheGameOrRound("game", who);
    }

    public void displayRoundWinner(String who) {
        displayWinnerOfTheGameOrRound("round", who);
    }

    public void displayTieMessage(){
        System.out.println("It's tie this time.");
    }

    public void displayGameStatus(String playerOneName, int playerOneWins,String playerTwoName, int playerTwoWins) {
        System.out.println("\n============================");
        System.out.println(playerOneName + " wins: " + playerOneWins);
        System.out.println(playerTwoName + " wins: " + playerTwoWins);
        System.out.println("============================\n");
    }

    public Choice getPlayerCorrectChoice() {
        String playerChoice;
        boolean isNotCorrect = true;
        while (isNotCorrect) {
            playerChoice = enterPlayerChoice();
            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                assignPlayerChoice(playerChoice);
                isNotCorrect = false;
            } else {
                displayIncorrectInputMessage("input!");
                isNotCorrect = true;
            }
        }
        return assignedValue;
    }

    private void assignPlayerChoice(String playerChoice) {
        switch (playerChoice) {
            case "rock":
                assignedValue = Choice.ROCK;
                break;
            case "paper":
                assignedValue = Choice.PAPER;
                break;
            case "scissors":
                assignedValue = Choice.SCISSORS;
                break;
        }
    }

    public void displayChoices(String who, Choice choice){

        switch (choice){
            case ROCK:
                System.out.println("-->" + who + " selected rock!");
                displayRock();
                break;
            case PAPER:
                System.out.println("-->" + who + " selected paper!");
                displayPaper();
                break;
            case SCISSORS:
                System.out.println("-->" + who + " selected scissors!");
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
