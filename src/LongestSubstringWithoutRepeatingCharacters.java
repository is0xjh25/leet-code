/*
3.Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Yun-Chi Hsiao
Jul.3rd.2021
 */

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        ArrayList<Character> dict = new ArrayList<>();
        int i, j, max = 0;

        for (i = 0; i < s.length(); i++) {

            dict.add(s.charAt(i));

            for (j = i+1; j < s.length(); j++) {
                if (!dict.contains(s.charAt(j))) {
                    dict.add(s.charAt(j));
                } else {
                    break;
                }
            }

            max = dict.size() > max ? dict.size() : max;
            dict.clear();

            if (s.length() - i < max) {
                break;
            }
        }

        return max;
    }
}
