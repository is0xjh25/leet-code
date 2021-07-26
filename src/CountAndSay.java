/*
38.Count and Say
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
    countAndSay(1) = "1"
    countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1),
    which is then converted into a different digit string.

Yun-Chi Hsiao
Jul.26th.2021
 */
public class CountAndSay {

    public String countAndSay(int n) {

        StringBuilder s = new StringBuilder();
        s.append('1');
        int i = 1, j = 0, count = 0;
        char last = s.charAt(0);

        while (i < n) {

            StringBuilder temp = new StringBuilder();
            last = s.charAt(0);
            count = 1;
            j = 1;

            while (j < s.length()) {

                if (s.charAt(j) == last) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(last);
                    count = 1;
                    last = s.charAt(j);
                }

                j++;
            }

            temp.append(count);
            temp.append(last);
            s = temp;
            i++;
        }

        return s.toString();
    }
}
