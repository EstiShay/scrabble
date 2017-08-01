/**
 * Created by Guest on 8/1/17.
 */
import java.util.Map;
import java.util.HashMap;

public class Scrabble {

    public Integer calculateScore(String play) {
        Map<String, Integer> lettersPoints = new HashMap<String, Integer>();
        lettersPoints.put("a", 1);
        lettersPoints.put("e", 1);
        lettersPoints.put("i", 1);
        lettersPoints.put("o", 1);
        lettersPoints.put("u", 1);
        lettersPoints.put("l", 1);
        lettersPoints.put("n", 1);
        lettersPoints.put("r", 1);
        lettersPoints.put("s", 1);
        lettersPoints.put("t", 1);
        lettersPoints.put("d", 2);
        lettersPoints.put("g", 2);
        lettersPoints.put("b", 3);
        lettersPoints.put("c", 3);
        lettersPoints.put("m", 3);
        lettersPoints.put("p", 3);
        lettersPoints.put("f", 4);
        lettersPoints.put("h", 4);
        lettersPoints.put("v", 4);
        lettersPoints.put("w", 4);
        lettersPoints.put("y", 4);
        lettersPoints.put("k", 5);
        lettersPoints.put("j", 8);
        lettersPoints.put("x", 8);
        lettersPoints.put("q", 10);
        lettersPoints.put("z", 10);

        Integer result = 0;

        char[] letters = play.toCharArray();

        for ( char individualChar : letters) {
            String charToString = Character.toString(individualChar);
            Integer score = lettersPoints.get(charToString);
            result += score;
        }

        return result;
    }

}
