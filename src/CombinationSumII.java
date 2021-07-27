/*
40.Combination Sum II
Given a collection of candidate numbers (candidates) and a target number (target),
find all unique combinations in candidates where the candidate numbers sum to target.
Each number in candidates may only be used once in the combination.

Yun-Chi Hsiao
Jul.27th.2021
 */

import java.util.*;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        recursion(lists,temp,candidates,target,0);
        return lists;
    }

    void recursion(List<List<Integer>> lists,List<Integer> temp,
                   int[] nums,int target,int start) {
        if (target < 0)
            return ;
        if (target == 0) {
            lists.add(new ArrayList(temp));
            return ;
        } else {
            for(int i=start;i<nums.length;i++) {
                if(i > start && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                recursion(lists,temp,nums,target-nums[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
