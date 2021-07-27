/*
41.First Missing Positive
Given an unsorted integer array nums, find the smallest missing positive integer.

Yun-Chi Hsiao
Jul.27th.2021
 */

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        int i = 0;
        int n = nums.length;

        // handle case of a single-element array
        if (n == 1) {
            if (nums[i] == 1) return 2;
            else return 1;
        }

        // try to place numbers in their correct indices
        while (i < n) {
            // ignore numbers out of range (negative numbers and numbers greater than length of the array)
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // loop through the array again
        // find the first number that is not at its correct index
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
