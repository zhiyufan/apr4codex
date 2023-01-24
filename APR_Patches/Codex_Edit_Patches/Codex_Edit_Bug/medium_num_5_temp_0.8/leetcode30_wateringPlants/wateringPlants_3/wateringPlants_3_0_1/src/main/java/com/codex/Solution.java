package com.codex;

import java.util.*;

public class Solution {
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    HashMap<Integer, Integer> map = new HashMap<>();
    int ans = 0;
    
    public int widthOfBinaryTree(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<>();
        recurse(root, array, 0, 0);
        return ans;
    }
    
    void recurse(TreeNode current, ArrayList<Integer> array, int index, int level) {
        if (current == null) {
            return;
        }
        
        if (map.containsKey(level)) {
            array.add(index - map.get(level) + 1);
            ans = Math.max(ans, index - map.get(level) + 1);
        } else {
            map.put(level, index);
        }
        
        recurse(current.left, array, 2 * index, level + 1);
        recurse(current.right, array, 2 * index + 1, level + 1);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Queue<Item> queue = new LinkedList<>();
        queue.add(new Item(root, 0));
        while (!queue.isEmpty()) {
            Item curr = queue.poll();
            TreeNode node = curr.node;
            
            if (node.left != null) {
                Item leftItem = new Item(node.left, curr.index * 2);
                queue.add(leftItem);
            }
            
            if (node.right != null) {
                Item rightItem = new Item(node.right, curr.index * 2 + 1);
                queue.add(rightItem);
            }
            
            if (queue.size() == 1) {
                Item item = queue.peek();
                ans = Math.max(ans, item.index);
            } else if (queue.size() > 1) {
                Item item = queue.peek();
                ans = Math.max(ans, item.index - curr.index + 1);
            } else {
                ans = Math.max(ans, 1);
            }
        }
        return ans;
    }
}

class Item {
    TreeNode node;
    int index;
    
    public Item(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
    }
}