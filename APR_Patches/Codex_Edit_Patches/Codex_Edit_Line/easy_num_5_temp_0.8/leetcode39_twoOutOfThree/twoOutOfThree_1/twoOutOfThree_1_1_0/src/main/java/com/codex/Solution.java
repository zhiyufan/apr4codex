package com.codex;

import java.util.*;

public class Solution {
    public static boolean isSymmetry(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return isSymmetry(root.left, root.right);
    }
    public static boolean isSymmetry(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        
        if(left == null || right == null){
            return false;
        }
        
        if(left.val == right.val){
            return isSymmetry(left.left, right.right) && isSymmetry(left.right, right.left);
        }else{
            return false;
        }
    }
    
    public static boolean isSymmetry2(TreeNode root) {
        if(root == null){
            return true;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        deque.add(root);
        while(!deque.isEmpty()){
            TreeNode node1 = deque.removeFirst();
            TreeNode node2 = deque.removeFirst();
            if(node1 == null && node2 == null){
                continue;
            }
            if(node1 == null || node2 == null){
                return false;
            }
            if(node1.val != node2.val){
                return false;
            }
        }
        return true;
    }

    
}