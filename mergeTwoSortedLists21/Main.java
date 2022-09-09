package mergeTwoSortedLists21;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1, 2, 4));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1, 3, 4));
		System.out.println(sol.mergeTwoLists(list1, list2));
	}

}
