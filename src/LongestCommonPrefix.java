/*
14.Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Yun-Chi Hsiao
Jul.14th.2021
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        String temp = "";
        int i = 0, j = 0;

        for (i = 0; i < strs[0].length(); i++) {
            temp = strs[0].substring(0, i+1);
            for (j = 0; j < strs.length; j++) {
                if (i < strs[j].length() && strs[j].substring(0, i+1).equals(temp) ) {
                } else {
                    return ans;
                }
            }
            ans = strs[0].substring(0, i+1);
        }

        return ans;
    }
}
