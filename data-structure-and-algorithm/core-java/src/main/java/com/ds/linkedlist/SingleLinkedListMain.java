package ds.linkedlist;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.createSingleLinkedList(10);
		list.createSingleLinkedList(20);
		list.createSingleLinkedList(30);
		list.createSingleLinkedList(40);
		list.createSingleLinkedList(50);
		list.createSingleLinkedList(60);
		list.traverseLinkedList();
		list.searchNode(5);
		

		list.deleteLinkedList();
		list.traverseLinkedList();
	}
}
