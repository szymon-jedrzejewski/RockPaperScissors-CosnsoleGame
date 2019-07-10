package RockPaperScissors;


public class Game {

    private int playerWins = 0;
    private int computerWins = 0;

    private Computer computer = new Computer();
    private Player player = new Player();
    private  Display display = new Display();

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
        display.displayPlayerName();
        System.out.println();
        System.out.println("How many games do you want to play? Game format is 'Best Of'");
        //int howMany = player.howManyGamesDoYouWantToPlay();
        int gamesNeededToWin = (player.howManyGamesDoYouWantToPlay()+1)/2;

        System.out.println("Select rock, paper or scissors.");
        if(isPlayerAWinner(gamesNeededToWin)){
            System.out.println("Player has won whole game.");
        }else {
            System.out.println("Computer has won whole game.");
        }

    }

//    private void mainLoop(int howMany){
//        boolean condition = true;
//        while (condition) {
//            if (playerWins != (howMany+1)/2 && computerWins != (howMany+1)/2) {
//                winnerOfTheRound();
//                displayGameStatus();
//            }else{
//                condition = false;
//            }
//        }
//    }

    private boolean isPlayerAWinner(int gamesNeededToWin){

        boolean loopCondition = true;
        boolean isPlayerAWinner = false;

        while (loopCondition) {

            winnerOfTheRound();
            display.displayGameStatus(computerWins, playerWins);

            if (playerWins == gamesNeededToWin) {

                isPlayerAWinner = true;
                loopCondition = false;

            }else if (computerWins == gamesNeededToWin){
                loopCondition = false;
            }
        }
        return isPlayerAWinner;
    }

    private void winnerOfTheRound() {


        int playerChoice = player.getChoice();
        display.displayChoice(player.getName(), playerChoice);

        int computerChoice = computer.computerChoice();
        display.displayChoice("Computer", computerChoice);

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
}
