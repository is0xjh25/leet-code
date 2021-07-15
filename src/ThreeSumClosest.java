/*
16.Three Sum Closest
Given an array nums of n integers and an integer target,
find three integers in nums such that the sum is closest to target.
Return the sum of the three integers. You may assume that each input would have exactly one solution.

Yun-Chi Hsiao
Jul.16th.2021
 */

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start < end) {
                if (nums[i]+nums[start]+nums[end] == target) return target;
                if (Math.abs(nums[i]+nums[start]+nums[end]-target) < Math.abs(ans-target))
                    ans = nums[i]+nums[start]+nums[end];
                if (nums[i]+nums[start]+nums[end] < target) start++;
                if (nums[i]+nums[start]+nums[end] > target) end--;
            }
        }

        return ans;
    }
}
