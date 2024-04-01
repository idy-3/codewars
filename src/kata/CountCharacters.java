package kata;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacters {

    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> countTally = new HashMap<>();

        for (Character c : str.toCharArray()) {
            countTally.merge(c, 1, Integer::sum);
        }
        return countTally;
    }

    public static Map<Character, Integer> count1(String str) {

        Map<Character, Integer> countTally = new HashMap<>();

        for (Character c : str.toCharArray()) {
            countTally.put(c, countTally.getOrDefault(c, 0) + 1);
        }
        return countTally;
    }

    public static Map<Character, Integer> count2(String str) {
        return str
                .chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.toMap(character -> character, character -> 1, Integer::sum));
    }
}
