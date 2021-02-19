package tutorial.ds.ll;

import java.util.Scanner;

public class LinkedListTest {
	
	Node head;

	public static void main(String[] args) {
		
		LinkedListTest list = new LinkedListTest();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		list.head.nextNode=second;
		second.nextNode=third;
		
		int choice,item;
		Scanner input = new Scanner(System.in);
		do {
			// list.display();
			 System.out.println("\nEnter the item which you want to insert?\n");  
			 item = input.nextInt();
			 begInsert(item);
			 System.out.println("\nPress 0 to insert more?\n");
			 choice=input.nextInt();
		}while(choice==0);
	}
	
	/*public void display() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data+"\n");
			node=node.nextNode;
		}
	}*/
	
	static void begInsert(int item) {
		Node current = 
		
	}
}
