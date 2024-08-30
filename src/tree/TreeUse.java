package tree;

import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter root node");
		int n = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		
		System.out.println("Enter children of " + n);
		int noOfChild = sc.nextInt();
		
		for(int i = 0; i<noOfChild; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
		
		
	}

	public static void main(String[] args) {
		
		TreeNode<Integer> root = takeInput();
		System.out.println(root.data);
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(8);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//		
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		
//		System.out.println(root);

	}

}
