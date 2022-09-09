package implementstrStr28;

public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle == null || haystack == null) {
			return 0;
		}
		if (needle.length() > haystack.length()) {
			return -1;
		}
		return haystack.indexOf(needle);
	}
}
