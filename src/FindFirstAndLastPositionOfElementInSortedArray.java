/*
34.Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

Yun-Chi Hsiao
Jul.25th.2021
 */

public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) return new int[]{-1, -1};

        int temp = binarySearch(nums, target, 0, (nums.length-1)/2, nums.length-1);

        if (temp == -1) return new int[] {-1, -1};

        int add = temp;
        int minus = temp;

        while (add < nums.length && nums[add] == target) add++;
        while (minus > -1 && nums[minus] == target) minus--;

        return new int[]{minus+1, add-1};
    }

    private int binarySearch(int[] nums, int target, int left, int mid, int right) {

        if (nums[left] == target) return left;
        if (nums[mid] == target) return mid;
        if (nums[right] == target) return right;

        if (target<nums[left] || target>nums[right]) return -1;
        if (left+1 == right-1) return -1;

        if (target > nums[mid]) {
            left = mid + 1;
            right = right - 1;
            mid = (left+right) / 2;
        } else if (target < nums[mid]) {
            right = mid - 1;
            left = left + 1;
            mid = (left+right) / 2;
        }

        return binarySearch(nums, target, left, mid, right);
    }
}
