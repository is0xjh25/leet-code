/*
47.Permutations II
Given a collection of numbers, nums, that might contain duplicates,
return all possible unique permutations in any order.

Yun-Chi Hsiao
Jul.29th.2021
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {

        LinkedList<List<Integer>> r = new LinkedList<>();
        r.add(new ArrayList<Integer>());

        for(int i=0; i<nums.length; i++){
            int n = r.size();
            for(int j=0; j<n; j++){
                List<Integer> list = r.poll();
                for(int k=0; k<=list.size(); k++){
                    if(k > 0 && list.get(k-1) == nums[i])
                        break;
                    ArrayList<Integer> t = new ArrayList<>(list);
                    t.add(k, nums[i]);
                    r.offer(t);
                }
            }
        }

        return r;
    }
}
