package easy;

import java.util.HashMap;
import java.util.Map;

import utils.ArrayUtils;

/**
 * @author Anoop Awasthi
 * @since 2021-10-10 19:57:03.289
 * @see https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;

		ArrayUtils.printArray(TwoSum.find(nums, target));

		ArrayUtils.printArray(TwoSum.findOptimized(nums, target));

	}

	/**
	 * @apiNote Brute Force Approach with Time O(N2)
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int[] find(int[] nums, int target) {

		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
				}
			}

		}
		return output;
	}

	/**
	 * @apiNote Optimization using HashMap with Time O(N)
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] findOptimized(int[] nums, int target) {

		Map<Integer, Integer> hash_map = new HashMap<>();
		hash_map.put(nums[0], 0);
		for (int i = 1; i < nums.length; ++i) {
			int complement = target - nums[i];
			if (hash_map.containsKey(complement)) {
				return new int[] { i, hash_map.get(complement) };
			}
			hash_map.put(nums[i], i);
		}
		return null;
	}
}
