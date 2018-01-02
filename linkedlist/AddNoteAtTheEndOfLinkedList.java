package linkedlist;

public class AddNoteAtTheEndOfLinkedList {
	Node Insert(Node head, int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
}
