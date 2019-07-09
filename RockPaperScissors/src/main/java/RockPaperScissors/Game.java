package RockPaperScissors;


public class Game {

    private int playerWins = 0;
    private int computerWins = 0;

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
        System.out.println("============================");
        System.out.println("Welcome in my RockPaperScissors Game");
        System.out.println("============================");
        player.displayPlayerName();
        System.out.println();
        System.out.println("How many games do you want to play?");
        int howMany = player.howManyGamesDoYouWantToPlay();

        System.out.println("Select rock, paper or scissors.");
        mainLoop(howMany);

    }

    private void mainLoop(int howMany){
        boolean condition = true;
        while (condition) {
            if (playerWins != (howMany+1)/2 && computerWins != (howMany+1)/2) {
                winnerOfTheRound();
                displayGameStatus();
            }else{
                condition = false;
            }
        }
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
                System.out.println();
                break;
            case 1:
                //display()
                System.out.println("Player has won this round!");
                System.out.println();
                playerWins++;
                break;
            case -1:
                //display()
                System.out.println("Computer has won this round!");
                System.out.println();
                computerWins++;
                break;
        }
    }

    private void displayGameStatus() {
        System.out.println("============================");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("============================");
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
