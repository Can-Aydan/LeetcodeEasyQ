package decryptStringAlphabetInteger1309;

public class Solution {
	public String freqAlphabets(String s) {
		String result = "";
		int i = 0;
		while (i < s.length()) {
			if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
				result += (char) (Integer.valueOf(s.substring(i, i + 2)) + 'a' - 1);
				i += 3;
			} else {
				result += (char) ((s.charAt(i) - '0') + 'a' - 1);
				i += 1;
			}
		}
		return result;
	}
}
