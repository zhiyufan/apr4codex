package com.codex;

import java.util.*;

public class Solution {
/**
 *
 * @author Shubham
 */
class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
 
public class BinaryTree {
    Node root;
 
    int maxDepth(Node node) {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
 
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
 
    void printLevelOrder() {
        int h = maxDepth(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }
 
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
 
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}
}