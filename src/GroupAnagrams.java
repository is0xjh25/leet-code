/*
49.Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Yun-Chi Hsiao
Jul.30th.2021
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            String s = sortStr(strs[i]);// sort the string |  every anagram will return same string
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>()); // psuh that sorted string as key
            }
            map.get(s).add(strs[i]);// add in the list
        }

        for(List<String> list : map.values()){
            result.add(list);
        }

        return result;
    }

    public String sortStr(String s){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        String s1 = new String(c);
        return s1;
    }
}
