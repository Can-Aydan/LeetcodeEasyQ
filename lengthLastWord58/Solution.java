package lengthLastWord58;

public class Solution {
	public int lengthOfLastWord(String s) {
		int length = 0;
		for (String str : s.split(" ")) {
			if (str != " ") {
				length = str.length();
			}
		}
		return length;
	}
}
