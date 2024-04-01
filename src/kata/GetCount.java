package kata;

public class GetCount {
//        Return the number (count) of vowels in the given string.
//          We will consider a, e, i, o, u as vowels for this kata.HighAndLow (but not y).

    private static final String VOWELS = "aeiou";

    public static int solution(String str) {
        var count = 0;

        // -> solution 1

        if (str.isBlank()) {
            return 0;
        }

        for (var c : str.split("")) {
            if (VOWELS.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static int solution2(String str) {
        // -> solution 2
        return (int) str.chars().filter(c -> VOWELS.indexOf(c) >= 0).count();

    }

    public static int solution3(String str) {
        // -> solution 3
        return (int) str.chars().mapToObj(i -> (char) i).filter(i -> VOWELS.contains(String.valueOf(i))).count();

    }
}
