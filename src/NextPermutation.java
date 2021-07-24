/*
31.Next Permutation
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

Yun-Chi Hsiao
Jul.24th.2021
 */

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length<=1) return;

        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;

        if (i >= 0) {
            int j = nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }

        reverse(nums,i+1,nums.length-1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i,int j) {
        while(i<j)
            swap(nums,i++,j--);
    }
}
