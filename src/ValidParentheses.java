/*
20.Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Yun-Chi Hsiao
Jul.20th.2021
 */

public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() == 1) return false;
        if (s.length() == 0) return true;
        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') return false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                continue;
            } else if ((s.charAt(i) == '}' && s.charAt(i-1) == '{') ||
                    (s.charAt(i) == ']' && s.charAt(i-1) == '[') ||
                    (s.charAt(i) == ')' && s.charAt(i-1) == '(')) {
                return isValid(s.substring(0, i-1)+s.substring(i+1));
            } else {
                return false;
            }
        }

        return false;
    }
}
