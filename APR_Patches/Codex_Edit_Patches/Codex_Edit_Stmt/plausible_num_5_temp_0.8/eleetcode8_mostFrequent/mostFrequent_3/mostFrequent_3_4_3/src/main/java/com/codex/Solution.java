package com.codex;

import java.util.*;

public class Solution {
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    class Pair{
        TreeNode node;
        int depth;
        Pair(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }        
            
    public boolean isBalanced(TreeNode root) {
        // write your code here
         return maxDepth(root) != -1;
     }

     private int maxDepth(TreeNode root) {
         if (root == null)
         return 0;

         int left = maxDepth(root.left);
         int right = maxDepth(root.right);

         if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
             return -1;
         }
         return Math.max(left, right) + 1;      
}




     }    

    
}