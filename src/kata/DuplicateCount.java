package kata;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCount {
    // Write a function that will return the count of distinct case-insensitive
    // alphabetic characters and numeric digits that occur more than once in
    // the input string. The input string can be assumed to contain only
    // alphabets (both uppercase and lowercase) and numeric digits.
    //Example
    //      "abcde" -> 0 # no characters repeats more than once
    //      "aabbcde" -> 2 # 'a' and 'b'
    //      "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)

    public static int solution(String text) {
        // -> solution 1
        Map<Character, Integer> countTally = new HashMap<>();
        int total = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (countTally.get(text.charAt(i)) == null) {
                countTally.put(text.charAt(i), 1);
            } else {
                countTally.put(text.charAt(i), countTally.get(text.charAt(i)) + 1);
            }
        }

        for (int count : countTally.values()) {
            if (count > 1) {
                total++;
            }
        }
        return total;
    }

    public static int solution2(String text) {
        // -> solution 2
        return (int) text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting())).values().stream().filter(e -> e > 1).count();

    }
}
