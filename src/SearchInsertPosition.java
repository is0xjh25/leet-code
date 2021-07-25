/*
35.Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Yun-Chi Hsiao
Jul.25th.2021
 */

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int mid = (nums.length-1)/2;
        int right = nums.length-1;

        while (true) {

            if (target <= nums[left]) return left;
            if (target == nums[mid]) return mid;
            if (target == nums[right]) return right;
            if (target > nums[right]) return right+1;
            if (left == mid) return left+1;

            if (target < nums[mid]) {
                left += 1;
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
                right -= 1;
            }

            mid = (left+right) / 2;
        }
    }
}
