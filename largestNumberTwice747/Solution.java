package largestNumberTwice747;

public class Solution {
	public int dominantIndex(int[] nums) {
		int max=0,temp=0,index=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				temp=max;
				max=nums[i];
				index=i;
			}else if(nums[i]>temp) {
				temp=nums[i];
			}
		}
		if(max<2*temp) {
			return -1;
		}else {
			return index;
		}
	}
}
