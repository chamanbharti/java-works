package ds.books.linkedlist;


public class LinkedListDemo0 {

	 class Node {
		 int data;
		 Node next;
		 public Node(int data) {
			 this.data = data;
		 }
	 }
	 
	 Node head;
	 Node tail;
	 int size = 0;
	 
	 //add node
	 public  void add(int data) {
		 Node newNode = new Node(data);
		 if(head == null) {
			 head = newNode;
			 tail = newNode;
		 }else {
			 tail.next = newNode;
			 tail = newNode;
		 }
		 size++;
		 System.out.println(this);
	 }
	 //add node at specific position
	 public void add(int data,int index) {
		 if(index<0 || index > (size-1)) {
			 return;
		 }
		 Node curr = head;
		 Node prev = null;
		 int i = 0;
		 while(curr != null && i != index) {
			 prev = curr;
			 curr = curr.next;
			 i++;
		 }
		 Node newNode = new Node(data);
		 if(prev == null) {
			 newNode.next = head;
			 head = newNode;
		 }else {
			 prev.next = newNode;
			 newNode.next = curr;
		 }
		 size++;
		 System.out.println(this); 
	 }
	 @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node curr = head;
		while(curr != null) {
			sb.append(curr.data).append(",");
			curr = curr.next;
		}
		if(sb.length()>1) {
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	 public static void main(String[] args) {
		 LinkedListDemo0 ll = new LinkedListDemo0();
		 ll.add(10);
		 ll.add(20);
		 ll.add(30);
		 ll.add(50, 0);
		 ll.add(40, 2);
		 ll.add(40, 2);
		 System.out.println(ll);
	}
}
