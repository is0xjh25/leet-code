/*
22.Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Yun-Chi Hsiao
Jul.21st.2021
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList();

        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left : generateParenthesis(c))
                    for (String right : generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }

        return ans;
    }
}
