package kata;

import java.util.HashMap;

public class DuplicateEncoder {
//    The goal of this exercise is to convert a string to a new string where each
//    character in the new string is "(" if that character appears only once in
//    the original string, or ")" if that character appears more than once in
//    the original string. Ignore capitalization when determining if a character
//    is a duplicate.
//
//      "din"      =>  "((("
//      "recede"   =>  "()()()"
//      "Success"  =>  ")())())"
//      "(( @"     =>  "))(("

    public static String encode(String word) {
        var countTally = new HashMap<Character, Integer>();
        var strBuilder = new StringBuilder();

        for (Character c : word.toLowerCase().toCharArray()) {
            countTally.merge(c, 1, Integer::sum);
        }

        for (Character c : word.toLowerCase().toCharArray()) {
            if (countTally.get(c) == 1) {
                strBuilder.append("(");
            } else {
                strBuilder.append(")");
            }
        }

        return strBuilder.toString();
    }
}
