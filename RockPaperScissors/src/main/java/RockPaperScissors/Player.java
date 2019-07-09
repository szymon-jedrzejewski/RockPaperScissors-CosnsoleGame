package RockPaperScissors;

import java.util.Scanner;

public class Player {
    private String name;
    private String choice;
    private int choiceNum;
    private String exit;
    private Scanner in = new Scanner(System.in);

    public Player() {
        name = "player1";
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String enterName() {
        name = in.next();
        return name;
    }

    public int getChoice() {

        choice = in.next().toLowerCase();
        if (choice.equals("rock")) {
            return choiceNum = 1;
        } else if (choice.equals("paper")) {
            return choiceNum = 2;
        } else if (choice.equals("scissors")) {
            return choiceNum = 3;
        } else {
            choiceNum = 0;
            while (choiceNum == 0) {
                System.out.println("Incorrect input. Try again, type quit/exit if you want to close app!");
                choice = in.next().toLowerCase();
                condition();
            }
            return choiceNum;
        }
    }

    private void condition() {
        if (choice.equals("rock")) {
            choiceNum = 1;
        } else if (choice.equals("paper")) {
            choiceNum = 2;
        } else if (choice.equals("scissors")) {
            choiceNum = 3;
        }else if(choice.equals("exit") || choice.equals("quit")){
            System.exit(0);
        }
    }

//    private void exit() {
//        Scanner in = new Scanner(System.in);
//        exit = in.next();
//        if (exit.equals("exit")) {
//            System.exit(0);
//        }
//    }

    public void displayPlayerName(){
        System.out.println("Enter player name.");
        String playerName = enterName();
        setName(playerName);
        System.out.println("Welcome " + getName() + " :)");
    }

    public int howManyGamesDoYouWantToPlay() {
        int howManyGames = 0;
        while (howManyGames % 2 == 0) {
            System.out.println("Numbers of game must be odd.");
            howManyGames = new Scanner(System.in).nextInt();
        }
        return howManyGames;
    }

    public boolean playAgain(){
        System.out.println("Do you want to play again?");
        System.out.println("Yes/No");
        String input = in.next().toLowerCase();
        return input.equals("yes");
    }


}
