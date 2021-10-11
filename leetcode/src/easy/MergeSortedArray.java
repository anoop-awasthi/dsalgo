package easy;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * @author Anoop Awasthi
 * @since 2021-10-11 23:23:57.657
 * @link https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = new int[] { 2, 5, 6 };
		int n = 3;

		merge(nums1, m, nums2, n);

		ArrayUtils.printArray(nums1);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				nums1[m + i] = nums2[i];
			}
		}
		Arrays.sort(nums1);
	}

}
