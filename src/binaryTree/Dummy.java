package binaryTree;

import java.util.Scanner;

public class Dummy {
	
	public Dummy() {
		
	}
	private static class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node root;
	
	public void populate(Scanner sc) {
		System.out.println("Enter the root node value:");
		int value = sc.nextInt();
		populate(sc, root);
	}
	
	private void populate(Scanner sc, Node node) {
		System.out.println("Do you want to enter left of " + node.value);
		boolean left = sc.nextBoolean();
		if(left) {
			System.out.println("Enter the value of the left of " + node.value);
			int value = sc.nextInt();
			node.left = new Node(value);
			populate(sc, node.left);
		}
		
		System.out.println("Do you want to enter right of " + node.value);
		boolean right = sc.nextBoolean();
		if(right) {
			System.out.println("Enter the value of the right of " + node.value);
			int value = sc.nextInt();
			node.right = new Node(value);
			populate(sc, node.right);
		}
	}
}