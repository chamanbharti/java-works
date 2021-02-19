package ds.geegsforgeegs.linkedlist;

import java.util.Scanner;


public class LinkedList {

	Node head;//head of list
	
	/*Linked list node
	 * Inner class is made so that main() can access it
	 */
	static class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node node = head;
		int i=0;
		while(node !=null) {
			System.out.print("| "+node.data+" | null |");
			i++;
			if(i>0) {
				System.out.print("---->");
			}
			node = node.next;
		}
	}
	//Inserts a new Node at front of the list.
	public void pushAtBeginning(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	//Inserts a new node after the given prev_node.
		public void pushAtEnd(Node prev_node,int new_data) {
			if (prev_node == null) 
	        { 
	            System.out.println("The given previous node cannot be null"); 
	            return; 
	        } 
			Node new_node = new Node(new_data); 
			  
	        /* Make next of new Node as next of prev_node */
	        new_node.next = prev_node.next; 
	  
	        /* make next of prev_node as new_node */
	        prev_node.next = new_node; 
		}
	
	public static void main(String[] args) {
		/*
		 method to create a simple linked list with 3 nodes
		 start with empty list
		*/
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		 /* Three nodes have been allocated dynamically. 
        We have references to these three blocks as head,   
        second and third 

        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  | null |     | 2  | null |     |  3 | null | 
       +----+------+     +----+------+     +----+------+ */
	   ll.head.next = second;//link first node with second node
	   
	   /*  Now next of the first Node refers to the second.  So they 
       both are linked. 

	    llist.head        second              third 
	       |                |                  | 
	       |                |                  | 
	   +----+------+     +----+------+     +----+------+ 
	   | 1  |  o-------->| 2  | null |     |  3 | null | 
	   +----+------+     +----+------+     +----+------+ */
	   
	   second.next = third; // Link second node with the third node 
	   
       /*  Now next of the second Node refers to third.  So all three 
           nodes are linked. 
 
        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  |  o-------->| 2  |  o-------->|  3 | null | 
       +----+------+     +----+------+     +----+------+ */
	   ll.pushAtBeginning(4);
	   ll.printList();
	   
       /*  Now next of the second Node refers to third.  So all three 
           nodes are linked. 
 
        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  |  o-------->| 2  |  o-------->|  3 | null | 
       +----+------+     +----+------+     +----+------+ */
	  ll.pushAtEnd(ll.head.next,5); 
	  ll.printList();
		
	}
	
}
