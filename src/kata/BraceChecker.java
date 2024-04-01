package kata;

import java.util.ArrayDeque;

public class BraceChecker {

    public static boolean isValid(String braces) {

        if (braces == null) {
            return false;
        }

        var strStack = new ArrayDeque<Character>();

        strStack.push(braces.charAt(0));
        braces = new StringBuilder(braces).deleteCharAt(0).toString();

        for (char b : braces.toCharArray()) {
            if (strStack.isEmpty()) {
                strStack.push(b);
                continue;
            }
            if (strStack.peek().equals('(') && b == ')') {
                strStack.pop();
            } else if (strStack.peek().equals('[') && b == ']') {
                strStack.pop();
            } else if (strStack.peek().equals('{') && b == '}') {
                strStack.pop();
            } else {
                strStack.push(b);
            }
        }

        return strStack.isEmpty();
    }

    public static boolean isValid1(String braces) {
        var strStack = new ArrayDeque<Character>();

        for (char b : braces.toCharArray()) {
            if (!strStack.isEmpty() && strStack.peek() == '(' && b == ')') {
                strStack.pop();
            } else if (!strStack.isEmpty() && strStack.peek() == '[' && b == ']') {
                strStack.pop();
            } else if (!strStack.isEmpty() && strStack.peek() == '{' && b == '}') {
                strStack.pop();
            } else {
                strStack.push(b);
            }
        }

        return strStack.isEmpty();
    }

    public static boolean isValid2(String braces) {
        var s = new ArrayDeque<Character>();

        for (char c : braces.toCharArray()) {

            if (!s.isEmpty() && isClosing(s.peek(), c)) {
                s.pop();
            } else {
                s.push(c);
            }

        }

        return s.isEmpty();
    }

    public static boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }

}
