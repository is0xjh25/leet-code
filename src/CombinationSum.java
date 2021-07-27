/*
39.Combination Sum
Given an array of distinct integers candidates and a target integer target,
return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.

Yun-Chi Hsiao
Jul.27th.2021
 */

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0 , target, new ArrayList() , result);
        return result;
    }

    private void backtrack(int[] cand , int start , int target, List<Integer> list , List<List<Integer>> result) {
        if (target < 0)
            return;
        if (target == 0)
            result.add(new ArrayList(list));
        for (int i = start ; i < cand.length ; i++){
            list.add(cand[i]);
            backtrack(cand , i , target - cand[i] , list , result);
            list.remove(list.size() - 1);
        }
    }
}
