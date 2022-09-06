package longestCommonPrefix14;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		String output = "";
		int min = strs[0].length();
		for (int i = 0; i <= strs.length - 1; i++) {
			min = Math.min(min, strs[i].length());
		}
		for (int i = 0; i < min; i++) {
			char prefix = strs[0].charAt(i);
			for (String str : strs) {
				if (str.charAt(i) != prefix) {
					return output;
				}
			}
			output = output + prefix;
		}
		return output;
	}
}
