package richestCustomerWealth1672;

public class Solution {
	public int maximumWealth(int[][] accounts) {
		int wealth = 0;
		for (int[] cust : accounts) {
			int temp = 0;
			for (int money : cust) {
				temp += money;
			}
			wealth = Math.max(wealth, temp);
		}
		return wealth;
	}
}
