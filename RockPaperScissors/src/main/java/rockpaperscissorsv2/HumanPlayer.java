package rockpaperscissorsv2;

public class HumanPlayer extends Player {
    private HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    private RPS assignedValue;
    private String name;

    public HumanPlayer(){
        name = "player1";
    }

    public String playerName(){
        name = humInDe.enterPlayerName();
        return name;
    }

    public String getName(){
        return name;
    }

    @Override
    public RPS playerChoice() {
        String playerChoice;
        boolean isNotCorrect = true;
        while (isNotCorrect) {
            playerChoice = humInDe.getPlayerChoice();
            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                assignPlayerChoice(playerChoice);
                isNotCorrect = false;
            } else {
                humInDe.incorrectInputMsg("input!");
                isNotCorrect = true;
            }
        }
        return assignedValue;
    }

    private void assignPlayerChoice(String playerChoice) {
        switch (playerChoice) {
            case "rock":
                assignedValue = RPS.ROCK;
                break;
            case "paper":
                assignedValue = RPS.PAPER;
                break;
            case "scissors":
                assignedValue = RPS.SCISSORS;
                break;
        }
    }

    public int numberOfGame() {
        boolean isNotCorrect = true;
        int numberOfGame = -1;
        humInDe.numbersMustBeOddMsg();
        while (isNotCorrect) {
            numberOfGame = humInDe.getNumbersOfGame();
            if (numberOfGame % 2 == 0) {
                humInDe.incorrectInputMsg("number of games!");
                isNotCorrect = true;
            }else{
                isNotCorrect = false;
            }
        }
        return numberOfGame;
    }
}
