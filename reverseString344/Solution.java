package reverseString344;

import java.util.Arrays;

public class Solution {
	public void reverseString(char[] s) {
		int j = s.length - 1;
		char temp = ' ';
		for (int i = 0; i < j; i++) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			j--;
		}
		System.out.println(Arrays.toString(s));
	}
}
