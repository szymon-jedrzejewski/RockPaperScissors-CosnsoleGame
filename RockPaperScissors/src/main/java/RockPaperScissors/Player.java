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
                System.out.println("Incorrect input, please try again!");
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
        }
    }

    private void back() {
        Scanner in = new Scanner(System.in);
        exit = in.next();
        if (exit.equals("exit")) {
            System.exit(0);
        }
    }
}
