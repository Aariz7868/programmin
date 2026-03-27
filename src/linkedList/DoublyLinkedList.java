package linkedList;

public class DoublyLinkedList {
	
	Node head;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	// Add method now in DoublyLinkedList class
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	public void printForward() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void printBackward() {
		if (head == null) {
			System.out.println("null");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != null) {
			System.out.print(temp.value + " --> ");
			temp = temp.prev;
		}
		System.out.println("null");
	}
}
