package fizzBuzz412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> fizzBuzz(int n) {
		List<String> ans = new ArrayList<String>(n);

		for (int i = 1; i <= n; i++) {
			String currStr = "";
			if (i % 3 == 0) {
				currStr += "Fizz";
			}
			if (i % 5 == 0) {
				currStr += "Buzz";
			}
			if (currStr.isEmpty()) {
				currStr += String.valueOf(i);
			}
			ans.add(currStr);
		}
		return ans;
	}
}
