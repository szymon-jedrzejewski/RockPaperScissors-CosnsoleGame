package rockpaperscissorsv2;

import java.util.Scanner;

public class HumanInterfaceDevice {
    private Scanner in = new Scanner(System.in);
    private Choice assignedValue;
    private String playerOneName;
    private String playerTwoName = "Computer";

    private String enterPlayerChoice() {
        return in.next().toLowerCase();
    }

    public int getNumbersOfGame() {
        return in.nextInt();
    }

    public String enterPlayerName() {
        return playerOneName = in.next();
    }

    public void displayNumberOfGamesMessage() {
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

    public void displayEnterPlayerNameMessage() {
        System.out.println("Please enter your name.");
    }

    private void displayHiMessage(String who) {
        System.out.println("Hi " + who);
    }

    public void displayPlayerOneHiMessage() {
        displayHiMessage(playerOneName);
    }

    /**
     * @param who The winner of the + game/round + is + who
     */
    private void displayWinnerOfTheGameOrRound(String what, String who) {
        System.out.println("The winner of the " + what + " is " + who);
    }

    public void displayPlayerOneWinGameMessage() {
        displayWinnerOfTheGameOrRound("game", playerOneName);
    }

    public void displayPlayerTwoWinGameMessage() {
        displayWinnerOfTheGameOrRound("game", playerTwoName);
    }

    public void displayPlayerOneWinRoundMessage() {
        displayWinnerOfTheGameOrRound("round", playerOneName);
    }

    public void displayPlayerTwoWinRoundMessage() {
        displayWinnerOfTheGameOrRound("round", playerTwoName);
    }

    public void displayTieMessage() {
        System.out.println("It's tie this time.");
    }

    public void displayGameStatus(int playerOneWins, int playerTwoWins) {
        System.out.println("\n============================");
        System.out.println(playerOneName + " wins: " + playerOneWins);
        System.out.println(playerTwoName + " wins: " + playerTwoWins);
        System.out.println("============================\n");
    }

    public Choice getPlayerCorrectChoice() {
        String playerChoice = "";
        while (!isPlayerInputCorrect(playerChoice)) {
            playerChoice = enterPlayerChoice();
            assignPlayerChoice(playerChoice);
        }
        return assignedValue;
    }

    public boolean isPlayerInputCorrect(String playerChoice) {
        displayYourChoiceMessage();
        return (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors"));
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

    private void displayChoices(String who, Choice choice) {

        switch (choice) {
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

    public void displayPlayerOneChoice(Choice choice) {
        displayChoices(playerOneName, choice);
    }

    public void displayPlayerTwoChoice(Choice choice) {
        displayChoices(playerTwoName, choice);
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
