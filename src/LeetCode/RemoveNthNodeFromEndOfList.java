package LeetCode;

import java.util.ArrayList;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ArrayList<ListNode> fixQueue = new ArrayList<ListNode>();
		int fixQueueLength = n + 1;
		ListNode currentNode = head;

		while (currentNode != null) {
			fixQueue.add(currentNode);
			if (fixQueue.size() > fixQueueLength) {
				fixQueue.remove(0);
			}
			currentNode = currentNode.next;
		}
		fixQueue.get(fixQueueLength - 1).next = fixQueue.get(fixQueueLength - 3);
		
		return head;
	}
}