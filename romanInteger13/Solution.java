package romanInteger13;

import java.util.Hashtable;

public class Solution {
	public int romanToInt(String s) {
		int tot = 0;
		Hashtable<Character, Integer> roman = new Hashtable<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		for (int i = 0; i < s.length() - 1; i++) {
			if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
				tot = tot - roman.get(s.charAt(i));
			} else {

				tot = tot + roman.get(s.charAt(i));
			}
		}
		tot = tot + roman.get(s.charAt(s.length() - 1));
		return tot;
	}
}
