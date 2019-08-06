package rockpaperscissorsv2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Scanner;

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
        humanPlayer = new HumanPlayer();
        //mockedScanner = new Scanner(System.in);
    }

//    @Test
//    public void tieTestRockVsRock(){
//        RPS actual = judge.compareChoices(RPS.ROCK, RPS.ROCK);
//        RPS expected = RPS.TIE;
//        assertEquals(expected, actual );
//    }
//
//    @Test
//    public void tieTestPaperVsPaper(){
//        RPS actual = judge.compareChoices(RPS.PAPER, RPS.PAPER);
//        RPS expected = RPS.TIE;
//        assertEquals(expected, actual );
//    }
//    @Test
//    public void tieTestScissorsVsScissors(){
//        RPS actual = judge.compareChoices(RPS.SCISSORS, RPS.SCISSORS);
//        RPS expected = RPS.TIE;
//        assertEquals(expected, actual );
//    }
//
//    @Test
//    public void playerOneShouldWInPaperVsRock(){
//        RPS actual = judge.compareChoices(RPS.PAPER, RPS.ROCK);
//        RPS expected = RPS.PLAYER_ONE_WON;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void playerOneShouldWinOneShouldWinRockVsScissors(){
//        RPS actual = judge.compareChoices(RPS.ROCK, RPS.SCISSORS);
//        RPS expected = RPS.PLAYER_ONE_WON;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void playerOneShouldWinOneShouldWinScissorsVsPaper(){
//        RPS actual = judge.compareChoices(RPS.SCISSORS, RPS.PAPER);
//        RPS expected = RPS.PLAYER_ONE_WON;
//        assertEquals(expected, actual);
//    }
}
