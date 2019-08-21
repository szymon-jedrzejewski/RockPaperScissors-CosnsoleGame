package rockpaperscissorsv2;

public class HumanPlayer extends Player {
    private HumanInterfaceDevice humInDe = new HumanInterfaceDevice();
    private RPS assignedValue;
    private String name;

    public HumanPlayer(){
        name = "player1";
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

}
