package climbingStairs70;

public class Solution {
	public int climbStairs(int n) {
		int previous = 1;
		int current = 1;
		int temp = 0;
		for (int i = 1; i < n; i++) {
			temp = current;
			current += previous;
			previous = temp;
		}
		return current;
	}
}
