package rockpaperscissorsv2;

public class HumanPlayer extends Player {
    //InputOutput input = new InputOutput();
    String input = new Input().getPlayerChoice();

    String playerSel = input;

    int choiceNum;

    @Override
    public RPS playerChoice() throws Exception {

        if (playerSel.equals("rock")) {
            return RPS.ROCK;
        }else if (playerSel.equals("paper")){
            return RPS.PAPER;
        }else if (playerSel.equals("scissors")){
            return RPS.SCISSORS;
        }else {
            playerChoice();
            //System.out.println("bład");
        }
        throw new Exception();
    }
}
