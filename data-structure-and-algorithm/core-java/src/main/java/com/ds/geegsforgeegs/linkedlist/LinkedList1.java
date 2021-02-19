package ds.geegsforgeegs.linkedlist;

public class LinkedList1 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void pushAtBeginning(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public void append(int data) {
		//allocate the node and put in the data, set next as null
		Node node = new Node(data);
		//if the linked list is empty, then make the new node as head
		if(head == null) {
			head = new Node(data);
			return;
		}
		//this new node is going to be last node, so make next of it as null
		node.next=null;
		//else traverse till the last node
		Node last = head;
		while(last.next != null) 
			last = last.next;
		//change the next of last node
		last.next=node;
		return;
		
	}
	public void pushAtSpecificPosition(Node previousNode,int data) {
		//check if the given node is null
		if(previousNode == null) {
			System.out.println("The given previous node cannot be null"); 
            return; 
		}
		Node newNode = new Node(data);
		//make next of new node as next of previous node
		newNode.next = previousNode.next;
		//make next of previous node as new node
		previousNode.next = newNode;
		
	}
	public void deleteNodeSpecificKey(int key) {
		//store node head
		Node temp=head,prev=null;
		//if head node itself holds the key to be deleted
		if(temp !=null && temp.data ==key) {
			head = temp.next;//changed head
			return;
		}
		//search for the key to be deleted, keep track of the 
		//previous node as we need to change temp.next
		while(temp!=null && temp.data != key) {
			prev = temp;
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
	 void deleteNode(int position) 
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
	
	     // If position is more than number of nodes 
	     if (temp == null || temp.next == null) 
	         return; 
	
	     // Node temp->next is the node to be deleted 
	     // Store pointer to the next of node to be deleted 
	     Node next = temp.next.next; 
	
	     temp.next = next;  // Unlink the deleted node from list 
	 } 
	 
	 //Returns count of nodes in linked list
	 public int getCount() {
		 Node temp = head;
		 int count = 0;
		 while(temp!=null) {
			 count++;
			 temp = temp.next;
		 }
		 return count;
	 }
	 //recursive way
	 public int getCountRecursive(Node node) {
		 //base case
		 if(node == null)
			 return 0;
		 //count is this node plus rest of the list
		 return 1 + getCountRecursive(node.next);
	 }
	 //Wrapper over getCountRecursive()
	 public int getCount2() {
		 return getCountRecursive(head);
	 }
	 
	 //checks whether the value x is present in linked list
	 public boolean search(Node node, int x) {
		 Node current = head;//initialize current
		 while(current != null) {
			 if(current.data == x) 
				 return true;//data found	
			 current = current.next;
		 }
		 return false;//data not found
	 }
	// Checks whether the value x is present in linked list 
	    public boolean searchRecursive(Node head, int x) 
	    { 
	        // Base case 
	        if (head == null) {
	            return false; 
	        }
	        // If key is present in current node, 
	        // return true 
	        if (head.data == x) {
	            return true; 
	        }
	        // Recur for remaining list 
	        return searchRecursive(head.next, x); 
	    } 
	    
	    //takes index as arguement and return data at index
	    public int GetNth(int index) {
	    	Node current = head;
	    	int count = 0;//index of Node we are currently looking at
	    	while(current != null) {
	    		if(count == index) 
	    			return current.data;
	    		count++;
	    		current = current.next;
	    	}
	    	//if we get to this line, the caller was asking for a non-existent element so we assert fail
	    	assert(false);
	    	return 0;
	    }
	  //takes index as arguement and return data at index
	    public int GetNthRecursive(Node head,int n) {
	    	int count = 1;
	    	if(head ==null)//edge cse if head is null
	    		return -1;
	    	//if count equal too n return node.data
	    	if(count == n)
	    		return head.data;
	    	//recursively decrease n and increase head to next pointer
	    	return GetNthRecursive(head.next, n-1);
	    }
	 
	public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		//Start with the empty list
		LinkedList1 ll = new LinkedList1();
		//insert 6, so linked list becomes 6->null
		ll.append(6);
		//insert 7 at the beginning. so linked list becomes
		//7->6->null
		ll.pushAtBeginning(7);
		//insert 1 at the beginning. so linked list becomes
		//1->7->6->null
		ll.pushAtBeginning(1);
		// Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->null
        ll.append(4); 
        //insert 8, after 7. so linked list becomes
        //1->7->8->6->4->null
        ll.pushAtSpecificPosition(ll.head.next,8);
        ll.deleteNodeSpecificKey(1); // Delete node at position 4 
        System.out.println("\nCreated Linked list is: ");
		ll.printList();
		System.out.println("\nCount of nodes is " + ll.getCount2());
		if(ll.searchRecursive(ll.head,8)) {
			 System.out.println("Yes"); 
		}else {
			 System.out.println("No"); 
		}
		 // Check the count function
        System.out.println("Element at index 3 is "+ll.GetNth(3));
        /* Start with the empty list */
        Node head = null ;
        /* Check the count function */
        System.out.printf("Element at index 3 is %d",ll.GetNthRecursive(head, 3)); 
	}
}
