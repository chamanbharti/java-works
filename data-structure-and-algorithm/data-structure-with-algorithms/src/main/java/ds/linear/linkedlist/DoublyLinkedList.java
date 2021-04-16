package ds.linear.linkedlist;

import ds.linear.linkedlist.LinkedList.Node;

public class DoublyLinkedList {

	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	Node tail;
	int size = 0;

	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	
	public void add(int data,int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("Index out of range");
			return;
		}
		Node newNode = new Node(data);
		Node current = findNode(index);
		
		Node prevNode = current.prev;
		if(current == head) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}else {
			prevNode.next = newNode;
			newNode.prev = prevNode;
			newNode.next = current;
			current.prev = newNode;
		}
		size++;
	}
	
	public void remove(int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("index out of range");
			return;
		}
		Node current = findNode(index);
		
		Node prevNode = current.prev;
		Node nextNode = current.next;
		
		if(current == head) {
			head = head.next;
			head.prev = null;
		}else if(current == tail) {
			prevNode.next = null;
			tail = prevNode;
		}else {
			prevNode.next = nextNode;
			nextNode.prev = prevNode;
		}
		current.next  = current.prev = null;
		size--;
	}
	public void removeObject(int data) {
		Node current = head;
		while(current != null && current.data != data) {
			current = current.next;
		}
		if(current == null) {
			System.out.println("Target Data Not Found");
			return;
		}
		
		Node prevNode = current.prev;
		Node nextNode = current.next;
		
		if(current == head) {
			head = head.next;
			head.prev = null;
		}else if(current == tail) {
			prevNode.next = null;
			tail = prevNode;
		}else {
			prevNode.next = nextNode;
			nextNode.prev = prevNode;
		}
		current.next  = current.prev = null;
		size--;
	}
	
	public void set(int data,int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("index out of range");
		}
		Node target = findNode(index);
		target.data = data;
	}
	
	public int  get(int index) {
		if(index < 0 || index > (size - 1)) {
			System.out.println("Index out of Bound");
			return Integer.MIN_VALUE;
		}
//		int mid = (size - 1)/2;
//		Node target = null;
//		if(mid > index) {
//			//find forward direction
//			target = findForward(index);
//		}else {
//			//find reverse direction
//			target = findReverse(index);
//		}
		Node target = findNode(index);
		return target.data;
	}
	
	private Node findNode(int index) {
		int mid = (size - 1) / 2;
		if(mid > index) {
			//find forward direction
			return findForward(index);
		}
		//find reverse direction
		return findReverse(index);
	}
	
	private Node findForward(int index) {
		int i = 0;
		Node current = head;
		while(current != null && i != index) {
			current = current.next;
			i++;
		}
		return current;
	}
	
	private Node findReverse(int index) {
		int i = size - 1;
		Node current = tail;
		while(current != null && i != index) {
			current = current.prev;
			i--;
		}
		return current;
	}
	public int indexOf(int data) {
		Node current = head;
		int i = 0;
		while(current != null && current.data != data) {
			current = current.next;
			i++;
		}
		if(current == null) {
			i = -1; // data not found
		}
		return i;
	}
	public int lastIndexOf(int data) {
		Node current = tail;
		int i = size - 1;
		while(current != null && current.data != data) {
			current = current.prev;
			i--;
		}
		if(current == null) {
			i = -1; // data not found
		}
		return i;
	}
	
	public boolean containsOf(int data) {
		return indexOf(data) != -1;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
//		return size == 0;
		return head == null;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node current = head;
		while(current != null) {
			sb.append(current.data).append(",");
			current = current.next;
		}
		if(sb.length() > 1) {
			sb.deleteCharAt(sb.length() -1);
		}
		sb.append("]");
		return sb.toString();
	}
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
//		dll.add(10);
//		dll.add(20);
//		dll.add(30);
//		System.out.println(dll);
//		System.out.println("2 position data will be "+dll.get(4));
//		System.out.println(dll);
//		dll.add(40,1);
//		System.out.println(dll);
//		dll.remove(0);
//		System.out.println(dll);
//		dll.add(50);
//		System.out.println(dll);
//		dll.removeObject(50);
		
		dll.add(40);
		dll.add(10);
		dll.add(10);
		dll.add(20);
		System.out.println("Index of 10 will be "+dll.indexOf(10));
		System.out.println("Last Index of 10 will be "+dll.lastIndexOf(10));
		System.out.println("Is 20 contains in the list: "+dll.containsOf(20));
		System.out.println("Size of the list: "+dll.size());
//		dll.clear();
//		System.out.println("Size of the list: "+dll.size());
//		System.out.println("Is the list empty: "+dll.isEmpty());
		dll.set(50, 3);
		System.out.println(dll);
		
	}
}
