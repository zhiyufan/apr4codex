package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
 
class Node 
{ 
    int data; 
    Node left, right; 
    Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
class BinaryTree 
{ 
    Node root; 
    static HashMap<Integer, Queue<Integer>> hm = new HashMap<Integer, 
                                                    Queue<Integer>>(); 
  
    static void levelOrder(Node node, int level) 
    { 
        if (node == null) 
            return; 
  
        Queue<Integer> q = hm.get(level); 
  
        if (q == null) 
            q = new LinkedList<Integer>(); 
  
        q.add(node.data); 
        hm.put(level, q); 
  
        levelOrder(node.left, level + 1); 
        levelOrder(node.right, level + 1); 
    } 
  
    static void reverseLevelOrder(Node node) 
    { 
        levelOrder(node, 1); 
        for (int i = hm.size(); i > 0; i--) 
        { 
            if (hm.get(i) != null) 
                System.out.print(hm.get(i) + " "); 
        }
    }

  
    public static void main(String args[]) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.root.right.left.right = new Node(8); 
        tree.root.right.right.right = new Node(9); 
        tree.root.right.right.left= new Node(10); 
        tree.root.right.right.left.right= new Node(11); 
        tree.root.right.right.left.right.right= new Node(12); 
        System.out.println("Spiral Order traversal of Binary Tree is"); 
        reverseLevelOrder(tree.root); 
    } 
} 
}