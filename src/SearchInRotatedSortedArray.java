/*
33.Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).
Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Yun-Chi Hsiao
Jul.25th.2021
 */

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int head = 0;
        int tail = nums.length-1;

        while (head <= tail) {

            if (target == nums[head]) return head;
            if (target == nums[tail]) return tail;

            if (target<nums[head] && target>nums[tail]) {
                return -1;
            }

            head++;
            tail--;
        }

        return -1;
    }
}
