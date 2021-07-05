/*
4.Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Yun-Chi Hsiao
Jul.4th.2021
 */

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length, size2 = nums2.length;
        int[] combine = new int[(size1+size2)/2+1];
        int index = 0, m = 0, n = 0;

        while (m < size1 && n < size2 && index <= (size1+size2)/2) {
            if (nums1[m] < nums2[n]) {
                combine[index] = nums1[m];
                m++;
            } else {
                combine[index] = nums2[n];
                n++;
            }
            index++;
        }

        while (m < size1 && index <= (size1+size2)/2) {
            combine[index] = nums1[m];
            m++;
            index++;
        }

        while (n < size2 && index <= (size1+size2)/2) {
            combine[index] = nums2[n];
            n++;
            index++;
        }

        if ((size1+size2)%2 == 0) {
            return (double)(combine[index-1]+combine[index-2])/2;
        } else {
            return combine[index-1];
        }
    }
}
