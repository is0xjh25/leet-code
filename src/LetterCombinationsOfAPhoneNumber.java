/*
17.Letter Combinations of a Phone Number

Given a string containing digits from 2-9 inclusive,
return all possible letter combinations that the number could represent.
Return the answer in any order.

Yun-Chi Hsiao
Jul.17th.2021
 */

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    String[] array;

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        if(digits.length() == 0) return list;
        array= new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        recursion(digits, new StringBuilder(), list);
        return list;
    }

    void recursion(String digits, StringBuilder temp, List<String> list) {

        if (digits.length() == 0) {
            list.add(temp.toString());
            return ;
        }

        char[] str = array[digits.charAt(0)-'0'].toCharArray();
        for (char i : str) {
            temp.append(i);
            recursion(digits.substring(1), temp, list);
            temp.delete(temp.length()-1,temp.length());
        }
    }
}
