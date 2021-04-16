package ds.nonlinear.trees;

import java.util.Scanner;

public class Tree {

	static Scanner input = null;
	
	static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = input.nextInt();
		if(data == -1) return null;
		root = new Node(data);
		
		System.out.println("Enter left for "+data);
		root.left = createTree();
		
		System.out.println("Enter right for "+data);
		root.right = createTree();
		
		return root;
	}
	
	public static Node createTree(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = createTree(root.left, data);
                root.left = cur;
            } else {
                cur = createTree(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		inOrder(root.left);
		inOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
}
