package findPivotIndex724;

public class Solution {
	public int pivotIndex(int[] nums) {
		int total=0,leftTotal=0;
		for(int i:nums) {
			total+=i;
		}
		for(int i=0;i<nums.length;i++) {
			if(leftTotal==total-leftTotal-nums[i]) {
				return i;
			}
			leftTotal+=nums[i];
			
		}
		return -1;
	}
}
