package books.geegsforgeegs.linkedlist;

import java.util.Scanner;

import books.linkedlist.Node;

public class LinkedList {

	Node head;//head of list
	
	//Linked list node
	static class Node{
		int data;
		Node next;
		//constructor to create a new node
		//next is by default initialized as null
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	//Inserts a new Node at front of the list.
	//Time complexity of push() is O(1) as it does constant amount of work.
	public void InsertAtFront(int new_data) {
		/* 1 & 2 : Allocate the Node & Put in the data*/
		Node new_node = new Node(new_data);
		//make next of new node as head
		new_node.next=head;
		//move the head to point to new Node
		head = new_node;
		
	}
	
	/* Appends a new node at the end.  This method is  
    defined inside LinkedList class shown above */
   public void InsertAtLast(int new_data) {
	   /* 1. Allocate the Node & 
       2. Put in the data 
       3. Set next as null */
	   Node new_node = new Node(new_data);
	   //4. if linked list is empty, then make the new node as head
	   if(head == null) {
		   head=new Node(new_data);
		   return;
	   }
	   //4. this new node is going to be the last node, so make next of it as null
	   new_node.next = null;
	   
	   //5. else traverse till the last node
	   Node last = head;
	   while(last.next != null) {
		   last = last.next;
	   }
	   //6. change the next of last node
	   last.next = new_node;
	   return;
   }
   
   /* Inserts a new node after the given prev_node. */
   public void insertAfter(Node pre_node,int new_data) {
	   // 1. check if the given node is null
	   if(pre_node == null) {
		   System.out.println("The given previous node cannot be null"); 
           return; 
	   }
	   /* 2 & 3: Allocate the Node & 
       Put in the data*/
	   Node new_node = new Node(new_data);
	   // 4. make next of new Node as next of pre_node
	   new_node.next = pre_node.next;
	   // 5. make next of pre_node as new_node
	   pre_node.next = new_node;
   }
	//this method prints contents of linked list starting from head
	/*public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}*/
	public void printList() {
		Node current;
		current = head;
		if(current == null) {
			System.out.println("Empty List...");
		}else {
			//System.out.println("Printing Values...\n");
			while(current!=null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
	}
	
public void search() {
		Node current;
		int item,i=0,flag=0;
		current = head;
		if(current ==null) {
			System.out.println("Empty List...");
		}else {
			
			System.out.println("\nEnter item which you want to search\n");
			int searchItem=new Scanner(System.in).nextInt();
			while(current != null) {
				if(current.data == searchItem) {
					System.out.println("Item fount at location:"+i);
					flag=0;
					//break;
				}else {
					flag=1;
				}
				i++;
				current = current.next;
			}
			if(flag == 1) {
				System.out.println("Item not found\n");
			}
		}
	}

//Checks whether the value x is present in linked list 
public boolean search(Node head,int x) {
	Node current = head;
	while(current!=null) {
		if(current.data==x)
			return true; //data found
		current = current.next;
	}
	return false;//data not found
}
	//find the length of Node
	public int length() {
		int count=0;
		Node node = this.head;
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
	
	// find the length using Recursion
	public int length(Node node) {
		if(node == null) {
			return 0;
		}
		return 1 + length(node.next);
	}
	/* Wrapper over length(Node node) */
	public int getCount() {
		return length(head);
	}
	
	//Given a key, deletes the first occurence of key in linked list
	void deleteNodeByNode(int key) {
		//store head node
		Node temp = head,prev=null;
		//if head node itself holds the key to be deleted
		if(temp !=null && temp.data == key) {
			head = temp.next;//changed head
			return;
		}
		//search for the key to be deleted keep track of the previous node as we need to change temp.next
		while(temp != null && temp.data != key) {
			prev=temp;
			temp = temp.next;
		}
		//if key was not present in linked list
		if(temp == null)
			return;
		//unlink the node from linked list
		prev.next=temp.next;
	}
	
	 /* Given a reference (pointer to pointer) to the head of a list 
    and a position, deletes the node at the given position */
 void deleteNodeByIndex(int position) 
 { 
     // If linked list is empty 
     if (head == null) 
         return; 

     // Store head node 
     Node temp = head; 

     // If head needs to be removed 
     if (position == 0) 
     { 
         head = temp.next;   // Change head 
         return; 
     } 

     // Find previous node of the node to be deleted 
     for (int i=0; temp!=null && i<position-1; i++) 
         temp = temp.next; 

     // If position is more than number of ndoes 
     if (temp == null || temp.next == null) 
         return; 

     // Node temp->next is the node to be deleted 
     // Store pointer to the next of node to be deleted 
     Node next = temp.next.next; 

     temp.next = next;  // Unlink the deleted node from list 
   }
 
 //delete entire linked list
 void deleteList() {
	 head=null;
 }
	
	public static void main(String[] args) {
		  /* Start with the empty list. */
		LinkedList list = new LinkedList();
		 list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		/* Three nodes have been allocated  dynamically. 
        We have refernces to these three blocks as first,   
        second and third 

        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  | null |     | 2  | null |     |  3 | null | 
       +----+------+     +----+------+     +----+------+ */
		
	 list.head.next=second;// Link first node with the second node 
	 /*  Now next of first Node refers to second.  So they 
     both are linked. 

	  llist.head        second              third 
	     |                |                  | 
	     |                |                  | 
	 +----+------+     +----+------+     +----+------+ 
	 | 1  |  o-------->| 2  | null |     |  3 | null | 
	 +----+------+     +----+------+     +----+------+ */
	 
	 second.next = third; // Link second node with the third node 
	  
     /*  Now next of second Node refers to third.  So all three 
         nodes are linked. 

      llist.head        second              third 
         |                |                  | 
         |                |                  | 
     +----+------+     +----+------+     +----+------+ 
     | 1  |  o-------->| 2  |  o-------->|  3 | null | 
     +----+------+     +----+------+     +----+------+ */
	 
	 /*  Insert 4 at the beginning. So linked list becomes 
	    
		4>1>2>3>null
     */
     list.InsertAtFront(4); 
    
     // Insert 1 at the beginning. So linked list becomes 
     //5>4>1>2>3>null
     list.InsertAtFront(5); 
     
     
     // Insert 4 at the end. So linked list becomes 
     //5>4>1>2>3>4>null
    list.InsertAtLast(4);
 
     // Insert 0, after 4. So linked list becomes 
     //5>4>0>1>2>3>4>null
     list.insertAfter(list.head.next, 11); 
	 list.printList();//5 4 1 2 3
	 
	 System.out.println("\nLength Of Node:"+list.length());
	 System.out.println("\nLength Of Node:"+list.length(list.head));
	 System.out.println("\nLength Of Node:"+list.getCount());
	 //search
      //list.search();
	 if(list.search(list.head,11))
		 System.out.println("Yes "+" 11 is found");
	 else
		 System.out.println("No 11 is not found");
	 list.deleteNodeByNode(11); // Delete node 11
	 //list.deleteNodeByIndex(2); // Delete node at position 2 
	 System.out.println("\nLinked List after Deletion at position 2:"); 
     list.printList(); 
     
     System.out.println("\nDeleting the list"); 
     list.deleteList(); 
     list.printList(); 
     System.out.println("Linked list deleted"); 
	}
}
