package RockPaperScissors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanInterfaceDevice {
    private Scanner in = new Scanner(System.in);
    private Choice assignedValue;
    private String playerOneName;
    private String playerTwoName = "Computer";
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";

    private String enterPlayerChoice() {
        while (true) {
            try {
                return in.next().toLowerCase();
            } catch (Exception e) {
                in.next();
                System.out.println("Something went wrong!");
            }
        }
    }

    public int getNumbersOfGame() {
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                in.next();
                System.out.print("You didn't enter number buddy!\n"
                        + "Try again:");
            }
        }
    }

    public String enterPlayerName() {
        while (true) {
            try {
                return in.next();
            } catch (Exception e) {
                in.next();
                System.out.println("Ups, something went wrong!");
            }
        }
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

    public void displayPlayerOneHiMessage(String playerOneName) {
        displayHiMessage(playerOneName);
    }

    /**
     * @param who The winner of the + game/round + is + who
     */
    private void displayWinnerOfTheGameOrRound(String what, String who) {
        System.out.println("The winner of the " + what + " is " + who);
    }

    public void displayPlayerOneWinGameMessage(String playerOneName) {
        displayWinnerOfTheGameOrRound("game", playerOneName);
    }

    public void displayPlayerTwoWinGameMessage() {
        displayWinnerOfTheGameOrRound("game", playerTwoName);
    }

    public void displayPlayerOneWinRoundMessage(String playerOneName) {
        displayWinnerOfTheGameOrRound("round", playerOneName);
    }

    public void displayPlayerTwoWinRoundMessage() {
        displayWinnerOfTheGameOrRound("round", playerTwoName);
    }

    public void displayTieMessage() {
        System.out.println("It's tie this time.");
    }

    public void displayGameStatus(int playerOneWins, int playerTwoWins, String playerOneName) {
        System.out.print("\n============================\n"
                + playerOneName + " wins: " + playerOneWins + "\n"
                + playerTwoName + " wins: " + playerTwoWins + "\n"
                + "\n============================\n");
    }

    private boolean isPlayerInputCorrect(String playerChoice) {
        displayYourChoiceMessage();
        return (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors"));
    }

    public Choice getPlayerCorrectChoice() throws Exception {
        String playerChoice = "";
        while (!isPlayerInputCorrect(playerChoice)) {
            playerChoice = enterPlayerChoice();
            switch (playerChoice) {
                case ROCK:
                    return Choice.ROCK;
                case PAPER:
                    return Choice.PAPER;
                case SCISSORS:
                    return Choice.SCISSORS;
            }
        }
        throw new Exception();
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

    public void displayPlayerOneChoice(Choice choice, String playerOneName) {
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
