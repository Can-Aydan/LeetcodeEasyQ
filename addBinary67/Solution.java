package addBinary67;

public class Solution {
	public String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int sum, carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;
		while (i >= 0 && j >= 0) {
			sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				sum += b.charAt(j) - '0';
				j--;
			}
			result.insert(0, sum % 2);
			carry = sum / 2;
		}
		if (carry > 0) {
			result.insert(0, 1);
		}
		return result.toString();
	}
}
