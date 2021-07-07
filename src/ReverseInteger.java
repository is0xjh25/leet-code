/*
7.Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Yun-Chi Hsiao
Jul.7th.2021
 */

public class ReverseInteger {

    public int reverse(int x) {

        int ans = 0;

        while(x != 0) {

            int digit = x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            ans = ans * 10 + digit;

        }

        return ans;
    }
}
