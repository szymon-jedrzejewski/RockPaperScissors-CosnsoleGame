package rockpaperscissorsv2;

public class HumanPlayer extends Player {
    private HumanInterfaceDevice humanInterfaceDevice;
    private Choice assignedValue;
    private String name;

    public HumanPlayer(HumanInterfaceDevice humanInterfaceDevice){
        name = "player1";
        this.humanInterfaceDevice = humanInterfaceDevice;
    }

    @Override
    public Choice playerChoice() {
        String playerChoice;
        boolean isNotCorrect = true;
        while (isNotCorrect) {
            playerChoice = humanInterfaceDevice.getPlayerChoice();
            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                assignPlayerChoice(playerChoice);
                isNotCorrect = false;
            } else {
                humanInterfaceDevice.displayIncorrectInputMassage("input!");
                isNotCorrect = true;
            }
        }
        return assignedValue;
    }

    private void assignPlayerChoice(String playerChoice) {
        switch (playerChoice) {
            case "rock":
                assignedValue = Choice.ROCK;
                break;
            case "paper":
                assignedValue = Choice.PAPER;
                break;
            case "scissors":
                assignedValue = Choice.SCISSORS;
                break;
        }
    }

}
