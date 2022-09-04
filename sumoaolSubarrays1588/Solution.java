package sumoaolSubarrays1588;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
    	int result=0;
    	for(int i=0;i<arr.length;i++) {
    		int leftPtr = i+1;
    		int rightPtr = arr.length-i;
    		int totalSubarrays = leftPtr*rightPtr;
    		int oddSubarrays = totalSubarrays/2;
    		if(totalSubarrays%2 != 0) {
    			oddSubarrays++;
    		}
			result+=oddSubarrays*arr[i];
    	}
    	return result;
    }
}
