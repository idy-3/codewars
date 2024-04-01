package kata;

import java.util.Stack;

public class BraceChecker {

    public static boolean isValid(String braces) {

        if (braces == null) {
         return false;
        }

        Stack<Character> strStack = new Stack<>();

        strStack.push(braces.charAt(0));
        braces = new StringBuilder(braces).deleteCharAt(0).toString();

        for (char b : braces.toCharArray()){
            if (strStack.isEmpty()) {
                strStack.push(b);
                continue;
            }
             if (strStack.peek() == '(' && b == ')'){
                 strStack.pop();
             }else if (strStack.peek() == '[' && b == ']') {
                 strStack.pop();
             }else if (strStack.peek() == '{' && b == '}') {
                 strStack.pop();
             }else {
                strStack.push(b);
             }
        }

        return strStack.isEmpty();
    }

    public static boolean isValid1(String braces) {
        Stack<Character> strStack = new Stack<>();

        for (char b : braces.toCharArray()){
            if (!strStack.isEmpty() && strStack.peek() == '(' && b == ')'){
                strStack.pop();
            }else if (!strStack.isEmpty() && strStack.peek() == '[' && b == ']') {
                strStack.pop();
            }else if (!strStack.isEmpty() && strStack.peek() == '{' && b == '}') {
                strStack.pop();
            }else {
                strStack.push(b);
            }
        }

        return strStack.isEmpty();
    }

    public static boolean isValid2(String braces){
        Stack<Character> s = new Stack<>();

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
