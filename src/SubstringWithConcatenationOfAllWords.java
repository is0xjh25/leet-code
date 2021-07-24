/*
30.Substring with Concatenation of All Words
You are given a string s and an array of strings words of the same length.
Return all starting indices of substring(s) in s that is a concatenation of each word in words exactly once,
in any order, and without any intervening characters.

Yun-Chi Hsiao
Jul.24th.2021
 */

import java.util.*;

public class SubstringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> resultList = new ArrayList<Integer>();
        if( s == null || s.length() < 1 || words.length < 1)
            return resultList;

        Map<String, Integer> wordToFreq = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++) {
            wordToFreq.put(words[i], wordToFreq.getOrDefault(words[i], 0) + 1);
        }

        int length = words[0].length();
        String str[] = new String[s.length()];
        for(int i = 0; i < length; i++) {
            // initialize slide window
            int begin = i;
            Map<String, Integer> current = new HashMap<String, Integer>();
            int size = 0;

            for(int j = i; j <= s.length() - length; j += length) { // slide by the length of word
                str[j] = s.substring(j, j + length);
                if( wordToFreq.containsKey(str[j]) ) { // update slide window
                    begin = begin == -1 ? j : begin;
                    current.put(str[j], current.getOrDefault(str[j], 0) + 1);
                    size++;
                    if( size == words.length ) {
                        if( current.equals(wordToFreq) )
                            resultList.add(begin);
                        current.put(str[begin], current.get(str[begin]) - 1);
                        size--;
                        begin += length;
                    }
                } else { // reset the slide window
                    begin = -1;
                    current.clear();
                    size = 0;
                }
            }
        }
        return resultList;
    }
}
