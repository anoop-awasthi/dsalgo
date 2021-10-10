package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anoop Awasthi
 * @since 2021-10-10 21:40:46.704
 * @link https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println(ContainsDuplicate.containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> uniqueSet = new HashSet<>();
		for (int num : nums) {
			if (!uniqueSet.add(num)) {
				return true;
			}
		}
		return false;
	}
}
