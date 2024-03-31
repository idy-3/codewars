package kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TenMinutesWalk {

//    You live in the city of Cartesia where all roads are laid out in a perfect grid.
//    You arrived ten minutes too early to an appointment, so you decided to take
//    the opportunity to go for a short walk. The city provides its citizens with a
//    Walk Generating App on their phones -- everytime you press the button it
//    sends you an array of one-letter strings representing directions to walk (eg.
//    ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction)
//    and you know it takes you one minute to traverse one city block, so create a
//    function that will return true if the walk the app gives you will take you
//    exactly ten minutes (you don't want to be early or late!) and will, of course,
//    return you to your starting point. Return false otherwise.

    public static boolean isValid(char[] walk) {

        Map<Character, Integer> countTally = new HashMap<>();

        for (Character w : walk) {
            countTally.merge(w, 1, Integer::sum);
        }

        return walk.length == 10 && Objects.equals(
                countTally.getOrDefault('n', 0),
                countTally.getOrDefault('s', 0)
        ) && Objects.equals(
                countTally.getOrDefault('w', 0),
                countTally.getOrDefault('e', 0));
    }
}
