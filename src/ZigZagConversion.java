/*
6.ZigZag Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)
        P   A   H   N
        A P L S I I G
        Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);

Yun-Chi Hsiao
Jul.6th.2021
 */

public class ZigZagConversion {

    public String convert(String s, int numRows) {

        String[] rows = new String[numRows];
        int div = numRows * 2 - 2;
        String ans = "";

        if (numRows == 1) return s;

        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        for (int i = 0;  i < s.length(); i++) {
            if (i%div < numRows) {
                rows[i%div] = rows[i%div].concat(s.substring(i, i+1));
            } else {
                rows[2*numRows-i%div-2] = rows[2*numRows-i%div-2].concat(s.substring(i, i+1));
            }
        }

        for (int i = 0; i < numRows; i++) {
            ans += rows[i];
        }

        return ans;
    }
}
