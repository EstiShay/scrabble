import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {

    @Test
    public void calculateScore__returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForTwoLetterWord_2 () throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("no"));
    }

    @Test
    public void calculateScore_returnsScoreForLongWord_25 () throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 25;
        assertEquals(expected, testScrabble.calculateScore("quickly"));
    }

}