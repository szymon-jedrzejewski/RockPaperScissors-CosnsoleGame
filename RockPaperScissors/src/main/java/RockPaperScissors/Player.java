package RockPaperScissors;

import java.util.Scanner;

public class Player {
    private String name;
    private String choice;
    //variable i used to assign user choice to the number
    private int choiceNum;
    private String exit;
    private Scanner in = new Scanner(System.in);

    public Player() {
        name = "player1";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String enterName() {
        name = in.next();
        return name;
    }

    /**
     * method getting player choice
     * if player enter correct input it assign the input to the number
     * @return choiceNum
     */
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
            //this loop is used to get correct choice from user
            while (choiceNum == 0) {
                System.out.println("Incorrect input. Try again, type quit/exit if you want to close app!");
                choice = in.next().toLowerCase();
                condition();
            }
            return choiceNum;
        }
    }

    //repeated code that I moved to another method
    //it checks if user enter correct input
    //and gives him opportunity to end program
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

    //method is getting number of games that player wants to play
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
