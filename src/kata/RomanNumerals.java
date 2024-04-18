package kata;

import java.util.HashMap;

public class RomanNumerals {

    public static int romanToInt(String s) {

        var charMap = new HashMap<Character, Integer>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        Character prevChar = null;
        var result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            var currentChar = s.charAt(i);
            if (charMap.containsKey(currentChar)) {
                result += charMap.get(currentChar);
            }

            if (prevChar != null) {
                if ((prevChar == 'V' || prevChar == 'X') && currentChar == 'I') {
                    result -= charMap.get(currentChar) * 2;
                } else if ((prevChar == 'L' || prevChar == 'C') && currentChar == 'X') {
                    result -= charMap.get(currentChar) * 2;
                } else if ((prevChar == 'D' || prevChar == 'M') && currentChar == 'C') {
                    result -= charMap.get(currentChar) * 2;
                }
            }

            prevChar = s.charAt(i);
        }

        return result;
    }

    public static int romanToInt1(String s) {

        var charMap = new HashMap<Character, Integer>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        var result = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && charMap.get(s.charAt(i)) < charMap.get(s.charAt(i + 1))) {
                result -= charMap.get(s.charAt(i));
            } else {
                result += charMap.get(s.charAt(i));
            }
        }

        return result;
    }
}
