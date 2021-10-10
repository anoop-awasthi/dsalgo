package easy;

/**
 * @author Anoop Awasthi
 * @since 2021-10-10 22:09:33.197
 * @link https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubArray {

	public static void main(String[] args) {

		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(MaximumSubArray.maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}
}
