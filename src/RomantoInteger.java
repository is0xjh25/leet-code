/*
13.Roman to Integer
Given a roman numeral, convert it to an integer.

Yun-Chi Hsiao
Jul.13th.2021
 */

public class RomantoInteger {

    public int romanToInt(String s) {

        int ans = 0, prev = 0;
        char[] letters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int [] values = {1, 5, 10, 50, 100, 500, 1000};

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (s.charAt(i) == letters[j]) {
                    if (values[j] > prev) ans -= 2*prev;
                    prev = values[j];
                    ans += values[j];
                    break;
                }
            }
        }

        return ans;
    }
}
