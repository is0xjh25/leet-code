/*
26.Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.

Yun-Chi Hsiao
Jul.22nd.2021
 */

public class RemoveDuplicatesFormSortedArray {

    public int removeDuplicates(int[] nums) {

        int current = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != current) {
                current = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
