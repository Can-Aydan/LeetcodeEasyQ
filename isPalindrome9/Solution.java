package isPalindrome9;

public class Solution {
	public boolean isPalindrome(int x) {
		boolean isTrue = false;
		int rev = 0, temp, rem;
		temp = x;
		while (x > 0) {
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}
		if (temp == rev)
			isTrue = true;
		return isTrue;
	}
}
