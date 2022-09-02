package findTheDifference389;

public class Solution {
    public char findTheDifference(String s, String t) {
		char additionChar = 0;
		for (int i = 0; i < t.length(); i++) {
			additionChar += t.charAt(i);
			if (i < t.length() - 1) {
				additionChar -= s.charAt(i);
			}
		}			
		return additionChar;
    }
}
