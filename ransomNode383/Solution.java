package ransomNode383;

import java.util.HashMap;

public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> magLetters = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			int currCount = magLetters.getOrDefault(magazine.charAt(i), 0);
			magLetters.put(magazine.charAt(i), currCount + 1);
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			int currCount = magLetters.getOrDefault(ransomNote.charAt(i), 0);
			if (currCount == 0) {
				return false;
			}
			magLetters.put(ransomNote.charAt(i), currCount - 1);
		}

		return true;
	}
}
