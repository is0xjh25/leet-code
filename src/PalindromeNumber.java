/*
9.Palindrome Number
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Yun-Chi Hsiao
Jul.9th.2021
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int length = 0;
        long temp = 1;

        while (temp <= x) {
            length++;
            temp *= 10;
        }

        int check = length/2;
        int y = x;

        while (check > 0) {
            if (x%10 != y/(int)Math.pow(10, length-1)) return false;
            y %= Math.pow(10, length-1);
            length--;
            x/=10;
            check--;
        }

        return true;
    }
}
