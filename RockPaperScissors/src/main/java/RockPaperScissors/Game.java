package RockPaperScissors;


public class Game {

    private int playerWins = 0;
    private int computerWins = 0;
    private String playerName;

    private Computer computer = new Computer();
    private Player player = new Player();
    private  Display display = new Display();

    //method comparing choices and returning the winner of round
    private int compareChoices(int computerChoice, int playerChoice) {

        if (computerChoice == playerChoice) {
            return 0;
        }
        switch (playerChoice) {
            case 1:
                //it's same as if-else
                //before "?" is condition
                // after are values that will be returned
                // if condition is true 1 is returned
                //if condition is false -1 is returned
                return (computerChoice == 3 ? 1 : -1);
            case 2:
                return (computerChoice == 1 ? 1 : -1);
            case 3:
                return (computerChoice == 2 ? 1 : -1);
        }
        return 0;
    }
    public void startGame(){
        display.welcomeMsg();
        System.out.println("Enter player name.");
        playerName = player.enterName();
        gameLogic();
    }

    //method contains everything to start the game
    private void gameLogic() {

        display.displayPlayerName(playerName);
        System.out.println();
        System.out.println("How many games do you want to play? Game format is 'Best Of'");
        //int howMany = player.howManyGamesDoYouWantToPlay();
        int gamesNeededToWin = (player.howManyGamesDoYouWantToPlay()+1)/2;

        System.out.println("Select rock, paper or scissors.");
        if(isPlayerAWinner(gamesNeededToWin)){
            display.winnerOfTheGameMsg(playerName);
            if (player.playAgain()){
                computerWins = 0;
                playerWins = 0;
                gameLogic();
            }
        }else {
            display.winnerOfTheGameMsg("Computer");
            if (player.playAgain()){
                computerWins = 0;
                playerWins = 0;
                gameLogic();
            }
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

    /**
     * method is used to tell who won whole game
     * @param gamesNeededToWin - it tells how many games player decided to play
     * @return doesPlayerWon - returns boolean value who won
     */
    private boolean isPlayerAWinner(int gamesNeededToWin){

        boolean loopCondition = true;
        boolean doesPlayerWon = false;

        while (loopCondition) {

            winnerOfTheRound();
            display.displayGameStatus(playerWins, computerWins);

            if (playerWins == gamesNeededToWin) {

                doesPlayerWon = true;
                loopCondition = false;

            }else if (computerWins == gamesNeededToWin){

                loopCondition = false;
            }
        }
        return doesPlayerWon;
    }

    //method tells who won round
    private void winnerOfTheRound() {

        int playerChoice = player.getChoice();
        display.displayChoice(playerName, playerChoice);

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
                display.winnerOfTheRound(playerName);
                playerWins++;
                break;
            case -1:
                //display()
                display.winnerOfTheRound("Computer");
                computerWins++;
                break;
        }
    }
}
