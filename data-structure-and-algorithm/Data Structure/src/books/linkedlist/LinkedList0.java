package books.linkedlist;

public class LinkedList0 {

	Node head;//head of list
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	//this function prints contents of the linked list strating from head
	public void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data+"\n");
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList0 list = new LinkedList0();
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		list.head.next=second;//Link first node with second node
		second.next=third;//Link third node with the second node
		list.display();
	}
}
