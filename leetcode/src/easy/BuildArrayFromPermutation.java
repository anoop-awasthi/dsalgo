package easy;

import utils.ArrayUtils;

/**
 * @author Anoop Awasthi
 * @since 2021-10-10 20:12:39.396
 * @see https://leetcode.com/problems/build-array-from-permutation/
 */
public class BuildArrayFromPermutation {

	public static void main(String[] args) {

		int[] nums = new int[] { 0, 2, 1, 5, 3, 4 };

		ArrayUtils.printArray(BuildArrayFromPermutation.buildArray(nums));

	}

	/**
	 * @apiNote Time Complexity O(N) with Extra Space
	 * @param nums
	 * @return
	 */
	public static int[] buildArray(int[] nums) {

		int[] output = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			output[i] = nums[nums[i]];
		}
		return output;
	}

}
