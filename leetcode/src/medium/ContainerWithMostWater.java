package medium;

/**
 * @author Anoop Awasthi
 * @since 2021-10-10 21:05:42.536
 * @link https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println(ContainerWithMostWater.maxArea(nums));
	}

	public static int maxArea(int[] height) {

		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			int currentArea = Math.min(height[left], height[right]) * (right - left);
			maxArea = Math.max(maxArea, currentArea);

			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxArea;
	}
}
