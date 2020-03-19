package com.examples;
import java.io.*;

// declare tree node
class TreeNode{
	protected int value;
	protected TreeNode leftNode;
	protected TreeNode rightNode;
	
	// constructor
	public TreeNode(int val) {
		this.value = val;
		this.leftNode = null;
		this.rightNode = null;
	}
}

// declare binary tree
class BinaryTree{
	public TreeNode rootNode; // 根節點
	
	// constructor
	public BinaryTree(int[] data) {
		this.rootNode = null;
		for(int i=0; i<data.length; i++) {
			addNodeToTree(data[i]);
		}
	}
	
	public void addNodeToTree(int value) {
		TreeNode currentNode = this.rootNode;
		
		if(this.rootNode == null) { // create rootNode
			this.rootNode = new TreeNode(value);
			return ;
		}
		
		// 有root，開始建立 binary tree
		while(true) {
			if(value < currentNode.value) {
				if(currentNode.leftNode==null) { // put to left
					currentNode.leftNode = new TreeNode(value);
					return ;
				}
				else {
					currentNode = currentNode.leftNode; // move to left
				}
			}
			else {
				if(currentNode.rightNode==null) { // put to right
					currentNode.rightNode = new TreeNode(value);
					return ;
				}
				else {
					currentNode = currentNode.rightNode; // move to right
				}
			}
		}
		
		
	}
	
	public void show() {
		this.sub_show(this.rootNode);
	}
	
	private void sub_show(TreeNode currentNode) {
		
		if(currentNode==null)
			return ;
		
		System.out.print(currentNode.value + ", ");
		this.sub_show(currentNode.leftNode);
		this.sub_show(currentNode.rightNode);
		
		
	}
	
}

public class ex9_TreeNode1 {

	public static void main(String[] args) throws IOException {
		int numOfData = 5;
		int data[] = new int[numOfData];
		int temp_data;
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter " + numOfData + " data");
		for(int i=0; i<numOfData; i++) {
			System.out.print((i+1) + " : ");
			data[i] = Integer.parseInt(buf.readLine());
		}
		
		BinaryTree binaryTree = new BinaryTree(data);
		binaryTree.show();
		
		System.out.println("program ended.");
		
	}

}
