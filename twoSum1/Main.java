package twoSum1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int nums[] = { 2, 5, 5, 11 };
		int target = 10;
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.twoSum(nums, target)));
	}

}
