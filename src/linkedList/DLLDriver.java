package linkedList;

public class DLLDriver {
	public static void main(String[] args) {

		DoublyLinkedList dl = new DoublyLinkedList();
		dl.add(10); // ✅ Fixed
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(50);

		System.out.println("Print Forward");
		dl.printForward(); // ✅ Use "dl", not "d1"
		System.out.println("Print Backward");
		dl.printBackward();
	}
}
