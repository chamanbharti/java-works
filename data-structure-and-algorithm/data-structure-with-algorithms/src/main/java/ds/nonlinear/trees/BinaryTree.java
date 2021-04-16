package ds.nonlinear.trees;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		root = first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
		
		third.left=sixth;
		third.right=seventh;
		
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) return;// base case
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void preOrderByIterative() {
		if(root == null) return;// base case
		Stack<TreeNode>stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) return; // base case
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void inOrderByIterative() {
		if(root == null) return;// base case
		Stack<TreeNode>stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}else {
				temp = stack.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}
	}
	
	public void postOrder(TreeNode root) {
		if(root == null)return;//base case
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public void postOrderByIterative() {
		TreeNode current = root;
		Stack<TreeNode>stack = new Stack<>();
		while(current!= null || !stack.isEmpty()) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			}else {
				TreeNode temp = stack.peek().right;
				if(temp == null) {
					temp = stack.pop();
					System.out.print(temp.data+" ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data+" ");
					}
				}else {
					current = temp;
				}
			}
		}
	}
	//Level order traversal / Breadth First traversal
	public void levelOrderTraversal() {
		if(root == null) return;
		Queue<TreeNode>queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
	public void printBredthFirst() {
		if(root == null) return;
		ArrayDeque<TreeNode>queue = new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			System.out.print(temp.data+" ");
			if(temp.left != null) {
				queue.add(temp.left);
			}
			if(temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
	
	public int findMax(TreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int max = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left > max) {
			max = left;
		}if(right > max) {
			max = right;
		}
		return max;
	}
	
	public int findMin(TreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int min = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left < min) {
			min = left;
		}if(right < min) {
			min = right;
		}
		return min;
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		
		System.out.println("Pre Order using Recursion");
		bt.preOrder(bt.root);
		System.out.println("\nPre Order using Iterative");
		bt.preOrderByIterative();
		
		System.out.println("\nIn Order using Recursion");
		bt.inOrder(bt.root);
		System.out.println("\nIn Order using Iterative");
		bt.inOrderByIterative();
		
		System.out.println("\nPost Order using Recursion");
		bt.postOrder(bt.root);
		System.out.println("\nPost Order using Iterative");
		bt.postOrderByIterative();
		
		System.out.println("\nLevel Order Traversal");
		bt.levelOrderTraversal();
		System.out.println("\nBredth First Traversal");
		bt.printBredthFirst();
		System.out.println("\nHow to find Maximum value in a Binary Tree");
		System.out.println(bt.findMax(bt.root));
		System.out.println("\nHow to find Minimum value in a Binary Tree");
		System.out.println(bt.findMin(bt.root));
	}
}
