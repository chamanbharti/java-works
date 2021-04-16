package ds.nonlinear.trees;

import java.util.Scanner;

public class Tree2 {

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	public static void preOrder(Node root) {
	        if(root == null) return;
	         System.out.print(root.data+" ");
	         preOrder(root.left);
	         preOrder(root.right);
	       
		/*if(root == null) return;// base case
	        Stack<Node>stack = new Stack<>();
	        stack.push(root);
	        while(!stack.isEmpty()) {
	            Node temp = stack.pop();
	            System.out.print(temp.data+" ");
	            if(temp.right != null) {
	                stack.push(temp.right);
	            }
	            if(temp.left != null) {
	                stack.push(temp.left);
	            }
	        }
	        */
	    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter data into tree");
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}
