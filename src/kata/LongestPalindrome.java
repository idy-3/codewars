package kata;

public class LongestPalindrome {
//    Given a string s, return the longest palindromic substring in s
//    Example 1:
//
//      Input: s = "babad"
//      Output: "bab"
//      Explanation: "aba" is also a valid answer.

    public static String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;

        var maxLen = 1;
        String maxStr = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j-i > maxLen && isPalindrome(s.substring(i, j))){
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static String longestPalindrome1(String s) {
        if (s.isEmpty()) {
            return "";
        }

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;

        // Single characters are always palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length > 2
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        return s.substring(start, start + maxLength);

    }
}
