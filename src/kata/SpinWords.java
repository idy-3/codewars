package kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {


    public static String solution(String sentence) {
        var result = new StringBuilder();

        for (var s : sentence.split(" ")) {
            if (s.length() > 4) {
                result.append(new StringBuilder(s).reverse());
            } else {
                result.append(s);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static String solution1(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

    public static String solution2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() > 4 ? new StringBuilder(s).reverse().toString() : s)
                .collect(Collectors.joining(" "));
    }

    public static String solution3(String sentence) {
        for (var s : sentence.split(" ")) {
            if (s.length() > 4) {
                sentence = sentence.replace(s, new StringBuffer(s).reverse());
            }
        }
        return sentence;
    }
}
