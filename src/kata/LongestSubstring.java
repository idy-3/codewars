package kata;

import java.util.HashMap;

public class LongestSubstring {
//    Given a string s, find the length of the longest substring
//    without repeating characters.
//
//   Example 1:
//
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
//
//    Example 2:
//
//    Input: s = "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.


    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstring1(String s) {
        var left = 0;
        var maxLength = 0;
        var count = new HashMap<Character, Integer>();

        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            count.put(rightChar, 1 + count.getOrDefault(rightChar, 0));
            while (count.get(rightChar) > 1){
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
