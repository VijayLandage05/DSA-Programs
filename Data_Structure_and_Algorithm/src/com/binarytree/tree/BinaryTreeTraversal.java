package com.binarytree.tree;

public class BinaryTreeTraversal {
	public Node root;
		
		public void printPreorder(Node node) {
			if(node == null) {
				return;
			}
			System.out.print(node.key+" ");
			printPreorder(node.left);
			printPreorder(node.right);
		}
		public void printInorder(Node node) {
			if(node == null) {
				return;
			}
			printInorder(node.left);
			System.out.print(node.key+" ");
			printInorder(node.right);
		}
		public void printPostorder(Node node) {
			if(node == null) {
				return;
			}
			printPostorder(node.left);
			printPostorder(node.right);
			System.out.print(node.key+" ");
		}
}
