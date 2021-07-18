/*
18.Four Sum
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Yun-Chi Hsiao
Jul.18th.2021
 */

import java.util.*;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 4) return result;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-3; i++) {

            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = i+1; j < nums.length-2; j++) {

                int ask = target - nums[i] - nums[j];
                int start = j + 1;
                int end = nums.length - 1;

                while(start < end) {
                    if(nums[start] + nums[end] == ask) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[++start]);
                    }
                    if(nums[start] + nums[end] < ask) {
                        start ++;
                    }
                    if(nums[start] + nums[end] > ask) {
                        end--;
                    }
                }
            }
        }

        Set<List<Integer>> set = new HashSet<>(result);
        result.clear();
        result.addAll(set);

        return result;
    }
}
