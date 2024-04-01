package kata;

import java.util.HashMap;

public class Scramblies {
//    Complete the function scramble(str1, str2) that returns true if a
//    portion of str1 characters can be rearranged to match str2, otherwise returns false.
//      scramble('rkqodlw', 'world') ==> True
//      scramble('cedewaraaossoqqyt', 'codewars') ==> True
//      scramble('katas', 'steak') ==> False

    public static boolean scramble(String str1, String str2) {

        if (str1.length() < str2.length()) return false;

        var str1Tally = new HashMap<Character, Integer>();
        var str2Tally = new HashMap<Character, Integer>();

        for (char c : str1.toCharArray()) str1Tally.merge(c, 1, Integer::sum);
        for (char c : str2.toCharArray()) str2Tally.merge(c, 1, Integer::sum);

        for (char c : str2.toCharArray()) {
            if (str1Tally.getOrDefault(c, 0) < (str2Tally.get(c)))
                return false;
        }

        return true;
    }

    public static boolean scramble1(String str1, String str2) {

        var strBuilder = new StringBuilder(str1);

        for (String s : str2.split("")) {
            try {
                strBuilder.deleteCharAt(strBuilder.indexOf(s));
            } catch (StringIndexOutOfBoundsException e) {
                return false;
            }
        }

        return true;
    }
}
