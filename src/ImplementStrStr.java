/*
28.Implement strStr()
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Yun-Chi Hsiao
Jul.23rd.2021
 */

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        for (int i = 0; i < haystack.length(); i++) {

            int temp = i;

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(temp) != needle.charAt(j)) break;
                if (j == needle.length()-1) return i;
                if (++temp == haystack.length()) return -1;
            }
        }

        return -1;
    }
}
