package ds.linkedlist;

import ds.udemy.ds.linkedlist.node.SingleNode;

public class SingleLinkedList {

	private SingleNode head;
	private SingleNode tail;
	private int size;// denotes size of list
	
	public SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1; // size = 1
		return head;
	}
	
	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean existLinkedList() {
		// if head is not null retrun true otherwise return false
		return head != null;
	}
	//Traverses Linked List
	void traverseLinkedList() {
		if(existLinkedList()) {
			SingleNode tempNode = head;
			for(int i=0;i<getSize();i++) {
				System.out.println(tempNode.getValue());
				if(i != getSize() - 1) {
					System.out.println("->");
				}
				tempNode = tempNode.getNext();
			}
		}else {
			System.out.println("Linked List does not exists !");
		}
		System.out.println("/n");
	}
	
	//Searches a node with given value
	boolean searchNode(int nodeValue) {
		if(existLinkedList()) {
			SingleNode tempNode = head;
			for(int i=0;i<getSize();i++) {
				if(tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at location: "+i+"\n");
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! \n");
		return false;
	}
	//Deletes entire Linked List
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		tail = null;
		System.out.println("Linked List deleted successfully !");
	}
}
