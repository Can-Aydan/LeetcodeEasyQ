package mergeStringsAlternately1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0, j = 0; // index of words
		while (i < word1.length() && j < word2.length()) {
			stringBuilder.append(word1.charAt(i));
			i++;
			stringBuilder.append(word2.charAt(j));
			j++;
		}
		while (i < word1.length()) {
			stringBuilder.append(word1.charAt(i));
			i++;
		}
		while (j < word2.length()) {
			stringBuilder.append(word2.charAt(j));
			j++;
		}
		return stringBuilder.toString();
    }
}
