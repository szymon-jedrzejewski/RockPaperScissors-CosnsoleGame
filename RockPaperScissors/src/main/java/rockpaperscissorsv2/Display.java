package rockpaperscissorsv2;

public class Display {
    public void welcomeMsg(){
        System.out.println("Welcome in my rock, paper, scissors game!!");
    }

    public void winnerOfTheRound(){

    }

    public void winnerOfTheGame(){

    }

    public void gameStatus(){

    }

    public void displayRock() {
        //System.out.println("Rock");
        System.out.println("============================\n");
        System.out.println("    _______ ");
        System.out.println("---'   ____) ");
        System.out.println("      (_____)");
        System.out.println("      (_____)");
        System.out.println("      (____) ");
        System.out.println("---.__(___)");
        System.out.println("============================\n");
        System.out.println();
    }

    public void displayPaper() {
        //System.out.println("Paper");
        System.out.println("============================\n");
        System.out.println("    _______       ");
        System.out.println("---'   ____)____  ");
        System.out.println("          ______) ");
        System.out.println("---'    ________ ) ");
        System.out.println("        _______) ");
        System.out.println("---.__________)");
        System.out.println("============================\n");
        System.out.println();
    }

    public void displayScissors() {
        //System.out.println("Scissors");
        System.out.println("============================\n");
        System.out.println("    _______");
        System.out.println("---'   ____)____");
        System.out.println("          ______)");
        System.out.println("      __________)");
        System.out.println("      (____)");
        System.out.println("---.__(___)");
        System.out.println("============================\n");
    }
}
