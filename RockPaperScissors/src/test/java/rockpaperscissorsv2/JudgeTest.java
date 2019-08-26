package rockpaperscissorsv2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JudgeTest
{
    /**
     * Rigorous Test :-)
     */
    private Judge judge;
    private Player humanPlayer;
    //@Mock
   // Scanner mockedScanner;

    @Before
    public void setUp() {
        judge = new Judge();
        //humanPlayer = new HumanPlayer();
        //mockedScanner = new Scanner(System.in);
    }

//    @Test
//    public void tieTestRockVsRock(){
//        RoundResult actual = judge.compareChoices(Choice.ROCK, Choice.ROCK);
//        RoundResult expected = RoundResult.TIE;
//        assertEquals(expected, actual );
//    }
//
//    @Test
//    public void tieTestPaperVsPaper(){
//        RoundResult actual = judge.compareChoices(Choice.PAPER, Choice.PAPER);
//        RoundResult expected = RoundResult.TIE;
//        assertEquals(expected, actual );
//    }
//    @Test
//    public void tieTestScissorsVsScissors(){
//        RoundResult actual = judge.compareChoices(Choice.SCISSORS, Choice.SCISSORS);
//        RoundResult expected = RoundResult.TIE;
//        assertEquals(expected, actual );
//    }
//
//    @Test
//    public void playerOneShouldWInPaperVsRock(){
//        RoundResult actual = judge.compareChoices(Choice.PAPER, Choice.ROCK);
//        RoundResult expected = RoundResult.PLAYER_ONE_WON;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void playerOneShouldWinOneShouldWinRockVsScissors(){
//        RoundResult actual = judge.compareChoices(Choice.ROCK, Choice.SCISSORS);
//        RoundResult expected = RoundResult.PLAYER_ONE_WON;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void playerOneShouldWinOneShouldWinScissorsVsPaper(){
//        RoundResult actual = judge.compareChoices(Choice.SCISSORS, Choice.PAPER);
//        RoundResult expected = RoundResult.PLAYER_ONE_WON;
//        assertEquals(expected, actual);
//    }
}
