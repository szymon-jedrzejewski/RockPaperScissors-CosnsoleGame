package RockPaperScissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private Game game;
    @Before
    public void setUp() {

        game = new Game();

    }

    @Test
    public void tieTest(){

        int actual = game.compareChoices(0,0);
        int expected = 0;
        assertEquals(expected, actual );

    }
}
