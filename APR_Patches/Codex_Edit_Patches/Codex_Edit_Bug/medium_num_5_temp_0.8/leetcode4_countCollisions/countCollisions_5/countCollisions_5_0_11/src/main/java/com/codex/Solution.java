package com.codex;

import java.util.*;

public class Solution {
import java.util.LinkedList;
import java.util.Queue;

class Solution{

	public static class Node{
		int value;
		Node left, right;

		Node(int value){
			this.value = value;
		}
	}
	public static void main(String args[]){

		Node n = new Node(5);
		n.left = new Node(3);
		n.right = new Node(7);
		n.left.left = new Node(1);
		n.right.right = new Node(9);
		n.left.left.left = new Node(0);
		n.right.right.right = new Node(10);
		n.right.right.left = new Node(8);
		n.right.right.right.right = new Node(12);
		n.right.right.left.left = new Node(6);
		Node t = new Node(4);
		t.left = new Node(2);
		t.right = new Node(5);
		t.right.right = new Node(7);
		t.right.right.right = new Node(9);

		System.out.println(isSubtree(n, t));


	}
	public static boolean isSubtree(Node n, Node t){
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);

		while(!q.isEmpty()){
			Node node = q.remove();
			if(node == null)
				continue;

			if(node.value == t.value){
				if(matches(node, t))
					return true;
			}

			q.add(node.left);
			q.add(node.right);
		}

		return false;
	}
	public static boolean matches(Node treeOne, Node treeTwo){
		
		if(treeOne == null && treeTwo == null)
			return true;

		if(treeOne == null || treeTwo == null)
			return false;

		if(treeOne.value != treeTwo.value)
			return false;

		return matches(treeOne.left, treeTwo.left) && matches(treeOne.right, treeTwo.right);
	}
}

    
}