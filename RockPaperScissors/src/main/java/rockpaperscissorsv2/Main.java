package rockpaperscissorsv2;

public class Main {
    public static void main(String[] args) throws Exception {
        HumanPlayer humanPlayer = new HumanPlayer();
        Computer computer =  new Computer();
        humanPlayer.playerChoice();
        System.out.println(humanPlayer.playerChoice());
        System.out.println();
        System.out.println(computer.playerChoice());
    }
}
