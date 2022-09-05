package reshapeMatrix566;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int r = 1, c = 4;
		int[][] mat = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepToString(sol.matrixReshape(mat, r, c)));
	}

}
