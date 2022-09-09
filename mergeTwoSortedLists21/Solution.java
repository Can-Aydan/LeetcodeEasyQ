package mergeTwoSortedLists21;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		ListNode head = new ListNode();
		ListNode temp = new ListNode();
		head = list1;
		if (list1.val > list2.val) {
			head = list2;
			list2 = list2.next;
		} else {
			list1 = list1.next;
		}
		temp = head;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			temp = temp.next;
		}
		if (list1 != null) {
			temp.next = list2;
		} else {
			temp.next = list1;
		}
		return head;
	}
}
