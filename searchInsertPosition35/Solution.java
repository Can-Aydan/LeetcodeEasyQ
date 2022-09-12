package searchInsertPosition35;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int firstIndex, lastIndex, midIndex;
		firstIndex = 0;
		lastIndex = nums.length - 1;
		while (firstIndex <= lastIndex) {
			midIndex = (firstIndex + lastIndex) / 2;
			if (nums[midIndex] == target) {
				return midIndex;
			}
			if (nums[midIndex] < target) {
				firstIndex = midIndex + 1;
			} else {
				lastIndex = midIndex - 1;
			}
		}
		return lastIndex + 1;
	}
}
