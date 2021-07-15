/*
15.Three Sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Yun-Chi Hsiao
Jul.15th.2021
 */

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);

        for (int i = 0 ; i < nums.length-2 ; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int ask = -nums[i];
            int start = i + 1;
            int end = nums.length -1;

            while(start < end) {
                if(nums[start] + nums[end] == ask) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
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

        return result;
    }
}
