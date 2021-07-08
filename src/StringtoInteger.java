/*
8.String to Integer (atoi)
Implement the myAtoi(string s) function,
which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

Yun-Chi Hsiao
Jul.8th.2021
 */
public class StringtoInteger {

    public int myAtoi(String s) {

        int ans = 0, prevAns;
        char positive = '+';
        char negative = '-';

        s = s.trim();
        if (s.length() == 0) return 0;

        boolean isNegative = (s.charAt(0) == negative);
        int index = (isNegative || s.charAt(0) == positive) ? 1 : 0;

        while (index < s.length()) {

            if (s.charAt(index)>='0' && s.charAt(index)<='9') {
                prevAns = ans;
                ans = ans*10 + (s.charAt(index) - '0');
            } else {
                break;
            }

            if (ans/10 != prevAns) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            index++;
        }

        return isNegative ? -1*ans : ans;
    }
}
