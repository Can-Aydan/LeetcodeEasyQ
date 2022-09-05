package matrixDiagonalSum1572;

public class Solution {
	public int diagonalSum(int[][] mat) {
		int result = 0;
		int middle = mat.length / 2;
		if (mat.length % 2 != 0) {
			result -= mat[middle][middle];
		}
		for (int i = 0; i < mat.length; i++) {
			result += mat[i][i] + mat[i][mat.length - 1 - i];
		}
		return result;
	}
}
