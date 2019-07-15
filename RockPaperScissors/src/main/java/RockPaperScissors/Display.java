package RockPaperScissors;

public class Display {

    public void winnerOfTheRoungMsg(String who){
        System.out.println(who + " has won this round!");
        System.out.println();
    }

    public void winnerOfTheGameMsg(String who){
        System.out.println(who + " has won whole game.");
        System.out.println("============================");
    }

    public void welcomeMsg(){
        System.out.println("============================");
        System.out.println("Welcome in my RockPaperScissors Game");
        System.out.println("============================");
    }

    //method responsible for displaying player name
    public void displayPlayerName(String playerName){
        System.out.println("Welcome " + playerName + " :)");
    }

    //method to display games status
    public void displayGameStatus(int playerWins, int computerWins) {
        System.out.println("============================");
        System.out.println("-->Player wins: " + playerWins);
        System.out.println("-->Computer wins: " + computerWins);
        System.out.println("============================");
    }

    //method displaying player, and computer choices
    public void displayChoice(String who, int choice) {
        {
            switch (choice) {
                case 1:
                    System.out.println("-->" + who + " selected rock!");
                    displayRock();
                    break;
                case 2:
                    System.out.println("-->" +who + " selected paper!");
                    displayPaper();
                    break;
                case 3:
                    System.out.println("-->" +who + " selected scissors!");
                    displayScissors();
                    break;
                default:
                    break;
            }

        }

    }

    public void displayRock() {
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

    public void displayPaper() {
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

    public void displayScissors() {
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
